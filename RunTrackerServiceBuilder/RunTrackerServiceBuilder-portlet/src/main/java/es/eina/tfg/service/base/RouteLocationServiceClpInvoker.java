package es.eina.tfg.service.base;

import es.eina.tfg.service.RouteLocationServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RouteLocationServiceClpInvoker {
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

    public RouteLocationServiceClpInvoker() {
        _methodName88 = "getBeanIdentifier";

        _methodParameterTypes88 = new String[] {  };

        _methodName89 = "setBeanIdentifier";

        _methodParameterTypes89 = new String[] { "java.lang.String" };

        _methodName94 = "add";

        _methodParameterTypes94 = new String[] {
                "long", "java.lang.Double", "java.lang.Double"
            };

        _methodName95 = "update";

        _methodParameterTypes95 = new String[] {
                "long", "long", "java.lang.Double", "java.lang.Double"
            };

        _methodName96 = "delete";

        _methodParameterTypes96 = new String[] { "long", "long" };

        _methodName97 = "getByRouteId";

        _methodParameterTypes97 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return RouteLocationServiceUtil.getBeanIdentifier();
        }

        if (_methodName89.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
            RouteLocationServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName94.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
            return RouteLocationServiceUtil.add(((Long) arguments[0]).longValue(),
                (java.lang.Double) arguments[1], (java.lang.Double) arguments[2]);
        }

        if (_methodName95.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
            return RouteLocationServiceUtil.update(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.Double) arguments[2], (java.lang.Double) arguments[3]);
        }

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return RouteLocationServiceUtil.delete(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName97.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
            return RouteLocationServiceUtil.getByRouteId(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
