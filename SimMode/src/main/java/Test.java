import DB.XfcContractEntity;
import Service.WorkDataService;
import Service.XfcService;
import SimBusiness.WorkClass;
import SimBusiness.WorkData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.SimpleFormatter;

public class Test {
    public static void main(String[] args) throws IOException {

//      String a="{\"name\":\"张三\",\"age\":23,\"addr\":\"北京\"}";
//            ObjectMapper mapper = new ObjectMapper();
//            Map<String,String> map = mapper.readValue(a, Map.class);
//        map.put("aa", "bb");
        WorkDataService workDataService = new WorkDataService();
        for (int i = 0; i < 10; i++) {
            workDataService.insertWorkData(getRandomData());
        }
        System.out.println("Ok!");
        }

    private static WorkData getRandomData() throws JsonProcessingException {
        Random random = new Random();
        WorkData workData = new WorkData();
        workData.setXfc("2018-03-002");
        workData.setTerm("1");
        workData.setAppid("2018-01-002");
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
       // map.put("phone", "13000" + random.nextInt(8768767));
        map.put("custCertNo", random.nextInt(99999) + "330824" + random.nextInt(1238273189));
        map.put("appid", "2018-01-002");
        map.put("custName", "李狗蛋"+random.nextInt(999));
        ObjectMapper mapper = new ObjectMapper();
        String params = mapper.writeValueAsString(map);
       // workData.setMap(map);
        workData.setParam(params);
        return workData;
    }
    }


