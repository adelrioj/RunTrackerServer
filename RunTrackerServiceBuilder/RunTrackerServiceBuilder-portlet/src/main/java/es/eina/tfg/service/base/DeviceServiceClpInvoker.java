package es.eina.tfg.service.base;

import es.eina.tfg.service.DeviceServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class DeviceServiceClpInvoker {
    private String _methodName90;
    private String[] _methodParameterTypes90;
    private String _methodName91;
    private String[] _methodParameterTypes91;
    private String _methodName96;
    private String[] _methodParameterTypes96;
    private String _methodName97;
    private String[] _methodParameterTypes97;
    private String _methodName98;
    private String[] _methodParameterTypes98;
    private String _methodName99;
    private String[] _methodParameterTypes99;
    private String _methodName100;
    private String[] _methodParameterTypes100;
    private String _methodName101;
    private String[] _methodParameterTypes101;
    private String _methodName102;
    private String[] _methodParameterTypes102;
    private String _methodName103;
    private String[] _methodParameterTypes103;
    private String _methodName104;
    private String[] _methodParameterTypes104;
    private String _methodName105;
    private String[] _methodParameterTypes105;
    private String _methodName106;
    private String[] _methodParameterTypes106;

    public DeviceServiceClpInvoker() {
        _methodName90 = "getBeanIdentifier";

        _methodParameterTypes90 = new String[] {  };

        _methodName91 = "setBeanIdentifier";

        _methodParameterTypes91 = new String[] { "java.lang.String" };

        _methodName96 = "add";

        _methodParameterTypes96 = new String[] {
                "java.lang.Long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String"
            };

        _methodName97 = "update";

        _methodParameterTypes97 = new String[] {
                "java.lang.Long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String"
            };

        _methodName98 = "delete";

        _methodParameterTypes98 = new String[] { "java.lang.Long" };

        _methodName99 = "getDevice";

        _methodParameterTypes99 = new String[] { "java.lang.Long" };

        _methodName100 = "getSensors";

        _methodParameterTypes100 = new String[] { "java.lang.Long" };

        _methodName101 = "getActiveSensors";

        _methodParameterTypes101 = new String[] { "java.lang.Long" };

        _methodName102 = "getDeviceByPhoneNumber";

        _methodParameterTypes102 = new String[] { "java.lang.String" };

        _methodName103 = "getByUserId";

        _methodParameterTypes103 = new String[] { "java.lang.Long" };

        _methodName104 = "getByDeviceUUID";

        _methodParameterTypes104 = new String[] { "java.lang.String" };

        _methodName105 = "getByStatus";

        _methodParameterTypes105 = new String[] { "java.lang.String" };

        _methodName106 = "getByStatus";

        _methodParameterTypes106 = new String[] { "java.lang.String", "int", "int" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return DeviceServiceUtil.getBeanIdentifier();
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            DeviceServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return DeviceServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4],
                (java.lang.String) arguments[5],
                (java.lang.String) arguments[6],
                (java.lang.String) arguments[7],
                (java.lang.String) arguments[8],
                (java.lang.String) arguments[9],
                (java.lang.String) arguments[10]);
        }

        if (_methodName97.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
            return DeviceServiceUtil.update((java.lang.Long) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4], (java.lang.String) arguments[5]);
        }

        if (_methodName98.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
            return DeviceServiceUtil.delete((java.lang.Long) arguments[0]);
        }

        if (_methodName99.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
            return DeviceServiceUtil.getDevice((java.lang.Long) arguments[0]);
        }

        if (_methodName100.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
            return DeviceServiceUtil.getSensors((java.lang.Long) arguments[0]);
        }

        if (_methodName101.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
            return DeviceServiceUtil.getActiveSensors((java.lang.Long) arguments[0]);
        }

        if (_methodName102.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
            return DeviceServiceUtil.getDeviceByPhoneNumber((java.lang.String) arguments[0]);
        }

        if (_methodName103.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
            return DeviceServiceUtil.getByUserId((java.lang.Long) arguments[0]);
        }

        if (_methodName104.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
            return DeviceServiceUtil.getByDeviceUUID((java.lang.String) arguments[0]);
        }

        if (_methodName105.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
            return DeviceServiceUtil.getByStatus((java.lang.String) arguments[0]);
        }

        if (_methodName106.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
            return DeviceServiceUtil.getByStatus((java.lang.String) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        throw new UnsupportedOperationException();
    }
}
