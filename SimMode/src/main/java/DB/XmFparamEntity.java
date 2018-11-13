package DB;

import javax.persistence.*;

@Entity
@Table(name = "xm_fparam", schema = "jinghang", catalog = "")
public class XmFparamEntity {
    private String fparam;
    private String datatype;
    private String remark;

    @Id
    @Column(name = "fparam", nullable = false, length = 64)
    public String getFparam() {
        return fparam;
    }

    public void setFparam(String fparam) {
        this.fparam = fparam;
    }

    @Basic
    @Column(name = "datatype", nullable = true, length = 10)
    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
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

        XmFparamEntity that = (XmFparamEntity) o;

        if (fparam != null ? !fparam.equals(that.fparam) : that.fparam != null) return false;
        if (datatype != null ? !datatype.equals(that.datatype) : that.datatype != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fparam != null ? fparam.hashCode() : 0;
        result = 31 * result + (datatype != null ? datatype.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
