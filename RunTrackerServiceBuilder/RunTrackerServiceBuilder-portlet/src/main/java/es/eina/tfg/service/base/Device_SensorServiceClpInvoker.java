package es.eina.tfg.service.base;

import es.eina.tfg.service.Device_SensorServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class Device_SensorServiceClpInvoker {
    private String _methodName72;
    private String[] _methodParameterTypes72;
    private String _methodName73;
    private String[] _methodParameterTypes73;
    private String _methodName78;
    private String[] _methodParameterTypes78;
    private String _methodName79;
    private String[] _methodParameterTypes79;
    private String _methodName80;
    private String[] _methodParameterTypes80;
    private String _methodName81;
    private String[] _methodParameterTypes81;
    private String _methodName82;
    private String[] _methodParameterTypes82;
    private String _methodName83;
    private String[] _methodParameterTypes83;

    public Device_SensorServiceClpInvoker() {
        _methodName72 = "getBeanIdentifier";

        _methodParameterTypes72 = new String[] {  };

        _methodName73 = "setBeanIdentifier";

        _methodParameterTypes73 = new String[] { "java.lang.String" };

        _methodName78 = "add";

        _methodParameterTypes78 = new String[] {
                "java.lang.Long", "java.lang.Long", "boolean"
            };

        _methodName79 = "update";

        _methodParameterTypes79 = new String[] {
                "java.lang.Long", "java.lang.Long", "boolean"
            };

        _methodName80 = "delete";

        _methodParameterTypes80 = new String[] {
                "java.lang.Long", "java.lang.Long"
            };

        _methodName81 = "getDeviceSensor";

        _methodParameterTypes81 = new String[] {
                "java.lang.Long", "java.lang.Long"
            };

        _methodName82 = "findByDeviceId";

        _methodParameterTypes82 = new String[] { "java.lang.Long" };

        _methodName83 = "findActiveSensors";

        _methodParameterTypes83 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName72.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
            return Device_SensorServiceUtil.getBeanIdentifier();
        }

        if (_methodName73.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes73, parameterTypes)) {
            Device_SensorServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName78.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
            return Device_SensorServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.Long) arguments[1],
                ((Boolean) arguments[2]).booleanValue());
        }

        if (_methodName79.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
            return Device_SensorServiceUtil.update((java.lang.Long) arguments[0],
                (java.lang.Long) arguments[1],
                ((Boolean) arguments[2]).booleanValue());
        }

        if (_methodName80.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
            return Device_SensorServiceUtil.delete((java.lang.Long) arguments[0],
                (java.lang.Long) arguments[1]);
        }

        if (_methodName81.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
            return Device_SensorServiceUtil.getDeviceSensor((java.lang.Long) arguments[0],
                (java.lang.Long) arguments[1]);
        }

        if (_methodName82.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
            return Device_SensorServiceUtil.findByDeviceId((java.lang.Long) arguments[0]);
        }

        if (_methodName83.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes83, parameterTypes)) {
            return Device_SensorServiceUtil.findActiveSensors((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
