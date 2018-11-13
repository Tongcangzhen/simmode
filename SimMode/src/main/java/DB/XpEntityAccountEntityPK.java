package DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class XpEntityAccountEntityPK implements Serializable {
    private String category;
    private String entityid;

    @Column(name = "category", nullable = false, length = 10)
    @Id
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Column(name = "entityid", nullable = false, length = 64)
    @Id
    public String getEntityid() {
        return entityid;
    }

    public void setEntityid(String entityid) {
        this.entityid = entityid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XpEntityAccountEntityPK that = (XpEntityAccountEntityPK) o;

        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (entityid != null ? !entityid.equals(that.entityid) : that.entityid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = category != null ? category.hashCode() : 0;
        result = 31 * result + (entityid != null ? entityid.hashCode() : 0);
        return result;
    }
}
