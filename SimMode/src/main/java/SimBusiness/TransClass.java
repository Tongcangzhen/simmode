package SimBusiness;

import DB.XtransInfoEntity;
import DB.XtransLogEntity;
import Service.XtransService;

import java.sql.Timestamp;
import java.util.Date;

public class TransClass {
    XtransService xtransService;
    public  String insertInfo(WorkData workData) {
        XtransInfoEntity a = new XtransInfoEntity();
        String transId=String.valueOf(new Date().getTime());
        a.setXtrans(transId);
        a.setXfc(workData.getXfc());
        a.setTriggerappid(workData.getAppid());
        a.setTrigerterm(workData.getTerm());
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        a.setCreatedt(timestamp);
        a.setStatus("01");
        a.setLastupdate(timestamp);
        xtransService.inscertInfo(a);
        return transId;
    }

    public void updateInfoStatus(WorkData workData,String status) {
        xtransService.updateInfo(workData.getXtrans(), status);
    }

    public void insertLog(WorkData workData, String status,String operation,String type,String id) {
        XtransLogEntity a = new XtransLogEntity();
        a.setXtrans(workData.getXtrans());
        a.setCreatedt(new Timestamp(System.currentTimeMillis()));
        a.setXfc(workData.getXfc());
        a.setXterm(workData.getTerm());
        a.setXstatus(status);
        a.setOperation(operation);
        a.setCoordtype(type);
        a.setCoordentityid(id);
        xtransService.inscertLog(a);
    }
}
