package DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class XfcSupportDsEntityPK implements Serializable {
    private String xfc;
    private String sds;
    private String param;

    @Column(name = "xfc", nullable = false, length = 64)
    @Id
    public String getXfc() {
        return xfc;
    }

    public void setXfc(String xfc) {
        this.xfc = xfc;
    }

    @Column(name = "sds", nullable = false, length = 64)
    @Id
    public String getSds() {
        return sds;
    }

    public void setSds(String sds) {
        this.sds = sds;
    }

    @Column(name = "param", nullable = false, length = 32)
    @Id
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XfcSupportDsEntityPK that = (XfcSupportDsEntityPK) o;

        if (xfc != null ? !xfc.equals(that.xfc) : that.xfc != null) return false;
        if (sds != null ? !sds.equals(that.sds) : that.sds != null) return false;
        if (param != null ? !param.equals(that.param) : that.param != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xfc != null ? xfc.hashCode() : 0;
        result = 31 * result + (sds != null ? sds.hashCode() : 0);
        result = 31 * result + (param != null ? param.hashCode() : 0);
        return result;
    }
}
