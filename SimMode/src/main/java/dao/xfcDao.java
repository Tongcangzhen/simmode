package dao;

import DB.*;

import java.util.List;

public interface xfcDao {
    XfcContractEntity getXfcContract(String xfc);

    List<XfcDatasourceEntity> getDataSources(String xfc,String xtrem);

    List<XfcSupportDsEntity> getSupports(String xfc, String sds);

    String getPushApp(String xfc,String xtrem);


    //String getTriggerApp(String xfc,String xtrem);
}
