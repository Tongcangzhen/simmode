package SimBusiness;

import DB.XfcDatasourceEntity;
import DB.XfcSupportDsEntity;
import Service.WorkDataService;
import Service.XfcService;
import Service.XtransService;
import SimInterface.DataInterface;
import SimInterface.FusionModel;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.resource.spi.work.Work;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class WorkClass {
    XfcService xfcService;
    WorkDataService workDataService;
    TransClass transClass;
    public  void dofun(WorkData workData) {
        transClass = new TransClass();
        transClass.xtransService = new XtransService();
        transClass.updateInfoStatus(workData,"02");
        List<XfcDatasourceEntity> datasources = xfcService.getDataSources(workData.getXfc(),workData.getTerm());


        StringBuilder stringBuilder = new StringBuilder();
        for (XfcDatasourceEntity a : datasources) {
            transClass.insertLog(workData,"02","Query","Datasource",String.valueOf(a.getInstid()));
            Map<String, String> map = getParam(a.getXfc(), a.getSds(), workData);
            String data = DataInterface.getData(a.getXds(), map);
            stringBuilder.append(data);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        transClass.updateInfoStatus(workData,"03");
        System.out.print(FusionModel.fusionMdodel(stringBuilder.toString()));
        transClass.insertLog(workData,"03","Fetch","Fusion Container","2018-02-001");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        transClass.updateInfoStatus(workData,"00");
        String app=xfcService.getPushApp(workData.getXfc(),workData.getTerm());
        System.out.println("已推送App"+app);
        transClass.insertLog(workData,"00","Push","Application",app);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private Map<String, String> getParam(String xfc, String xds,WorkData workData) {
        Map<String, String> map = new ConcurrentHashMap<String, String>();
        List<XfcSupportDsEntity> ls = xfcService.getSupports(xfc, xds);
        for (XfcSupportDsEntity a : ls) {
            map.put(a.getParam(), workData.getMap().get(a.getParam()));
        }
        return map;
    }

    public List<WorkData> getWorkData(Set<Integer> set) {
        List<WorkData> list = new ArrayList<WorkData>();
        list = workDataService.SelectWorkData();
        Iterator<WorkData> iterator = list.iterator();
        while (iterator.hasNext()) {
            WorkData a = iterator.next();
            if (set.contains(a.getId())) {
                iterator.remove();
            }
            set.add(a.getId());
        }

        return list;
    }

    public Map<String, String> getParams(WorkData workData) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, String> a = mapper.readValue(workData.getParams(), Map.class);
        return a;
    }



//    public static void main(String[] args) {
//        WorkClass workClass = new WorkClass();
//        workClass.xfcService = new XfcService();
//        WorkData workData = new WorkData();
//        workData.setXfc("2018-03-001");
//        workData.setTerm("1");
//        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
//        map.put("phone", "130000000");
//        map.put("custCertNo", "12312873681273891");
//        map.put("bankNo", "978972831817686132");
//        map.put("custName", "李狗蛋");
//        workData.setMap(map);
//        workClass.dofun(workData);
//    }
}
