package es.eina.tfg.service.base;

import es.eina.tfg.service.DeviceServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class DeviceServiceClpInvoker {
    private String _methodName80;
    private String[] _methodParameterTypes80;
    private String _methodName81;
    private String[] _methodParameterTypes81;
    private String _methodName86;
    private String[] _methodParameterTypes86;
    private String _methodName87;
    private String[] _methodParameterTypes87;
    private String _methodName88;
    private String[] _methodParameterTypes88;
    private String _methodName89;
    private String[] _methodParameterTypes89;
    private String _methodName90;
    private String[] _methodParameterTypes90;
    private String _methodName91;
    private String[] _methodParameterTypes91;
    private String _methodName92;
    private String[] _methodParameterTypes92;
    private String _methodName93;
    private String[] _methodParameterTypes93;
    private String _methodName94;
    private String[] _methodParameterTypes94;
    private String _methodName95;
    private String[] _methodParameterTypes95;
    private String _methodName96;
    private String[] _methodParameterTypes96;

    public DeviceServiceClpInvoker() {
        _methodName80 = "getBeanIdentifier";

        _methodParameterTypes80 = new String[] {  };

        _methodName81 = "setBeanIdentifier";

        _methodParameterTypes81 = new String[] { "java.lang.String" };

        _methodName86 = "add";

        _methodParameterTypes86 = new String[] {
                "java.lang.Long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String"
            };

        _methodName87 = "update";

        _methodParameterTypes87 = new String[] {
                "java.lang.Long", "java.lang.String", "java.lang.String",
                "java.lang.String", "java.lang.String", "java.lang.String"
            };

        _methodName88 = "delete";

        _methodParameterTypes88 = new String[] { "java.lang.Long" };

        _methodName89 = "getDevice";

        _methodParameterTypes89 = new String[] { "java.lang.Long" };

        _methodName90 = "getSensors";

        _methodParameterTypes90 = new String[] { "java.lang.Long" };

        _methodName91 = "getActiveSensors";

        _methodParameterTypes91 = new String[] { "java.lang.Long" };

        _methodName92 = "getDeviceByPhoneNumber";

        _methodParameterTypes92 = new String[] { "java.lang.String" };

        _methodName93 = "getByUserId";

        _methodParameterTypes93 = new String[] { "java.lang.Long" };

        _methodName94 = "getByDeviceUUID";

        _methodParameterTypes94 = new String[] { "java.lang.String" };

        _methodName95 = "getByStatus";

        _methodParameterTypes95 = new String[] { "java.lang.String" };

        _methodName96 = "getByStatus";

        _methodParameterTypes96 = new String[] { "java.lang.String", "int", "int" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName80.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
            return DeviceServiceUtil.getBeanIdentifier();
        }

        if (_methodName81.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
            DeviceServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
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

        if (_methodName87.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
            return DeviceServiceUtil.update((java.lang.Long) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                (java.lang.String) arguments[4], (java.lang.String) arguments[5]);
        }

        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return DeviceServiceUtil.delete((java.lang.Long) arguments[0]);
        }

        if (_methodName89.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
            return DeviceServiceUtil.getDevice((java.lang.Long) arguments[0]);
        }

        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return DeviceServiceUtil.getSensors((java.lang.Long) arguments[0]);
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            return DeviceServiceUtil.getActiveSensors((java.lang.Long) arguments[0]);
        }

        if (_methodName92.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
            return DeviceServiceUtil.getDeviceByPhoneNumber((java.lang.String) arguments[0]);
        }

        if (_methodName93.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
            return DeviceServiceUtil.getByUserId((java.lang.Long) arguments[0]);
        }

        if (_methodName94.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
            return DeviceServiceUtil.getByDeviceUUID((java.lang.String) arguments[0]);
        }

        if (_methodName95.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
            return DeviceServiceUtil.getByStatus((java.lang.String) arguments[0]);
        }

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return DeviceServiceUtil.getByStatus((java.lang.String) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        throw new UnsupportedOperationException();
    }
}
