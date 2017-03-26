package es.eina.tfg.service.base;

import es.eina.tfg.service.RouteServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RouteServiceClpInvoker {
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
    private String _methodName100;
    private String[] _methodParameterTypes100;
    private String _methodName101;
    private String[] _methodParameterTypes101;
    private String _methodName102;
    private String[] _methodParameterTypes102;

    public RouteServiceClpInvoker() {
        _methodName90 = "getBeanIdentifier";

        _methodParameterTypes90 = new String[] {  };

        _methodName91 = "setBeanIdentifier";

        _methodParameterTypes91 = new String[] { "java.lang.String" };

        _methodName96 = "add";

        _methodParameterTypes96 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.Long", "boolean"
            };

        _methodName97 = "update";

        _methodParameterTypes97 = new String[] {
                "java.lang.Long", "java.lang.String", "java.lang.String",
                "java.lang.String", "boolean"
            };

        _methodName98 = "delete";

        _methodParameterTypes98 = new String[] { "java.lang.Long" };

        _methodName99 = "getRoute";

        _methodParameterTypes99 = new String[] { "java.lang.Long" };

        _methodName100 = "getByAuthor";

        _methodParameterTypes100 = new String[] { "java.lang.Long" };

        _methodName101 = "getByisPublic";

        _methodParameterTypes101 = new String[] { "boolean" };

        _methodName102 = "getPublicRoutes";

        _methodParameterTypes102 = new String[] { "boolean", "int", "int" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return RouteServiceUtil.getBeanIdentifier();
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            RouteServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return RouteServiceUtil.add((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2], (java.lang.Long) arguments[3],
                ((Boolean) arguments[4]).booleanValue());
        }

        if (_methodName97.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
            return RouteServiceUtil.update((java.lang.Long) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                ((Boolean) arguments[4]).booleanValue());
        }

        if (_methodName98.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
            return RouteServiceUtil.delete((java.lang.Long) arguments[0]);
        }

        if (_methodName99.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
            return RouteServiceUtil.getRoute((java.lang.Long) arguments[0]);
        }

        if (_methodName100.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
            return RouteServiceUtil.getByAuthor((java.lang.Long) arguments[0]);
        }

        if (_methodName101.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
            return RouteServiceUtil.getByisPublic(((Boolean) arguments[0]).booleanValue());
        }

        if (_methodName102.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
            return RouteServiceUtil.getPublicRoutes(((Boolean) arguments[0]).booleanValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        throw new UnsupportedOperationException();
    }
}
