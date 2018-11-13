package DB;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "xp_entity_account", schema = "jinghang", catalog = "")
@IdClass(XpEntityAccountEntityPK.class)
public class XpEntityAccountEntity {
    private String category;
    private String entityid;
    private String accountpk;
    private Double threshold;
    private Timestamp lastupdatedt;
    private String lasttrans;
    private String remark;

    @Id
    @Column(name = "category", nullable = false, length = 10)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Id
    @Column(name = "entityid", nullable = false, length = 64)
    public String getEntityid() {
        return entityid;
    }

    public void setEntityid(String entityid) {
        this.entityid = entityid;
    }

    @Basic
    @Column(name = "accountpk", nullable = true, length = 64)
    public String getAccountpk() {
        return accountpk;
    }

    public void setAccountpk(String accountpk) {
        this.accountpk = accountpk;
    }

    @Basic
    @Column(name = "threshold", nullable = true, precision = 0)
    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    @Basic
    @Column(name = "lastupdatedt", nullable = true)
    public Timestamp getLastupdatedt() {
        return lastupdatedt;
    }

    public void setLastupdatedt(Timestamp lastupdatedt) {
        this.lastupdatedt = lastupdatedt;
    }

    @Basic
    @Column(name = "lasttrans", nullable = true, length = 64)
    public String getLasttrans() {
        return lasttrans;
    }

    public void setLasttrans(String lasttrans) {
        this.lasttrans = lasttrans;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 10)
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

        XpEntityAccountEntity that = (XpEntityAccountEntity) o;

        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (entityid != null ? !entityid.equals(that.entityid) : that.entityid != null) return false;
        if (accountpk != null ? !accountpk.equals(that.accountpk) : that.accountpk != null) return false;
        if (threshold != null ? !threshold.equals(that.threshold) : that.threshold != null) return false;
        if (lastupdatedt != null ? !lastupdatedt.equals(that.lastupdatedt) : that.lastupdatedt != null) return false;
        if (lasttrans != null ? !lasttrans.equals(that.lasttrans) : that.lasttrans != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = category != null ? category.hashCode() : 0;
        result = 31 * result + (entityid != null ? entityid.hashCode() : 0);
        result = 31 * result + (accountpk != null ? accountpk.hashCode() : 0);
        result = 31 * result + (threshold != null ? threshold.hashCode() : 0);
        result = 31 * result + (lastupdatedt != null ? lastupdatedt.hashCode() : 0);
        result = 31 * result + (lasttrans != null ? lasttrans.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
