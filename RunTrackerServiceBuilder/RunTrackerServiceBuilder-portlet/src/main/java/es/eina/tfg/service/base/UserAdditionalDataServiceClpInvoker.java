package es.eina.tfg.service.base;

import es.eina.tfg.service.UserAdditionalDataServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class UserAdditionalDataServiceClpInvoker {
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

    public UserAdditionalDataServiceClpInvoker() {
        _methodName72 = "getBeanIdentifier";

        _methodParameterTypes72 = new String[] {  };

        _methodName73 = "setBeanIdentifier";

        _methodParameterTypes73 = new String[] { "java.lang.String" };

        _methodName78 = "add";

        _methodParameterTypes78 = new String[] {
                "java.lang.Long", "java.lang.Integer", "java.lang.Integer",
                "java.lang.String"
            };

        _methodName79 = "update";

        _methodParameterTypes79 = new String[] {
                "java.lang.Long", "java.lang.Integer", "java.lang.Integer",
                "java.lang.String", "java.lang.Long"
            };

        _methodName80 = "delete";

        _methodParameterTypes80 = new String[] { "java.lang.Long" };

        _methodName81 = "getUserAdditionalData";

        _methodParameterTypes81 = new String[] { "java.lang.Long" };

        _methodName82 = "getUserSelectedRoutes";

        _methodParameterTypes82 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName72.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes72, parameterTypes)) {
            return UserAdditionalDataServiceUtil.getBeanIdentifier();
        }

        if (_methodName73.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes73, parameterTypes)) {
            UserAdditionalDataServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName78.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
            return UserAdditionalDataServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.Integer) arguments[1],
                (java.lang.Integer) arguments[2],
                (java.lang.String) arguments[3]);
        }

        if (_methodName79.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
            return UserAdditionalDataServiceUtil.update((java.lang.Long) arguments[0],
                (java.lang.Integer) arguments[1],
                (java.lang.Integer) arguments[2],
                (java.lang.String) arguments[3], (java.lang.Long) arguments[4]);
        }

        if (_methodName80.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
            return UserAdditionalDataServiceUtil.delete((java.lang.Long) arguments[0]);
        }

        if (_methodName81.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
            return UserAdditionalDataServiceUtil.getUserAdditionalData((java.lang.Long) arguments[0]);
        }

        if (_methodName82.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
            return UserAdditionalDataServiceUtil.getUserSelectedRoutes((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
