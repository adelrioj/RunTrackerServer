package es.eina.tfg.service.base;

import es.eina.tfg.service.UserAdditionalDataServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class UserAdditionalDataServiceClpInvoker {
    private String _methodName86;
    private String[] _methodParameterTypes86;
    private String _methodName87;
    private String[] _methodParameterTypes87;
    private String _methodName92;
    private String[] _methodParameterTypes92;
    private String _methodName93;
    private String[] _methodParameterTypes93;
    private String _methodName94;
    private String[] _methodParameterTypes94;

    public UserAdditionalDataServiceClpInvoker() {
        _methodName86 = "getBeanIdentifier";

        _methodParameterTypes86 = new String[] {  };

        _methodName87 = "setBeanIdentifier";

        _methodParameterTypes87 = new String[] { "java.lang.String" };

        _methodName92 = "add";

        _methodParameterTypes92 = new String[] {
                "java.lang.Long", "java.lang.Integer", "java.lang.Integer",
                "java.lang.String"
            };

        _methodName93 = "update";

        _methodParameterTypes93 = new String[] {
                "java.lang.Long", "java.lang.Integer", "java.lang.Integer",
                "java.lang.Long"
            };

        _methodName94 = "getUserAdditionalData";

        _methodParameterTypes94 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
            return UserAdditionalDataServiceUtil.getBeanIdentifier();
        }

        if (_methodName87.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
            UserAdditionalDataServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName92.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
            return UserAdditionalDataServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.Integer) arguments[1],
                (java.lang.Integer) arguments[2],
                (java.lang.String) arguments[3]);
        }

        if (_methodName93.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
            return UserAdditionalDataServiceUtil.update((java.lang.Long) arguments[0],
                (java.lang.Integer) arguments[1],
                (java.lang.Integer) arguments[2], (java.lang.Long) arguments[3]);
        }

        if (_methodName94.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
            return UserAdditionalDataServiceUtil.getUserAdditionalData((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
