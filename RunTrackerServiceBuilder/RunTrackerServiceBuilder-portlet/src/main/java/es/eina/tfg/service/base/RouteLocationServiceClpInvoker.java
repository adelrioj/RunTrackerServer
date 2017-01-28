package es.eina.tfg.service.base;

import es.eina.tfg.service.RouteLocationServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RouteLocationServiceClpInvoker {
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
    private String _methodName93;
    private String[] _methodParameterTypes93;

    public RouteLocationServiceClpInvoker() {
        _methodName84 = "getBeanIdentifier";

        _methodParameterTypes84 = new String[] {  };

        _methodName85 = "setBeanIdentifier";

        _methodParameterTypes85 = new String[] { "java.lang.String" };

        _methodName90 = "add";

        _methodParameterTypes90 = new String[] {
                "long", "java.lang.Double", "java.lang.Double"
            };

        _methodName91 = "update";

        _methodParameterTypes91 = new String[] {
                "long", "long", "java.lang.Double", "java.lang.Double"
            };

        _methodName92 = "delete";

        _methodParameterTypes92 = new String[] { "long", "long" };

        _methodName93 = "getByRouteId";

        _methodParameterTypes93 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName84.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
            return RouteLocationServiceUtil.getBeanIdentifier();
        }

        if (_methodName85.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
            RouteLocationServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return RouteLocationServiceUtil.add(((Long) arguments[0]).longValue(),
                (java.lang.Double) arguments[1], (java.lang.Double) arguments[2]);
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            return RouteLocationServiceUtil.update(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.Double) arguments[2], (java.lang.Double) arguments[3]);
        }

        if (_methodName92.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
            return RouteLocationServiceUtil.delete(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName93.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
            return RouteLocationServiceUtil.getByRouteId(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
