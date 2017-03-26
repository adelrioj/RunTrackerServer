package es.eina.tfg.service.base;

import es.eina.tfg.service.RouteLocationServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RouteLocationServiceClpInvoker {
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

    public RouteLocationServiceClpInvoker() {
        _methodName90 = "getBeanIdentifier";

        _methodParameterTypes90 = new String[] {  };

        _methodName91 = "setBeanIdentifier";

        _methodParameterTypes91 = new String[] { "java.lang.String" };

        _methodName96 = "add";

        _methodParameterTypes96 = new String[] {
                "long", "java.lang.Double", "java.lang.Double"
            };

        _methodName97 = "update";

        _methodParameterTypes97 = new String[] {
                "long", "long", "java.lang.Double", "java.lang.Double"
            };

        _methodName98 = "delete";

        _methodParameterTypes98 = new String[] { "long", "long" };

        _methodName99 = "getByRouteId";

        _methodParameterTypes99 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return RouteLocationServiceUtil.getBeanIdentifier();
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            RouteLocationServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return RouteLocationServiceUtil.add(((Long) arguments[0]).longValue(),
                (java.lang.Double) arguments[1], (java.lang.Double) arguments[2]);
        }

        if (_methodName97.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
            return RouteLocationServiceUtil.update(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.Double) arguments[2], (java.lang.Double) arguments[3]);
        }

        if (_methodName98.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
            return RouteLocationServiceUtil.delete(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName99.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes99, parameterTypes)) {
            return RouteLocationServiceUtil.getByRouteId(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
