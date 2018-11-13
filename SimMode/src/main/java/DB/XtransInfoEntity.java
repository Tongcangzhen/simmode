package DB;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "xtrans_info", schema = "jinghang", catalog = "")
public class XtransInfoEntity {
    private String xtrans;
    private String xfc;
    private String triggerappid;
    private String trigerterm;
    private Timestamp createdt;
    private String status;
    private Timestamp lastupdate;
    private String remark;

    @Id
    @Column(name = "xtrans", nullable = false, length = 64)
    public String getXtrans() {
        return xtrans;
    }

    public void setXtrans(String xtrans) {
        this.xtrans = xtrans;
    }

    @Basic
    @Column(name = "xfc", nullable = true, length = 64)
    public String getXfc() {
        return xfc;
    }

    public void setXfc(String xfc) {
        this.xfc = xfc;
    }

    @Basic
    @Column(name = "triggerappid", nullable = true, length = 64)
    public String getTriggerappid() {
        return triggerappid;
    }

    public void setTriggerappid(String triggerappid) {
        this.triggerappid = triggerappid;
    }

    @Basic
    @Column(name = "trigerterm", nullable = true, length = 64)
    public String getTrigerterm() {
        return trigerterm;
    }

    public void setTrigerterm(String trigerterm) {
        this.trigerterm = trigerterm;
    }

    @Basic
    @Column(name = "createdt", nullable = true)
    public Timestamp getCreatedt() {
        return createdt;
    }

    public void setCreatedt(Timestamp createdt) {
        this.createdt = createdt;
    }

    @Basic
    @Column(name = "status", nullable = false, length = 2)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "lastupdate", nullable = true)
    public Timestamp getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Timestamp lastupdate) {
        this.lastupdate = lastupdate;
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

        XtransInfoEntity that = (XtransInfoEntity) o;

        if (xtrans != null ? !xtrans.equals(that.xtrans) : that.xtrans != null) return false;
        if (xfc != null ? !xfc.equals(that.xfc) : that.xfc != null) return false;
        if (triggerappid != null ? !triggerappid.equals(that.triggerappid) : that.triggerappid != null) return false;
        if (trigerterm != null ? !trigerterm.equals(that.trigerterm) : that.trigerterm != null) return false;
        if (createdt != null ? !createdt.equals(that.createdt) : that.createdt != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (lastupdate != null ? !lastupdate.equals(that.lastupdate) : that.lastupdate != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xtrans != null ? xtrans.hashCode() : 0;
        result = 31 * result + (xfc != null ? xfc.hashCode() : 0);
        result = 31 * result + (triggerappid != null ? triggerappid.hashCode() : 0);
        result = 31 * result + (trigerterm != null ? trigerterm.hashCode() : 0);
        result = 31 * result + (createdt != null ? createdt.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (lastupdate != null ? lastupdate.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
