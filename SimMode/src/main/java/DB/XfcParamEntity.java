package DB;

import javax.persistence.*;

@Entity
@Table(name = "xfc_param", schema = "jinghang", catalog = "")
public class XfcParamEntity {
    private int instid;
    private String xfc;
    private String xdid;
    private String param;
    private String mappingparam;
    private String remark;

    @Id
    @Column(name = "instid", nullable = false)
    public int getInstid() {
        return instid;
    }

    public void setInstid(int instid) {
        this.instid = instid;
    }

    @Basic
    @Column(name = "xfc", nullable = false, length = 64)
    public String getXfc() {
        return xfc;
    }

    public void setXfc(String xfc) {
        this.xfc = xfc;
    }

    @Basic
    @Column(name = "xdid", nullable = false, length = 64)
    public String getXdid() {
        return xdid;
    }

    public void setXdid(String xdid) {
        this.xdid = xdid;
    }

    @Basic
    @Column(name = "param", nullable = false, length = 32)
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Basic
    @Column(name = "mappingparam", nullable = true, length = 32)
    public String getMappingparam() {
        return mappingparam;
    }

    public void setMappingparam(String mappingparam) {
        this.mappingparam = mappingparam;
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

        XfcParamEntity that = (XfcParamEntity) o;

        if (instid != that.instid) return false;
        if (xfc != null ? !xfc.equals(that.xfc) : that.xfc != null) return false;
        if (xdid != null ? !xdid.equals(that.xdid) : that.xdid != null) return false;
        if (param != null ? !param.equals(that.param) : that.param != null) return false;
        if (mappingparam != null ? !mappingparam.equals(that.mappingparam) : that.mappingparam != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = instid;
        result = 31 * result + (xfc != null ? xfc.hashCode() : 0);
        result = 31 * result + (xdid != null ? xdid.hashCode() : 0);
        result = 31 * result + (param != null ? param.hashCode() : 0);
        result = 31 * result + (mappingparam != null ? mappingparam.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
