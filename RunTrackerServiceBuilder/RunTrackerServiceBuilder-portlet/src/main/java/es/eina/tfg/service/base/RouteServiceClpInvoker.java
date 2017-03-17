package es.eina.tfg.service.base;

import es.eina.tfg.service.RouteServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RouteServiceClpInvoker {
    private String _methodName88;
    private String[] _methodParameterTypes88;
    private String _methodName89;
    private String[] _methodParameterTypes89;
    private String _methodName94;
    private String[] _methodParameterTypes94;
    private String _methodName95;
    private String[] _methodParameterTypes95;
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

    public RouteServiceClpInvoker() {
        _methodName88 = "getBeanIdentifier";

        _methodParameterTypes88 = new String[] {  };

        _methodName89 = "setBeanIdentifier";

        _methodParameterTypes89 = new String[] { "java.lang.String" };

        _methodName94 = "add";

        _methodParameterTypes94 = new String[] {
                "java.lang.String", "java.lang.String", "java.lang.String",
                "java.lang.Long", "boolean"
            };

        _methodName95 = "update";

        _methodParameterTypes95 = new String[] {
                "java.lang.Long", "java.lang.String", "java.lang.String",
                "java.lang.String", "boolean"
            };

        _methodName96 = "delete";

        _methodParameterTypes96 = new String[] { "java.lang.Long" };

        _methodName97 = "getRoute";

        _methodParameterTypes97 = new String[] { "java.lang.Long" };

        _methodName98 = "getByAuthor";

        _methodParameterTypes98 = new String[] { "java.lang.Long" };

        _methodName99 = "getByisPublic";

        _methodParameterTypes99 = new String[] { "boolean" };

        _methodName100 = "getPublicRoutes";

        _methodParameterTypes100 = new String[] { "boolean", "int", "int" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return RouteServiceUtil.getBeanIdentifier();
        }

        if (_methodName89.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
            RouteServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName94.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
            return RouteServiceUtil.add((java.lang.String) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2], (java.lang.Long) arguments[3],
                ((Boolean) arguments[4]).booleanValue());
        }

        if (_methodName95.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
            return RouteServiceUtil.update((java.lang.Long) arguments[0],
                (java.lang.String) arguments[1],
                (java.lang.String) arguments[2],
                (java.lang.String) arguments[3],
                ((Boolean) arguments[4]).booleanValue());
        }

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return RouteServiceUtil.delete((java.lang.Long) arguments[0]);
        }

        if (_methodName97.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
            return RouteServiceUtil.getRoute((java.lang.Long) arguments[0]);
        }

        if (_methodName98.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
            return RouteServiceUtil.getByAuthor((java.lang.Long) arguments[0]);
        }

        if (_methodName99.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
            return RouteServiceUtil.getByisPublic(((Boolean) arguments[0]).booleanValue());
        }

        if (_methodName100.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
            return RouteServiceUtil.getPublicRoutes(((Boolean) arguments[0]).booleanValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        throw new UnsupportedOperationException();
    }
}
