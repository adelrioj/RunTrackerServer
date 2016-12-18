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
    private String _methodName96;
    private String[] _methodParameterTypes96;
    private String _methodName97;
    private String[] _methodParameterTypes97;
    private String _methodName102;
    private String[] _methodParameterTypes102;
    private String _methodName103;
    private String[] _methodParameterTypes103;
    private String _methodName104;
    private String[] _methodParameterTypes104;
    private String _methodName106;
    private String[] _methodParameterTypes106;
    private String _methodName107;
    private String[] _methodParameterTypes107;
    private String _methodName109;
    private String[] _methodParameterTypes109;
    private String _methodName110;
    private String[] _methodParameterTypes110;
    private String _methodName111;
    private String[] _methodParameterTypes111;
    private String _methodName112;
    private String[] _methodParameterTypes112;
    private String _methodName113;
    private String[] _methodParameterTypes113;

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

        _methodName96 = "getBeanIdentifier";

        _methodParameterTypes96 = new String[] {  };

        _methodName97 = "setBeanIdentifier";

        _methodParameterTypes97 = new String[] { "java.lang.String" };

        _methodName102 = "generateNewIdDevice";

        _methodParameterTypes102 = new String[] {  };

        _methodName103 = "addDevice";

        _methodParameterTypes103 = new String[] { "es.eina.tfg.model.Device" };

        _methodName104 = "updateDevice";

        _methodParameterTypes104 = new String[] { "es.eina.tfg.model.Device" };

        _methodName106 = "getSensors";

        _methodParameterTypes106 = new String[] { "java.lang.Long" };

        _methodName107 = "getActiveSensors";

        _methodParameterTypes107 = new String[] { "java.lang.Long" };

        _methodName109 = "getDeviceByPhoneNumber";

        _methodParameterTypes109 = new String[] { "java.lang.String" };

        _methodName110 = "getByUserId";

        _methodParameterTypes110 = new String[] { "java.lang.Long" };

        _methodName111 = "getBydeviceUUID";

        _methodParameterTypes111 = new String[] { "java.lang.String" };

        _methodName112 = "getByStatus";

        _methodParameterTypes112 = new String[] { "java.lang.String" };

        _methodName113 = "getByStatus";

        _methodParameterTypes113 = new String[] { "java.lang.String", "int", "int" };
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

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return DeviceLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName97.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
            DeviceLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName102.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
            return DeviceLocalServiceUtil.generateNewIdDevice();
        }

        if (_methodName103.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
            return DeviceLocalServiceUtil.addDevice((es.eina.tfg.model.Device) arguments[0]);
        }

        if (_methodName104.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
            return DeviceLocalServiceUtil.updateDevice((es.eina.tfg.model.Device) arguments[0]);
        }

        if (_methodName106.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
            return DeviceLocalServiceUtil.getSensors((java.lang.Long) arguments[0]);
        }

        if (_methodName107.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
            return DeviceLocalServiceUtil.getActiveSensors((java.lang.Long) arguments[0]);
        }

        if (_methodName109.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes109, parameterTypes)) {
            return DeviceLocalServiceUtil.getDeviceByPhoneNumber((java.lang.String) arguments[0]);
        }

        if (_methodName110.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
            return DeviceLocalServiceUtil.getByUserId((java.lang.Long) arguments[0]);
        }

        if (_methodName111.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
            return DeviceLocalServiceUtil.getBydeviceUUID((java.lang.String) arguments[0]);
        }

        if (_methodName112.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
            return DeviceLocalServiceUtil.getByStatus((java.lang.String) arguments[0]);
        }

        if (_methodName113.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
            return DeviceLocalServiceUtil.getByStatus((java.lang.String) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        throw new UnsupportedOperationException();
    }
}
