package es.eina.tfg.service.base;

import es.eina.tfg.service.PowerServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class PowerServiceClpInvoker {
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

    public PowerServiceClpInvoker() {
        _methodName88 = "getBeanIdentifier";

        _methodParameterTypes88 = new String[] {  };

        _methodName89 = "setBeanIdentifier";

        _methodParameterTypes89 = new String[] { "java.lang.String" };

        _methodName94 = "add";

        _methodParameterTypes94 = new String[] {
                "java.lang.Long", "java.lang.Long", "java.lang.Long",
                "java.util.Date", "java.lang.String", "java.lang.Integer"
            };

        _methodName95 = "getPower";

        _methodParameterTypes95 = new String[] { "long", "long" };

        _methodName96 = "getByidRace";

        _methodParameterTypes96 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return PowerServiceUtil.getBeanIdentifier();
        }

        if (_methodName89.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
            PowerServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName94.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
            return PowerServiceUtil.add((java.lang.Long) arguments[0],
                (java.lang.Long) arguments[1], (java.lang.Long) arguments[2],
                (java.util.Date) arguments[3], (java.lang.String) arguments[4],
                (java.lang.Integer) arguments[5]);
        }

        if (_methodName95.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
            return PowerServiceUtil.getPower(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName96.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes96, parameterTypes)) {
            return PowerServiceUtil.getByidRace((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
