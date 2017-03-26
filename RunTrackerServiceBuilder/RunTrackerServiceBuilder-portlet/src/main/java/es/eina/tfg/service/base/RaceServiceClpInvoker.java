package es.eina.tfg.service.base;

import es.eina.tfg.service.RaceServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RaceServiceClpInvoker {
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

    public RaceServiceClpInvoker() {
        _methodName90 = "getBeanIdentifier";

        _methodParameterTypes90 = new String[] {  };

        _methodName91 = "setBeanIdentifier";

        _methodParameterTypes91 = new String[] { "java.lang.String" };

        _methodName96 = "add";

        _methodParameterTypes96 = new String[] {
                "java.lang.Long", "java.lang.Long", "java.lang.String"
            };

        _methodName97 = "delete";

        _methodParameterTypes97 = new String[] { "java.lang.Long" };

        _methodName98 = "getRace";

        _methodParameterTypes98 = new String[] { "java.lang.Long" };

        _methodName99 = "findByUserId";

        _methodParameterTypes99 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return RaceServiceUtil.getBeanIdentifier();
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            RaceServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return RaceServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.Long) arguments[1], (java.lang.String) arguments[2]);
        }

        if (_methodName97.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
            return RaceServiceUtil.delete((java.lang.Long) arguments[0]);
        }

        if (_methodName98.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
            return RaceServiceUtil.getRace((java.lang.Long) arguments[0]);
        }

        if (_methodName99.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
            return RaceServiceUtil.findByUserId((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
