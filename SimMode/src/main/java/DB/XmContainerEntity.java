package DB;

import javax.persistence.*;

@Entity
@Table(name = "xm_container", schema = "jinghang", catalog = "")
public class XmContainerEntity {
    private String cid;
    private String name;
    private String pubkey;
    private String ccid;
    private String cdjson;
    private String signature;
    private String remark;

    @Id
    @Column(name = "cid", nullable = false, length = 64)
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 64)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "ccid", nullable = false, length = 64)
    public String getCcid() {
        return ccid;
    }

    public void setCcid(String ccid) {
        this.ccid = ccid;
    }

    @Basic
    @Column(name = "cdjson", nullable = true, length = -1)
    public String getCdjson() {
        return cdjson;
    }

    public void setCdjson(String cdjson) {
        this.cdjson = cdjson;
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
    @Column(name = "remark", nullable = true, length = 48)
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

        XmContainerEntity that = (XmContainerEntity) o;

        if (cid != null ? !cid.equals(that.cid) : that.cid != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (pubkey != null ? !pubkey.equals(that.pubkey) : that.pubkey != null) return false;
        if (ccid != null ? !ccid.equals(that.ccid) : that.ccid != null) return false;
        if (cdjson != null ? !cdjson.equals(that.cdjson) : that.cdjson != null) return false;
        if (signature != null ? !signature.equals(that.signature) : that.signature != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid != null ? cid.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pubkey != null ? pubkey.hashCode() : 0);
        result = 31 * result + (ccid != null ? ccid.hashCode() : 0);
        result = 31 * result + (cdjson != null ? cdjson.hashCode() : 0);
        result = 31 * result + (signature != null ? signature.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
