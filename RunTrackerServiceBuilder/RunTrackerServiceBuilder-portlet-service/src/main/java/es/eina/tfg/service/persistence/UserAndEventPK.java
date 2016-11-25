package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author adelrioj
 * @generated
 */
public class UserAndEventPK implements Comparable<UserAndEventPK>, Serializable {
    public long idUser;
    public long idEvent;

    public UserAndEventPK() {
    }

    public UserAndEventPK(long idUser, long idEvent) {
        this.idUser = idUser;
        this.idEvent = idEvent;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public long getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(long idEvent) {
        this.idEvent = idEvent;
    }

    @Override
    public int compareTo(UserAndEventPK pk) {
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

        if (idEvent < pk.idEvent) {
            value = -1;
        } else if (idEvent > pk.idEvent) {
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

        if (!(obj instanceof UserAndEventPK)) {
            return false;
        }

        UserAndEventPK pk = (UserAndEventPK) obj;

        if ((idUser == pk.idUser) && (idEvent == pk.idEvent)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(idUser) + String.valueOf(idEvent)).hashCode();
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
        sb.append("idEvent");
        sb.append(StringPool.EQUAL);
        sb.append(idEvent);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
