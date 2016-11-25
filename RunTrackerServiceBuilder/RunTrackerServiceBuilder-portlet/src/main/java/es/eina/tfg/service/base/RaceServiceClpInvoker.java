package es.eina.tfg.service.base;

import es.eina.tfg.service.RaceServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RaceServiceClpInvoker {
    private String _methodName78;
    private String[] _methodParameterTypes78;
    private String _methodName79;
    private String[] _methodParameterTypes79;
    private String _methodName84;
    private String[] _methodParameterTypes84;
    private String _methodName85;
    private String[] _methodParameterTypes85;
    private String _methodName86;
    private String[] _methodParameterTypes86;
    private String _methodName87;
    private String[] _methodParameterTypes87;

    public RaceServiceClpInvoker() {
        _methodName78 = "getBeanIdentifier";

        _methodParameterTypes78 = new String[] {  };

        _methodName79 = "setBeanIdentifier";

        _methodParameterTypes79 = new String[] { "java.lang.String" };

        _methodName84 = "add";

        _methodParameterTypes84 = new String[] {
                "java.lang.Long", "java.lang.Long", "java.lang.String"
            };

        _methodName85 = "delete";

        _methodParameterTypes85 = new String[] { "java.lang.Long" };

        _methodName86 = "getRace";

        _methodParameterTypes86 = new String[] { "java.lang.Long" };

        _methodName87 = "findByUserId";

        _methodParameterTypes87 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName78.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
            return RaceServiceUtil.getBeanIdentifier();
        }

        if (_methodName79.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
            RaceServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName84.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
            return RaceServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.Long) arguments[1], (java.lang.String) arguments[2]);
        }

        if (_methodName85.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
            return RaceServiceUtil.delete((java.lang.Long) arguments[0]);
        }

        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
            return RaceServiceUtil.getRace((java.lang.Long) arguments[0]);
        }

        if (_methodName87.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
            return RaceServiceUtil.findByUserId((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
