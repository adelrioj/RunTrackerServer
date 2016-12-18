package es.eina.tfg.service.base;

import es.eina.tfg.service.PowerServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class PowerServiceClpInvoker {
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

    public PowerServiceClpInvoker() {
        _methodName80 = "getBeanIdentifier";

        _methodParameterTypes80 = new String[] {  };

        _methodName81 = "setBeanIdentifier";

        _methodParameterTypes81 = new String[] { "java.lang.String" };

        _methodName86 = "add";

        _methodParameterTypes86 = new String[] {
                "java.lang.Long", "java.lang.Long", "java.lang.Long",
                "java.util.Date", "java.lang.String", "java.lang.Integer"
            };

        _methodName87 = "getPower";

        _methodParameterTypes87 = new String[] { "long", "long" };

        _methodName88 = "getByidRace";

        _methodParameterTypes88 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName80.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
            return PowerServiceUtil.getBeanIdentifier();
        }

        if (_methodName81.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
            PowerServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
            return PowerServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.Long) arguments[1], (java.lang.Long) arguments[2],
                (java.util.Date) arguments[3], (java.lang.String) arguments[4],
                (java.lang.Integer) arguments[5]);
        }

        if (_methodName87.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
            return PowerServiceUtil.getPower(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return PowerServiceUtil.getByidRace((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
