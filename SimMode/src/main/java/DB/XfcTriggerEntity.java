package DB;

import javax.persistence.*;

@Entity
@Table(name = "xfc_trigger", schema = "jinghang", catalog = "")
@IdClass(XfcTriggerEntityPK.class)
public class XfcTriggerEntity {
    private String xfc;
    private String xterm;
    private String xapp;
    private String mappingjson;
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
    @Column(name = "xterm", nullable = false, length = 64)
    public String getXterm() {
        return xterm;
    }

    public void setXterm(String xterm) {
        this.xterm = xterm;
    }

    @Id
    @Column(name = "xapp", nullable = false, length = 64)
    public String getXapp() {
        return xapp;
    }

    public void setXapp(String xapp) {
        this.xapp = xapp;
    }

    @Basic
    @Column(name = "mappingjson", nullable = true, length = -1)
    public String getMappingjson() {
        return mappingjson;
    }

    public void setMappingjson(String mappingjson) {
        this.mappingjson = mappingjson;
    }

    @Basic
    @Column(name = "remark", nullable = false, length = 40)
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

        XfcTriggerEntity that = (XfcTriggerEntity) o;

        if (xfc != null ? !xfc.equals(that.xfc) : that.xfc != null) return false;
        if (xterm != null ? !xterm.equals(that.xterm) : that.xterm != null) return false;
        if (xapp != null ? !xapp.equals(that.xapp) : that.xapp != null) return false;
        if (mappingjson != null ? !mappingjson.equals(that.mappingjson) : that.mappingjson != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xfc != null ? xfc.hashCode() : 0;
        result = 31 * result + (xterm != null ? xterm.hashCode() : 0);
        result = 31 * result + (xapp != null ? xapp.hashCode() : 0);
        result = 31 * result + (mappingjson != null ? mappingjson.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
