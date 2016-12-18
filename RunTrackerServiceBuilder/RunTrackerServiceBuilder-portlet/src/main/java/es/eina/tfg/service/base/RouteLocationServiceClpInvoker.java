package es.eina.tfg.service.base;

import es.eina.tfg.service.RouteLocationServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RouteLocationServiceClpInvoker {
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

    public RouteLocationServiceClpInvoker() {
        _methodName80 = "getBeanIdentifier";

        _methodParameterTypes80 = new String[] {  };

        _methodName81 = "setBeanIdentifier";

        _methodParameterTypes81 = new String[] { "java.lang.String" };

        _methodName86 = "add";

        _methodParameterTypes86 = new String[] {
                "long", "java.lang.Double", "java.lang.Double"
            };

        _methodName87 = "update";

        _methodParameterTypes87 = new String[] {
                "long", "long", "java.lang.Double", "java.lang.Double"
            };

        _methodName88 = "delete";

        _methodParameterTypes88 = new String[] { "long", "long" };

        _methodName89 = "getByRouteId";

        _methodParameterTypes89 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName80.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
            return RouteLocationServiceUtil.getBeanIdentifier();
        }

        if (_methodName81.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
            RouteLocationServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
            return RouteLocationServiceUtil.add(((Long) arguments[0]).longValue(),
                (java.lang.Double) arguments[1], (java.lang.Double) arguments[2]);
        }

        if (_methodName87.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
            return RouteLocationServiceUtil.update(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.Double) arguments[2], (java.lang.Double) arguments[3]);
        }

        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return RouteLocationServiceUtil.delete(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName89.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
            return RouteLocationServiceUtil.getByRouteId(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
