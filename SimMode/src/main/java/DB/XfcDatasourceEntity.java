package DB;

import javax.persistence.*;

@Entity
@Table(name = "xfc_datasource", schema = "jinghang", catalog = "")
public class XfcDatasourceEntity {
    private int instid;
    private String xfc;
    private String xterm;
    private String xds;
    private String sds;
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
    @Column(name = "xterm", nullable = true, length = 64)
    public String getXterm() {
        return xterm;
    }

    public void setXterm(String xterm) {
        this.xterm = xterm;
    }

    @Basic
    @Column(name = "xds", nullable = true, length = 64)
    public String getXds() {
        return xds;
    }

    public void setXds(String xds) {
        this.xds = xds;
    }

    @Basic
    @Column(name = "sds", nullable = true, length = 64)
    public String getSds() {
        return sds;
    }

    public void setSds(String sds) {
        this.sds = sds;
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

        XfcDatasourceEntity that = (XfcDatasourceEntity) o;

        if (instid != that.instid) return false;
        if (xfc != null ? !xfc.equals(that.xfc) : that.xfc != null) return false;
        if (xterm != null ? !xterm.equals(that.xterm) : that.xterm != null) return false;
        if (xds != null ? !xds.equals(that.xds) : that.xds != null) return false;
        if (sds != null ? !sds.equals(that.sds) : that.sds != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = instid;
        result = 31 * result + (xfc != null ? xfc.hashCode() : 0);
        result = 31 * result + (xterm != null ? xterm.hashCode() : 0);
        result = 31 * result + (xds != null ? xds.hashCode() : 0);
        result = 31 * result + (sds != null ? sds.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
