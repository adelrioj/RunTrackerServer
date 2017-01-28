package es.eina.tfg.service.base;

import es.eina.tfg.service.LocationServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class LocationServiceClpInvoker {
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

    public LocationServiceClpInvoker() {
        _methodName84 = "getBeanIdentifier";

        _methodParameterTypes84 = new String[] {  };

        _methodName85 = "setBeanIdentifier";

        _methodParameterTypes85 = new String[] { "java.lang.String" };

        _methodName90 = "add";

        _methodParameterTypes90 = new String[] {
                "java.lang.Long", "java.lang.Long", "java.lang.Long",
                "java.util.Date", "java.lang.String", "int", "double", "double",
                "double", "double", "double"
            };

        _methodName91 = "getByidLocation";

        _methodParameterTypes91 = new String[] { "long", "long" };

        _methodName92 = "getByidRace";

        _methodParameterTypes92 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName84.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
            return LocationServiceUtil.getBeanIdentifier();
        }

        if (_methodName85.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
            LocationServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return LocationServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.Long) arguments[1], (java.lang.Long) arguments[2],
                (java.util.Date) arguments[3], (java.lang.String) arguments[4],
                ((Integer) arguments[5]).intValue(),
                ((Double) arguments[6]).doubleValue(),
                ((Double) arguments[7]).doubleValue(),
                ((Double) arguments[8]).doubleValue(),
                ((Double) arguments[9]).doubleValue(),
                ((Double) arguments[10]).doubleValue());
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            return LocationServiceUtil.getByidLocation(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName92.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
            return LocationServiceUtil.getByidRace((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
