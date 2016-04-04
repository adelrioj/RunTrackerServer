package es.eina.tfg.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author adelrioj
 * @generated
 */
public class Device_SensorPK implements Comparable<Device_SensorPK>,
    Serializable {
    public long deviceId;
    public long sensorId;

    public Device_SensorPK() {
    }

    public Device_SensorPK(long deviceId, long sensorId) {
        this.deviceId = deviceId;
        this.sensorId = sensorId;
    }

    public long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    public long getSensorId() {
        return sensorId;
    }

    public void setSensorId(long sensorId) {
        this.sensorId = sensorId;
    }

    @Override
    public int compareTo(Device_SensorPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (deviceId < pk.deviceId) {
            value = -1;
        } else if (deviceId > pk.deviceId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (sensorId < pk.sensorId) {
            value = -1;
        } else if (sensorId > pk.sensorId) {
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

        if (!(obj instanceof Device_SensorPK)) {
            return false;
        }

        Device_SensorPK pk = (Device_SensorPK) obj;

        if ((deviceId == pk.deviceId) && (sensorId == pk.sensorId)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(deviceId) + String.valueOf(sensorId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("deviceId");
        sb.append(StringPool.EQUAL);
        sb.append(deviceId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("sensorId");
        sb.append(StringPool.EQUAL);
        sb.append(sensorId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
