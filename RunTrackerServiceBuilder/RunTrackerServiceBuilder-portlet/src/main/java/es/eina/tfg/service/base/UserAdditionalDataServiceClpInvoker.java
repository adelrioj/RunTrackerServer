package es.eina.tfg.service.base;

import es.eina.tfg.service.UserAdditionalDataServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class UserAdditionalDataServiceClpInvoker {
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

    public UserAdditionalDataServiceClpInvoker() {
        _methodName78 = "getBeanIdentifier";

        _methodParameterTypes78 = new String[] {  };

        _methodName79 = "setBeanIdentifier";

        _methodParameterTypes79 = new String[] { "java.lang.String" };

        _methodName84 = "add";

        _methodParameterTypes84 = new String[] {
                "java.lang.Long", "java.lang.Integer", "java.lang.Integer",
                "java.lang.String"
            };

        _methodName85 = "update";

        _methodParameterTypes85 = new String[] {
                "java.lang.Long", "java.lang.Integer", "java.lang.Integer",
                "java.lang.Long"
            };

        _methodName86 = "getUserAdditionalData";

        _methodParameterTypes86 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName78.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
            return UserAdditionalDataServiceUtil.getBeanIdentifier();
        }

        if (_methodName79.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
            UserAdditionalDataServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName84.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
            return UserAdditionalDataServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.Integer) arguments[1],
                (java.lang.Integer) arguments[2],
                (java.lang.String) arguments[3]);
        }

        if (_methodName85.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
            return UserAdditionalDataServiceUtil.update((java.lang.Long) arguments[0],
                (java.lang.Integer) arguments[1],
                (java.lang.Integer) arguments[2], (java.lang.Long) arguments[3]);
        }

        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
            return UserAdditionalDataServiceUtil.getUserAdditionalData((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
