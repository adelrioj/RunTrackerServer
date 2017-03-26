package es.eina.tfg.service.base;

import es.eina.tfg.service.LocationServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class LocationServiceClpInvoker {
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

    public LocationServiceClpInvoker() {
        _methodName90 = "getBeanIdentifier";

        _methodParameterTypes90 = new String[] {  };

        _methodName91 = "setBeanIdentifier";

        _methodParameterTypes91 = new String[] { "java.lang.String" };

        _methodName96 = "add";

        _methodParameterTypes96 = new String[] {
                "java.lang.Long", "java.lang.Long", "java.lang.Long",
                "java.util.Date", "java.lang.String", "int", "double", "double",
                "double", "double", "double"
            };

        _methodName97 = "getByidLocation";

        _methodParameterTypes97 = new String[] { "long", "long" };

        _methodName98 = "getByidRace";

        _methodParameterTypes98 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return LocationServiceUtil.getBeanIdentifier();
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            LocationServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
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

        if (_methodName97.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes97, parameterTypes)) {
            return LocationServiceUtil.getByidLocation(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName98.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes98, parameterTypes)) {
            return LocationServiceUtil.getByidRace((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
