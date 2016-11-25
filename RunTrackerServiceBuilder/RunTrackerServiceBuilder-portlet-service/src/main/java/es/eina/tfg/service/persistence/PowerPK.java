package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author adelrioj
 * @generated
 */
public class PowerPK implements Comparable<PowerPK>, Serializable {
    public long idMeasurement;
    public Long idRace;

    public PowerPK() {
    }

    public PowerPK(long idMeasurement, Long idRace) {
        this.idMeasurement = idMeasurement;
        this.idRace = idRace;
    }

    public long getIdMeasurement() {
        return idMeasurement;
    }

    public void setIdMeasurement(long idMeasurement) {
        this.idMeasurement = idMeasurement;
    }

    public Long getIdRace() {
        return idRace;
    }

    public void setIdRace(Long idRace) {
        this.idRace = idRace;
    }

    @Override
    public int compareTo(PowerPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

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

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PowerPK)) {
            return false;
        }

        PowerPK pk = (PowerPK) obj;

        if ((idMeasurement == pk.idMeasurement) && (idRace == pk.idRace)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(idMeasurement) + String.valueOf(idRace)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("idMeasurement");
        sb.append(StringPool.EQUAL);
        sb.append(idMeasurement);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("idRace");
        sb.append(StringPool.EQUAL);
        sb.append(idRace);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
