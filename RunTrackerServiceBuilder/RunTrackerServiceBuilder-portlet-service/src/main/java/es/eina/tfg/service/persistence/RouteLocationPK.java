package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author adelrioj
 * @generated
 */
public class RouteLocationPK implements Comparable<RouteLocationPK>,
    Serializable {
    public long idRouteLocation;
    public long idRoute;

    public RouteLocationPK() {
    }

    public RouteLocationPK(long idRouteLocation, long idRoute) {
        this.idRouteLocation = idRouteLocation;
        this.idRoute = idRoute;
    }

    public long getIdRouteLocation() {
        return idRouteLocation;
    }

    public void setIdRouteLocation(long idRouteLocation) {
        this.idRouteLocation = idRouteLocation;
    }

    public long getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(long idRoute) {
        this.idRoute = idRoute;
    }

    @Override
    public int compareTo(RouteLocationPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (idRouteLocation < pk.idRouteLocation) {
            value = -1;
        } else if (idRouteLocation > pk.idRouteLocation) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (idRoute < pk.idRoute) {
            value = -1;
        } else if (idRoute > pk.idRoute) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RouteLocationPK)) {
            return false;
        }

        RouteLocationPK pk = (RouteLocationPK) obj;

        if ((idRouteLocation == pk.idRouteLocation) && (idRoute == pk.idRoute)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(idRouteLocation) + String.valueOf(idRoute)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("idRouteLocation");
        sb.append(StringPool.EQUAL);
        sb.append(idRouteLocation);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("idRoute");
        sb.append(StringPool.EQUAL);
        sb.append(idRoute);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
