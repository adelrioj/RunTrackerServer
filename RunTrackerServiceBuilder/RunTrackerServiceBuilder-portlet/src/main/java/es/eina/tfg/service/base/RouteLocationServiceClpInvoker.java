package es.eina.tfg.service.base;

import es.eina.tfg.service.RouteLocationServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RouteLocationServiceClpInvoker {
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

    public RouteLocationServiceClpInvoker() {
        _methodName78 = "getBeanIdentifier";

        _methodParameterTypes78 = new String[] {  };

        _methodName79 = "setBeanIdentifier";

        _methodParameterTypes79 = new String[] { "java.lang.String" };

        _methodName84 = "add";

        _methodParameterTypes84 = new String[] {
                "long", "java.lang.Double", "java.lang.Double"
            };

        _methodName85 = "update";

        _methodParameterTypes85 = new String[] {
                "long", "long", "java.lang.Double", "java.lang.Double"
            };

        _methodName86 = "delete";

        _methodParameterTypes86 = new String[] { "long", "long" };

        _methodName87 = "getByRouteId";

        _methodParameterTypes87 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName78.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
            return RouteLocationServiceUtil.getBeanIdentifier();
        }

        if (_methodName79.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
            RouteLocationServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName84.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
            return RouteLocationServiceUtil.add(((Long) arguments[0]).longValue(),
                (java.lang.Double) arguments[1], (java.lang.Double) arguments[2]);
        }

        if (_methodName85.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
            return RouteLocationServiceUtil.update(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.Double) arguments[2], (java.lang.Double) arguments[3]);
        }

        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
            return RouteLocationServiceUtil.delete(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName87.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
            return RouteLocationServiceUtil.getByRouteId(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
