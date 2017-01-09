package es.eina.tfg.service.base;

import es.eina.tfg.service.LocationServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class LocationServiceClpInvoker {
    private String _methodName82;
    private String[] _methodParameterTypes82;
    private String _methodName83;
    private String[] _methodParameterTypes83;
    private String _methodName88;
    private String[] _methodParameterTypes88;
    private String _methodName89;
    private String[] _methodParameterTypes89;
    private String _methodName90;
    private String[] _methodParameterTypes90;

    public LocationServiceClpInvoker() {
        _methodName82 = "getBeanIdentifier";

        _methodParameterTypes82 = new String[] {  };

        _methodName83 = "setBeanIdentifier";

        _methodParameterTypes83 = new String[] { "java.lang.String" };

        _methodName88 = "add";

        _methodParameterTypes88 = new String[] {
                "java.lang.Long", "java.lang.Long", "java.lang.Long",
                "java.util.Date", "java.lang.String", "int", "double", "double",
                "double", "double", "double"
            };

        _methodName89 = "getByidLocation";

        _methodParameterTypes89 = new String[] { "long", "long" };

        _methodName90 = "getByidRace";

        _methodParameterTypes90 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName82.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes82, parameterTypes)) {
            return LocationServiceUtil.getBeanIdentifier();
        }

        if (_methodName83.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes83, parameterTypes)) {
            LocationServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
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

        if (_methodName89.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
            return LocationServiceUtil.getByidLocation(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return LocationServiceUtil.getByidRace((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
