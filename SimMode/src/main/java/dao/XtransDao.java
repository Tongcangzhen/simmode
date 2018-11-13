package dao;

import DB.XtransInfoEntity;
import DB.XtransLogEntity;

public interface XtransDao {
    int inscertInfo(XtransInfoEntity xtransInfoEntity);

    int updateInfo(String status,String xtrans);

    int inscertLog(XtransLogEntity xtransLogEntity);

}
