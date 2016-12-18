package es.eina.tfg.service.base;

import es.eina.tfg.service.RouteServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RouteServiceClpInvoker {
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
    private String _methodName89;
    private String[] _methodParameterTypes89;
    private String _methodName90;
    private String[] _methodParameterTypes90;
    private String _methodName91;
    private String[] _methodParameterTypes91;
    private String _methodName92;
    private String[] _methodParameterTypes92;

    public RouteServiceClpInvoker() {
        _methodName80 = "getBeanIdentifier";

        _methodParameterTypes80 = new String[] {  };

        _methodName81 = "setBeanIdentifier";

        _methodParameterTypes81 = new String[] { "java.lang.String" };

        _methodName86 = "add";

        _methodParameterTypes86 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.Long", "boolean"
            };

        _methodName87 = "update";

        _methodParameterTypes87 = new String[] {
                "java.lang.Long", "java.lang.String", "java.lang.String",
                "java.lang.String", "boolean"
            };

        _methodName88 = "delete";

        _methodParameterTypes88 = new String[] { "java.lang.Long" };

        _methodName89 = "getRoute";

        _methodParameterTypes89 = new String[] { "java.lang.Long" };

        _methodName90 = "getByAuthor";

        _methodParameterTypes90 = new String[] { "java.lang.Long" };

        _methodName91 = "getByisPublic";

        _methodParameterTypes91 = new String[] { "boolean" };

        _methodName92 = "getPublicRoutes";

        _methodParameterTypes92 = new String[] { "boolean", "int", "int" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName80.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
            return RouteServiceUtil.getBeanIdentifier();
        }

        if (_methodName81.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
            RouteServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
            return RouteServiceUtil.add((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2], (java.lang.Long) arguments[3],
                ((Boolean) arguments[4]).booleanValue());
        }

        if (_methodName87.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
            return RouteServiceUtil.update((java.lang.Long) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                ((Boolean) arguments[4]).booleanValue());
        }

        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return RouteServiceUtil.delete((java.lang.Long) arguments[0]);
        }

        if (_methodName89.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
            return RouteServiceUtil.getRoute((java.lang.Long) arguments[0]);
        }

        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return RouteServiceUtil.getByAuthor((java.lang.Long) arguments[0]);
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            return RouteServiceUtil.getByisPublic(((Boolean) arguments[0]).booleanValue());
        }

        if (_methodName92.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
            return RouteServiceUtil.getPublicRoutes(((Boolean) arguments[0]).booleanValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        throw new UnsupportedOperationException();
    }
}
