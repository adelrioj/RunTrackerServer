package es.eina.tfg.service.base;

import es.eina.tfg.service.DeviceLocalServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class DeviceLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName98;
    private String[] _methodParameterTypes98;
    private String _methodName99;
    private String[] _methodParameterTypes99;
    private String _methodName104;
    private String[] _methodParameterTypes104;
    private String _methodName105;
    private String[] _methodParameterTypes105;
    private String _methodName106;
    private String[] _methodParameterTypes106;
    private String _methodName108;
    private String[] _methodParameterTypes108;
    private String _methodName109;
    private String[] _methodParameterTypes109;
    private String _methodName111;
    private String[] _methodParameterTypes111;
    private String _methodName112;
    private String[] _methodParameterTypes112;
    private String _methodName113;
    private String[] _methodParameterTypes113;
    private String _methodName114;
    private String[] _methodParameterTypes114;
    private String _methodName115;
    private String[] _methodParameterTypes115;

    public DeviceLocalServiceClpInvoker() {
        _methodName0 = "addDevice";

        _methodParameterTypes0 = new String[] { "es.eina.tfg.model.Device" };

        _methodName1 = "createDevice";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteDevice";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteDevice";

        _methodParameterTypes3 = new String[] { "es.eina.tfg.model.Device" };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchDevice";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getDevice";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getDevices";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getDevicesCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateDevice";

        _methodParameterTypes15 = new String[] { "es.eina.tfg.model.Device" };

        _methodName98 = "getBeanIdentifier";

        _methodParameterTypes98 = new String[] {  };

        _methodName99 = "setBeanIdentifier";

        _methodParameterTypes99 = new String[] { "java.lang.String" };

        _methodName104 = "generateNewIdDevice";

        _methodParameterTypes104 = new String[] {  };

        _methodName105 = "addDevice";

        _methodParameterTypes105 = new String[] { "es.eina.tfg.model.Device" };

        _methodName106 = "updateDevice";

        _methodParameterTypes106 = new String[] { "es.eina.tfg.model.Device" };

        _methodName108 = "getSensors";

        _methodParameterTypes108 = new String[] { "java.lang.Long" };

        _methodName109 = "getActiveSensors";

        _methodParameterTypes109 = new String[] { "java.lang.Long" };

        _methodName111 = "getDeviceByPhoneNumber";

        _methodParameterTypes111 = new String[] { "java.lang.String" };

        _methodName112 = "getByUserId";

        _methodParameterTypes112 = new String[] { "java.lang.Long" };

        _methodName113 = "getBydeviceUUID";

        _methodParameterTypes113 = new String[] { "java.lang.String" };

        _methodName114 = "getByStatus";

        _methodParameterTypes114 = new String[] { "java.lang.String" };

        _methodName115 = "getByStatus";

        _methodParameterTypes115 = new String[] { "java.lang.String", "int", "int" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return DeviceLocalServiceUtil.addDevice((es.eina.tfg.model.Device) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return DeviceLocalServiceUtil.createDevice(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return DeviceLocalServiceUtil.deleteDevice(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return DeviceLocalServiceUtil.deleteDevice((es.eina.tfg.model.Device) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return DeviceLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return DeviceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return DeviceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return DeviceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return DeviceLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return DeviceLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return DeviceLocalServiceUtil.fetchDevice(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return DeviceLocalServiceUtil.getDevice(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return DeviceLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return DeviceLocalServiceUtil.getDevices(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return DeviceLocalServiceUtil.getDevicesCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return DeviceLocalServiceUtil.updateDevice((es.eina.tfg.model.Device) arguments[0]);
        }

        if (_methodName98.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
            return DeviceLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName99.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
            DeviceLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName104.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
            return DeviceLocalServiceUtil.generateNewIdDevice();
        }

        if (_methodName105.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
            return DeviceLocalServiceUtil.addDevice((es.eina.tfg.model.Device) arguments[0]);
        }

        if (_methodName106.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
            return DeviceLocalServiceUtil.updateDevice((es.eina.tfg.model.Device) arguments[0]);
        }

        if (_methodName108.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes108, parameterTypes)) {
            return DeviceLocalServiceUtil.getSensors((java.lang.Long) arguments[0]);
        }

        if (_methodName109.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
            return DeviceLocalServiceUtil.getActiveSensors((java.lang.Long) arguments[0]);
        }

        if (_methodName111.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
            return DeviceLocalServiceUtil.getDeviceByPhoneNumber((java.lang.String) arguments[0]);
        }

        if (_methodName112.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
            return DeviceLocalServiceUtil.getByUserId((java.lang.Long) arguments[0]);
        }

        if (_methodName113.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
            return DeviceLocalServiceUtil.getBydeviceUUID((java.lang.String) arguments[0]);
        }

        if (_methodName114.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
            return DeviceLocalServiceUtil.getByStatus((java.lang.String) arguments[0]);
        }

        if (_methodName115.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
            return DeviceLocalServiceUtil.getByStatus((java.lang.String) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        throw new UnsupportedOperationException();
    }
}
