package es.eina.tfg.service.base;

import es.eina.tfg.service.UserAdditionalDataServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class UserAdditionalDataServiceClpInvoker {
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

    public UserAdditionalDataServiceClpInvoker() {
        _methodName84 = "getBeanIdentifier";

        _methodParameterTypes84 = new String[] {  };

        _methodName85 = "setBeanIdentifier";

        _methodParameterTypes85 = new String[] { "java.lang.String" };

        _methodName90 = "add";

        _methodParameterTypes90 = new String[] {
                "java.lang.Long", "java.lang.Integer", "java.lang.Integer",
                "java.lang.String"
            };

        _methodName91 = "update";

        _methodParameterTypes91 = new String[] {
                "java.lang.Long", "java.lang.Integer", "java.lang.Integer",
                "java.lang.Long"
            };

        _methodName92 = "getUserAdditionalData";

        _methodParameterTypes92 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName84.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
            return UserAdditionalDataServiceUtil.getBeanIdentifier();
        }

        if (_methodName85.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
            UserAdditionalDataServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return UserAdditionalDataServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.Integer) arguments[1],
                (java.lang.Integer) arguments[2],
                (java.lang.String) arguments[3]);
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            return UserAdditionalDataServiceUtil.update((java.lang.Long) arguments[0],
                (java.lang.Integer) arguments[1],
                (java.lang.Integer) arguments[2], (java.lang.Long) arguments[3]);
        }

        if (_methodName92.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
            return UserAdditionalDataServiceUtil.getUserAdditionalData((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
