package es.eina.tfg.service.base;

import es.eina.tfg.service.RouteServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RouteServiceClpInvoker {
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
    private String _methodName88;
    private String[] _methodParameterTypes88;
    private String _methodName89;
    private String[] _methodParameterTypes89;
    private String _methodName90;
    private String[] _methodParameterTypes90;

    public RouteServiceClpInvoker() {
        _methodName78 = "getBeanIdentifier";

        _methodParameterTypes78 = new String[] {  };

        _methodName79 = "setBeanIdentifier";

        _methodParameterTypes79 = new String[] { "java.lang.String" };

        _methodName84 = "add";

        _methodParameterTypes84 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.Long", "boolean"
            };

        _methodName85 = "update";

        _methodParameterTypes85 = new String[] {
                "java.lang.Long", "java.lang.String", "java.lang.String",
                "java.lang.String", "boolean"
            };

        _methodName86 = "delete";

        _methodParameterTypes86 = new String[] { "java.lang.Long" };

        _methodName87 = "getRoute";

        _methodParameterTypes87 = new String[] { "java.lang.Long" };

        _methodName88 = "getByAuthor";

        _methodParameterTypes88 = new String[] { "java.lang.Long" };

        _methodName89 = "getByisPublic";

        _methodParameterTypes89 = new String[] { "boolean" };

        _methodName90 = "getPublicRoutes";

        _methodParameterTypes90 = new String[] { "boolean", "int", "int" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName78.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
            return RouteServiceUtil.getBeanIdentifier();
        }

        if (_methodName79.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
            RouteServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName84.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
            return RouteServiceUtil.add((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2], (java.lang.Long) arguments[3],
                ((Boolean) arguments[4]).booleanValue());
        }

        if (_methodName85.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
            return RouteServiceUtil.update((java.lang.Long) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                ((Boolean) arguments[4]).booleanValue());
        }

        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
            return RouteServiceUtil.delete((java.lang.Long) arguments[0]);
        }

        if (_methodName87.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
            return RouteServiceUtil.getRoute((java.lang.Long) arguments[0]);
        }

        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return RouteServiceUtil.getByAuthor((java.lang.Long) arguments[0]);
        }

        if (_methodName89.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
            return RouteServiceUtil.getByisPublic(((Boolean) arguments[0]).booleanValue());
        }

        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return RouteServiceUtil.getPublicRoutes(((Boolean) arguments[0]).booleanValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        throw new UnsupportedOperationException();
    }
}
