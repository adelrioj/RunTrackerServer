package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author adelrioj
 * @generated
 */
public class DeviceAndSensorPK implements Comparable<DeviceAndSensorPK>,
    Serializable {
    public long idDevice;
    public long idSensor;

    public DeviceAndSensorPK() {
    }

    public DeviceAndSensorPK(long idDevice, long idSensor) {
        this.idDevice = idDevice;
        this.idSensor = idSensor;
    }

    public long getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(long idDevice) {
        this.idDevice = idDevice;
    }

    public long getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(long idSensor) {
        this.idSensor = idSensor;
    }

    @Override
    public int compareTo(DeviceAndSensorPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (idDevice < pk.idDevice) {
            value = -1;
        } else if (idDevice > pk.idDevice) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (idSensor < pk.idSensor) {
            value = -1;
        } else if (idSensor > pk.idSensor) {
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

        if (!(obj instanceof DeviceAndSensorPK)) {
            return false;
        }

        DeviceAndSensorPK pk = (DeviceAndSensorPK) obj;

        if ((idDevice == pk.idDevice) && (idSensor == pk.idSensor)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(idDevice) + String.valueOf(idSensor)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("idDevice");
        sb.append(StringPool.EQUAL);
        sb.append(idDevice);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("idSensor");
        sb.append(StringPool.EQUAL);
        sb.append(idSensor);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
