package es.eina.tfg.service.base;

import es.eina.tfg.service.LocationServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class LocationServiceClpInvoker {
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

    public LocationServiceClpInvoker() {
        _methodName88 = "getBeanIdentifier";

        _methodParameterTypes88 = new String[] {  };

        _methodName89 = "setBeanIdentifier";

        _methodParameterTypes89 = new String[] { "java.lang.String" };

        _methodName94 = "add";

        _methodParameterTypes94 = new String[] {
                "java.lang.Long", "java.lang.Long", "java.lang.Long",
                "java.util.Date", "java.lang.String", "int", "double", "double",
                "double", "double", "double"
            };

        _methodName95 = "getByidLocation";

        _methodParameterTypes95 = new String[] { "long", "long" };

        _methodName96 = "getByidRace";

        _methodParameterTypes96 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return LocationServiceUtil.getBeanIdentifier();
        }

        if (_methodName89.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
            LocationServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName94.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
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

        if (_methodName95.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
            return LocationServiceUtil.getByidLocation(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return LocationServiceUtil.getByidRace((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
