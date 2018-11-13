package DB;

import javax.persistence.*;

@Entity
@Table(name = "xm_model", schema = "jinghang", catalog = "")
public class XmModelEntity {
    private String xmodel;
    private String name;
    private String funspec;
    private String remark;

    @Id
    @Column(name = "xmodel", nullable = false, length = 64)
    public String getXmodel() {
        return xmodel;
    }

    public void setXmodel(String xmodel) {
        this.xmodel = xmodel;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 40)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "funspec", nullable = true, length = -1)
    public String getFunspec() {
        return funspec;
    }

    public void setFunspec(String funspec) {
        this.funspec = funspec;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 64)
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

        XmModelEntity that = (XmModelEntity) o;

        if (xmodel != null ? !xmodel.equals(that.xmodel) : that.xmodel != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (funspec != null ? !funspec.equals(that.funspec) : that.funspec != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xmodel != null ? xmodel.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (funspec != null ? funspec.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
