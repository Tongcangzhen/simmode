package DB;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "xp_fusion_account", schema = "jinghang", catalog = "")
public class XpFusionAccountEntity {
    private String category;
    private String accountpk;
    private Timestamp lastupdatedt;
    private String lasttrans;

    @Basic
    @Column(name = "category", nullable = false, length = 10)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XpFusionAccountEntity that = (XpFusionAccountEntity) o;

        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (accountpk != null ? !accountpk.equals(that.accountpk) : that.accountpk != null) return false;
        if (lastupdatedt != null ? !lastupdatedt.equals(that.lastupdatedt) : that.lastupdatedt != null) return false;
        if (lasttrans != null ? !lasttrans.equals(that.lasttrans) : that.lasttrans != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = category != null ? category.hashCode() : 0;
        result = 31 * result + (accountpk != null ? accountpk.hashCode() : 0);
        result = 31 * result + (lastupdatedt != null ? lastupdatedt.hashCode() : 0);
        result = 31 * result + (lasttrans != null ? lasttrans.hashCode() : 0);
        return result;
    }
}
