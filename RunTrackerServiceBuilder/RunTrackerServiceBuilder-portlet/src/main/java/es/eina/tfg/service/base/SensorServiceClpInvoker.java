package es.eina.tfg.service.base;

import es.eina.tfg.service.SensorServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class SensorServiceClpInvoker {
    private String _methodName90;
    private String[] _methodParameterTypes90;
    private String _methodName91;
    private String[] _methodParameterTypes91;
    private String _methodName96;
    private String[] _methodParameterTypes96;

    public SensorServiceClpInvoker() {
        _methodName90 = "getBeanIdentifier";

        _methodParameterTypes90 = new String[] {  };

        _methodName91 = "setBeanIdentifier";

        _methodParameterTypes91 = new String[] { "java.lang.String" };

        _methodName96 = "getSensor";

        _methodParameterTypes96 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return SensorServiceUtil.getBeanIdentifier();
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            SensorServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return SensorServiceUtil.getSensor((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
