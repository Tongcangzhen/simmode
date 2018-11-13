package DB;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "xm_ccloud", schema = "jinghang", catalog = "")
public class XmCcloudEntity {
    private String ccid;
    private String name;
    private String status;
    private Timestamp createdt;
    private String pubkey;
    private String signature;
    private String remark;

    @Id
    @Column(name = "ccid", nullable = false, length = 64)
    public String getCcid() {
        return ccid;
    }

    public void setCcid(String ccid) {
        this.ccid = ccid;
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
    @Column(name = "status", nullable = true, length = 2)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "pubkey", nullable = true, length = 64)
    public String getPubkey() {
        return pubkey;
    }

    public void setPubkey(String pubkey) {
        this.pubkey = pubkey;
    }

    @Basic
    @Column(name = "signature", nullable = true, length = 64)
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
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

        XmCcloudEntity that = (XmCcloudEntity) o;

        if (ccid != null ? !ccid.equals(that.ccid) : that.ccid != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createdt != null ? !createdt.equals(that.createdt) : that.createdt != null) return false;
        if (pubkey != null ? !pubkey.equals(that.pubkey) : that.pubkey != null) return false;
        if (signature != null ? !signature.equals(that.signature) : that.signature != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ccid != null ? ccid.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createdt != null ? createdt.hashCode() : 0);
        result = 31 * result + (pubkey != null ? pubkey.hashCode() : 0);
        result = 31 * result + (signature != null ? signature.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
