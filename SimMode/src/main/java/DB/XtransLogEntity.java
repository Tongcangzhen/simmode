package DB;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "xtrans_log", schema = "jinghang", catalog = "")
public class XtransLogEntity {
    private long instid;
    private String xtrans;
    private Timestamp createdt;
    private String xfc;
    private String xterm;
    private String xstatus;
    private String operation;
    private String agent;
    private String coordtype;
    private String coordentityid;
    private String remark;

    @Id
    @Column(name = "instid", nullable = false)
    public long getInstid() {
        return instid;
    }

    public void setInstid(long instid) {
        this.instid = instid;
    }

    @Basic
    @Column(name = "xtrans", nullable = false, length = 64)
    public String getXtrans() {
        return xtrans;
    }

    public void setXtrans(String xtrans) {
        this.xtrans = xtrans;
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
    @Column(name = "xfc", nullable = true, length = 64)
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
    @Column(name = "xstatus", nullable = false, length = 2)
    public String getXstatus() {
        return xstatus;
    }

    public void setXstatus(String xstatus) {
        this.xstatus = xstatus;
    }

    @Basic
    @Column(name = "operation", nullable = false, length = 10)
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Basic
    @Column(name = "agent", nullable = true, length = 64)
    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    @Basic
    @Column(name = "coordtype", nullable = false, length = 10)
    public String getCoordtype() {
        return coordtype;
    }

    public void setCoordtype(String coordtype) {
        this.coordtype = coordtype;
    }

    @Basic
    @Column(name = "coordentityid", nullable = true)
    public String getCoordentityid() {
        return coordentityid;
    }

    public void setCoordentityid(String coordentityid) {
        this.coordentityid = coordentityid;
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

        XtransLogEntity that = (XtransLogEntity) o;

        if (instid != that.instid) return false;
        if (xtrans != null ? !xtrans.equals(that.xtrans) : that.xtrans != null) return false;
        if (createdt != null ? !createdt.equals(that.createdt) : that.createdt != null) return false;
        if (xfc != null ? !xfc.equals(that.xfc) : that.xfc != null) return false;
        if (xterm != null ? !xterm.equals(that.xterm) : that.xterm != null) return false;
        if (xstatus != null ? !xstatus.equals(that.xstatus) : that.xstatus != null) return false;
        if (operation != null ? !operation.equals(that.operation) : that.operation != null) return false;
        if (agent != null ? !agent.equals(that.agent) : that.agent != null) return false;
        if (coordtype != null ? !coordtype.equals(that.coordtype) : that.coordtype != null) return false;
        if (coordentityid != null ? !coordentityid.equals(that.coordentityid) : that.coordentityid != null)
            return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (instid ^ (instid >>> 32));
        result = 31 * result + (xtrans != null ? xtrans.hashCode() : 0);
        result = 31 * result + (createdt != null ? createdt.hashCode() : 0);
        result = 31 * result + (xfc != null ? xfc.hashCode() : 0);
        result = 31 * result + (xterm != null ? xterm.hashCode() : 0);
        result = 31 * result + (xstatus != null ? xstatus.hashCode() : 0);
        result = 31 * result + (operation != null ? operation.hashCode() : 0);
        result = 31 * result + (agent != null ? agent.hashCode() : 0);
        result = 31 * result + (coordtype != null ? coordtype.hashCode() : 0);
        result = 31 * result + (coordentityid != null ? coordentityid.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
