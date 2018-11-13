package DB;

import javax.persistence.*;

@Entity
@Table(name = "xfc_support_ds", schema = "jinghang", catalog = "")
@IdClass(XfcSupportDsEntityPK.class)
public class XfcSupportDsEntity {
    private String xfc;
    private String sds;
    private String param;
    private String remark;

    @Id
    @Column(name = "xfc", nullable = false, length = 64)
    public String getXfc() {
        return xfc;
    }

    public void setXfc(String xfc) {
        this.xfc = xfc;
    }

    @Id
    @Column(name = "sds", nullable = false, length = 64)
    public String getSds() {
        return sds;
    }

    public void setSds(String sds) {
        this.sds = sds;
    }

    @Id
    @Column(name = "param", nullable = false, length = 32)
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 40)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XfcSupportDsEntity that = (XfcSupportDsEntity) o;

        if (xfc != null ? !xfc.equals(that.xfc) : that.xfc != null) return false;
        if (sds != null ? !sds.equals(that.sds) : that.sds != null) return false;
        if (param != null ? !param.equals(that.param) : that.param != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xfc != null ? xfc.hashCode() : 0;
        result = 31 * result + (sds != null ? sds.hashCode() : 0);
        result = 31 * result + (param != null ? param.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
