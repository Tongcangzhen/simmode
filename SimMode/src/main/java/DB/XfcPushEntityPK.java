package DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class XfcPushEntityPK implements Serializable {
    private String xfc;
    private String xterm;
    private String xapp;

    @Column(name = "xfc", nullable = false, length = 64)
    @Id
    public String getXfc() {
        return xfc;
    }

    public void setXfc(String xfc) {
        this.xfc = xfc;
    }

    @Column(name = "xterm", nullable = false, length = 64)
    @Id
    public String getXterm() {
        return xterm;
    }

    public void setXterm(String xterm) {
        this.xterm = xterm;
    }

    @Column(name = "xapp", nullable = false, length = 64)
    @Id
    public String getXapp() {
        return xapp;
    }

    public void setXapp(String xapp) {
        this.xapp = xapp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XfcPushEntityPK that = (XfcPushEntityPK) o;

        if (xfc != null ? !xfc.equals(that.xfc) : that.xfc != null) return false;
        if (xterm != null ? !xterm.equals(that.xterm) : that.xterm != null) return false;
        if (xapp != null ? !xapp.equals(that.xapp) : that.xapp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xfc != null ? xfc.hashCode() : 0;
        result = 31 * result + (xterm != null ? xterm.hashCode() : 0);
        result = 31 * result + (xapp != null ? xapp.hashCode() : 0);
        return result;
    }
}
