package es.eina.tfg.service.base;

import es.eina.tfg.service.RaceServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RaceServiceClpInvoker {
    private String _methodName84;
    private String[] _methodParameterTypes84;
    private String _methodName85;
    private String[] _methodParameterTypes85;
    private String _methodName90;
    private String[] _methodParameterTypes90;
    private String _methodName91;
    private String[] _methodParameterTypes91;
    private String _methodName92;
    private String[] _methodParameterTypes92;
    private String _methodName93;
    private String[] _methodParameterTypes93;

    public RaceServiceClpInvoker() {
        _methodName84 = "getBeanIdentifier";

        _methodParameterTypes84 = new String[] {  };

        _methodName85 = "setBeanIdentifier";

        _methodParameterTypes85 = new String[] { "java.lang.String" };

        _methodName90 = "add";

        _methodParameterTypes90 = new String[] {
                "java.lang.Long", "java.lang.Long", "java.lang.String"
            };

        _methodName91 = "delete";

        _methodParameterTypes91 = new String[] { "java.lang.Long" };

        _methodName92 = "getRace";

        _methodParameterTypes92 = new String[] { "java.lang.Long" };

        _methodName93 = "findByUserId";

        _methodParameterTypes93 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName84.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
            return RaceServiceUtil.getBeanIdentifier();
        }

        if (_methodName85.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
            RaceServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return RaceServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.Long) arguments[1], (java.lang.String) arguments[2]);
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            return RaceServiceUtil.delete((java.lang.Long) arguments[0]);
        }

        if (_methodName92.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
            return RaceServiceUtil.getRace((java.lang.Long) arguments[0]);
        }

        if (_methodName93.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
            return RaceServiceUtil.findByUserId((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
