package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author adelrioj
 * @generated
 */
public class UserAndRoutePK implements Comparable<UserAndRoutePK>, Serializable {
    public long idUser;
    public long idRoute;

    public UserAndRoutePK() {
    }

    public UserAndRoutePK(long idUser, long idRoute) {
        this.idUser = idUser;
        this.idRoute = idRoute;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public long getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(long idRoute) {
        this.idRoute = idRoute;
    }

    @Override
    public int compareTo(UserAndRoutePK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (idUser < pk.idUser) {
            value = -1;
        } else if (idUser > pk.idUser) {
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

        if (!(obj instanceof UserAndRoutePK)) {
            return false;
        }

        UserAndRoutePK pk = (UserAndRoutePK) obj;

        if ((idUser == pk.idUser) && (idRoute == pk.idRoute)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(idUser) + String.valueOf(idRoute)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("idUser");
        sb.append(StringPool.EQUAL);
        sb.append(idUser);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("idRoute");
        sb.append(StringPool.EQUAL);
        sb.append(idRoute);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
