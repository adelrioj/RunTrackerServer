package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author adelrioj
 * @generated
 */
public class LocationPK implements Comparable<LocationPK>, Serializable {
    public Long idRace;
    public long idMeasurement;

    public LocationPK() {
    }

    public LocationPK(Long idRace, long idMeasurement) {
        this.idRace = idRace;
        this.idMeasurement = idMeasurement;
    }

    public Long getIdRace() {
        return idRace;
    }

    public void setIdRace(Long idRace) {
        this.idRace = idRace;
    }

    public long getIdMeasurement() {
        return idMeasurement;
    }

    public void setIdMeasurement(long idMeasurement) {
        this.idMeasurement = idMeasurement;
    }

    @Override
    public int compareTo(LocationPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (idRace < pk.idRace) {
            value = -1;
        } else if (idRace > pk.idRace) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (idMeasurement < pk.idMeasurement) {
            value = -1;
        } else if (idMeasurement > pk.idMeasurement) {
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

        if (!(obj instanceof LocationPK)) {
            return false;
        }

        LocationPK pk = (LocationPK) obj;

        if ((idRace == pk.idRace) && (idMeasurement == pk.idMeasurement)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(idRace) + String.valueOf(idMeasurement)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("idRace");
        sb.append(StringPool.EQUAL);
        sb.append(idRace);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("idMeasurement");
        sb.append(StringPool.EQUAL);
        sb.append(idMeasurement);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
