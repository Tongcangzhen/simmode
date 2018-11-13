package DB;

import javax.persistence.*;

@Entity
@Table(name = "xm_app", schema = "jinghang", catalog = "")
public class XmAppEntity {
    private String xapp;
    private String domain;
    private String name;
    private String type;
    private String pubkey;
    private String announcement;
    private String signature;
    private String queryurl;
    private String fetchurl;
    private String pushurl;
    private String remark;

    @Id
    @Column(name = "xapp", nullable = false, length = 64)
    public String getXapp() {
        return xapp;
    }

    public void setXapp(String xapp) {
        this.xapp = xapp;
    }

    @Basic
    @Column(name = "domain", nullable = true, length = 512)
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 48)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 32)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    @Column(name = "announcement", nullable = true, length = -1)
    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
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
    @Column(name = "queryurl", nullable = true, length = 1024)
    public String getQueryurl() {
        return queryurl;
    }

    public void setQueryurl(String queryurl) {
        this.queryurl = queryurl;
    }

    @Basic
    @Column(name = "fetchurl", nullable = true, length = 1024)
    public String getFetchurl() {
        return fetchurl;
    }

    public void setFetchurl(String fetchurl) {
        this.fetchurl = fetchurl;
    }

    @Basic
    @Column(name = "pushurl", nullable = true, length = 1024)
    public String getPushurl() {
        return pushurl;
    }

    public void setPushurl(String pushurl) {
        this.pushurl = pushurl;
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

        XmAppEntity that = (XmAppEntity) o;

        if (xapp != null ? !xapp.equals(that.xapp) : that.xapp != null) return false;
        if (domain != null ? !domain.equals(that.domain) : that.domain != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (pubkey != null ? !pubkey.equals(that.pubkey) : that.pubkey != null) return false;
        if (announcement != null ? !announcement.equals(that.announcement) : that.announcement != null) return false;
        if (signature != null ? !signature.equals(that.signature) : that.signature != null) return false;
        if (queryurl != null ? !queryurl.equals(that.queryurl) : that.queryurl != null) return false;
        if (fetchurl != null ? !fetchurl.equals(that.fetchurl) : that.fetchurl != null) return false;
        if (pushurl != null ? !pushurl.equals(that.pushurl) : that.pushurl != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xapp != null ? xapp.hashCode() : 0;
        result = 31 * result + (domain != null ? domain.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (pubkey != null ? pubkey.hashCode() : 0);
        result = 31 * result + (announcement != null ? announcement.hashCode() : 0);
        result = 31 * result + (signature != null ? signature.hashCode() : 0);
        result = 31 * result + (queryurl != null ? queryurl.hashCode() : 0);
        result = 31 * result + (fetchurl != null ? fetchurl.hashCode() : 0);
        result = 31 * result + (pushurl != null ? pushurl.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
