package DB;

import javax.persistence.*;

@Entity
@Table(name = "xm_ds_param", schema = "jinghang", catalog = "")
public class XmDsParamEntity {
    private long instid;
    private Integer seqno;
    private String param;
    private String xds;
    private String fparam;
    private String mandatory;
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
    @Column(name = "seqno", nullable = true)
    public Integer getSeqno() {
        return seqno;
    }

    public void setSeqno(Integer seqno) {
        this.seqno = seqno;
    }

    @Basic
    @Column(name = "param", nullable = false, length = 64)
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Basic
    @Column(name = "xds", nullable = false, length = 64)
    public String getXds() {
        return xds;
    }

    public void setXds(String xds) {
        this.xds = xds;
    }

    @Basic
    @Column(name = "fparam", nullable = true, length = 64)
    public String getFparam() {
        return fparam;
    }

    public void setFparam(String fparam) {
        this.fparam = fparam;
    }

    @Basic
    @Column(name = "mandatory", nullable = false, length = 10)
    public String getMandatory() {
        return mandatory;
    }

    public void setMandatory(String mandatory) {
        this.mandatory = mandatory;
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

        XmDsParamEntity that = (XmDsParamEntity) o;

        if (instid != that.instid) return false;
        if (seqno != null ? !seqno.equals(that.seqno) : that.seqno != null) return false;
        if (param != null ? !param.equals(that.param) : that.param != null) return false;
        if (xds != null ? !xds.equals(that.xds) : that.xds != null) return false;
        if (fparam != null ? !fparam.equals(that.fparam) : that.fparam != null) return false;
        if (mandatory != null ? !mandatory.equals(that.mandatory) : that.mandatory != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (instid ^ (instid >>> 32));
        result = 31 * result + (seqno != null ? seqno.hashCode() : 0);
        result = 31 * result + (param != null ? param.hashCode() : 0);
        result = 31 * result + (xds != null ? xds.hashCode() : 0);
        result = 31 * result + (fparam != null ? fparam.hashCode() : 0);
        result = 31 * result + (mandatory != null ? mandatory.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
