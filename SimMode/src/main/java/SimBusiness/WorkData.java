package SimBusiness;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WorkData {
    private int id;
    private String params;

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getXfc() {
        return xfc;
    }

    public void setXfc(String xfc) {
        this.xfc = xfc;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    private String xfc;
    private String  term;
    private String appid;
    private String xtrans;

    public String getXtrans() {
        return xtrans;
    }

    public void setXtrans(String xtrans) {
        this.xtrans = xtrans;
    }

    private Map<String, String> map;

//    public WorkData() {
//        this.map = new ConcurrentHashMap<String, String>();
//    }
//
//    public WorkData(ConcurrentHashMap<String, String> stringStringConcurrentHashMap) {
//
//    }
}
