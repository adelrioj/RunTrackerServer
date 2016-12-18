package es.eina.tfg.service.base;

import es.eina.tfg.service.RaceServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RaceServiceClpInvoker {
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

    public RaceServiceClpInvoker() {
        _methodName80 = "getBeanIdentifier";

        _methodParameterTypes80 = new String[] {  };

        _methodName81 = "setBeanIdentifier";

        _methodParameterTypes81 = new String[] { "java.lang.String" };

        _methodName86 = "add";

        _methodParameterTypes86 = new String[] {
                "java.lang.Long", "java.lang.Long", "java.lang.String"
            };

        _methodName87 = "delete";

        _methodParameterTypes87 = new String[] { "java.lang.Long" };

        _methodName88 = "getRace";

        _methodParameterTypes88 = new String[] { "java.lang.Long" };

        _methodName89 = "findByUserId";

        _methodParameterTypes89 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName80.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
            return RaceServiceUtil.getBeanIdentifier();
        }

        if (_methodName81.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
            RaceServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
            return RaceServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.Long) arguments[1], (java.lang.String) arguments[2]);
        }

        if (_methodName87.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
            return RaceServiceUtil.delete((java.lang.Long) arguments[0]);
        }

        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return RaceServiceUtil.getRace((java.lang.Long) arguments[0]);
        }

        if (_methodName89.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
            return RaceServiceUtil.findByUserId((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
