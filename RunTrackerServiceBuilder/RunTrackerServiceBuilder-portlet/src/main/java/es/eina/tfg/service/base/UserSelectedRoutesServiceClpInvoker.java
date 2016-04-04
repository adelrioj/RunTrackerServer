package es.eina.tfg.service.base;

import es.eina.tfg.service.UserSelectedRoutesServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class UserSelectedRoutesServiceClpInvoker {
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

    public UserSelectedRoutesServiceClpInvoker() {
        _methodName72 = "getBeanIdentifier";

        _methodParameterTypes72 = new String[] {  };

        _methodName73 = "setBeanIdentifier";

        _methodParameterTypes73 = new String[] { "java.lang.String" };

        _methodName78 = "add";

        _methodParameterTypes78 = new String[] {
                "java.lang.Long", "java.lang.Long"
            };

        _methodName79 = "delete";

        _methodParameterTypes79 = new String[] {
                "java.lang.Long", "java.lang.Long"
            };

        _methodName80 = "getUserSelectedRoute";

        _methodParameterTypes80 = new String[] {
                "java.lang.Long", "java.lang.Long"
            };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName72.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
            return UserSelectedRoutesServiceUtil.getBeanIdentifier();
        }

        if (_methodName73.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes73, parameterTypes)) {
            UserSelectedRoutesServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName78.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
            return UserSelectedRoutesServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.Long) arguments[1]);
        }

        if (_methodName79.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
            return UserSelectedRoutesServiceUtil.delete((java.lang.Long) arguments[0],
                (java.lang.Long) arguments[1]);
        }

        if (_methodName80.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
            return UserSelectedRoutesServiceUtil.getUserSelectedRoute((java.lang.Long) arguments[0],
                (java.lang.Long) arguments[1]);
        }

        throw new UnsupportedOperationException();
    }
}
