package DB;

import javax.persistence.*;

@Entity
@Table(name = "xfc_contract", schema = "jinghang", catalog = "")
public class XfcContractEntity {
    private String xfc;
    private String name;
    private String fusionmodel;
    private String status;
    private String remark;

    @Id
    @Column(name = "xfc", nullable = false, length = 64)
    public String getXfc() {
        return xfc;
    }

    public void setXfc(String xfc) {
        this.xfc = xfc;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 32)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "fusionmodel", nullable = true, length = 64)
    public String getFusionmodel() {
        return fusionmodel;
    }

    public void setFusionmodel(String fusionmodel) {
        this.fusionmodel = fusionmodel;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 2)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

        XfcContractEntity that = (XfcContractEntity) o;

        if (xfc != null ? !xfc.equals(that.xfc) : that.xfc != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (fusionmodel != null ? !fusionmodel.equals(that.fusionmodel) : that.fusionmodel != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xfc != null ? xfc.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fusionmodel != null ? fusionmodel.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
