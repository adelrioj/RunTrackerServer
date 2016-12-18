package es.eina.tfg.service.base;

import es.eina.tfg.service.UserAdditionalDataServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class UserAdditionalDataServiceClpInvoker {
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

    public UserAdditionalDataServiceClpInvoker() {
        _methodName80 = "getBeanIdentifier";

        _methodParameterTypes80 = new String[] {  };

        _methodName81 = "setBeanIdentifier";

        _methodParameterTypes81 = new String[] { "java.lang.String" };

        _methodName86 = "add";

        _methodParameterTypes86 = new String[] {
                "java.lang.Long", "java.lang.Integer", "java.lang.Integer",
                "java.lang.String"
            };

        _methodName87 = "update";

        _methodParameterTypes87 = new String[] {
                "java.lang.Long", "java.lang.Integer", "java.lang.Integer",
                "java.lang.Long"
            };

        _methodName88 = "getUserAdditionalData";

        _methodParameterTypes88 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName80.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
            return UserAdditionalDataServiceUtil.getBeanIdentifier();
        }

        if (_methodName81.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
            UserAdditionalDataServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
            return UserAdditionalDataServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.Integer) arguments[1],
                (java.lang.Integer) arguments[2],
                (java.lang.String) arguments[3]);
        }

        if (_methodName87.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
            return UserAdditionalDataServiceUtil.update((java.lang.Long) arguments[0],
                (java.lang.Integer) arguments[1],
                (java.lang.Integer) arguments[2], (java.lang.Long) arguments[3]);
        }

        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return UserAdditionalDataServiceUtil.getUserAdditionalData((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
