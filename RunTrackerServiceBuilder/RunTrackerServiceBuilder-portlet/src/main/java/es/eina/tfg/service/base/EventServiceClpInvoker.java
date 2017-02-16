package es.eina.tfg.service.base;

import es.eina.tfg.service.EventServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class EventServiceClpInvoker {
    private String _methodName86;
    private String[] _methodParameterTypes86;
    private String _methodName87;
    private String[] _methodParameterTypes87;
    private String _methodName92;
    private String[] _methodParameterTypes92;
    private String _methodName93;
    private String[] _methodParameterTypes93;
    private String _methodName94;
    private String[] _methodParameterTypes94;
    private String _methodName95;
    private String[] _methodParameterTypes95;

    public EventServiceClpInvoker() {
        _methodName86 = "getBeanIdentifier";

        _methodParameterTypes86 = new String[] {  };

        _methodName87 = "setBeanIdentifier";

        _methodParameterTypes87 = new String[] { "java.lang.String" };

        _methodName92 = "add";

        _methodParameterTypes92 = new String[] {
                "long", "long", "java.lang.String", "java.util.Date",
                "java.util.Date", "java.util.Date", "java.util.Date"
            };

        _methodName93 = "update";

        _methodParameterTypes93 = new String[] {
                "long", "long", "java.lang.String", "java.util.Date",
                "java.util.Date", "java.util.Date", "java.util.Date"
            };

        _methodName94 = "delete";

        _methodParameterTypes94 = new String[] { "long" };

        _methodName95 = "getByidEvent";

        _methodParameterTypes95 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
            return EventServiceUtil.getBeanIdentifier();
        }

        if (_methodName87.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
            EventServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName92.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
            return EventServiceUtil.add(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.String) arguments[2], (java.util.Date) arguments[3],
                (java.util.Date) arguments[4], (java.util.Date) arguments[5],
                (java.util.Date) arguments[6]);
        }

        if (_methodName93.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
            return EventServiceUtil.update(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.String) arguments[2], (java.util.Date) arguments[3],
                (java.util.Date) arguments[4], (java.util.Date) arguments[5],
                (java.util.Date) arguments[6]);
        }

        if (_methodName94.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
            return EventServiceUtil.delete(((Long) arguments[0]).longValue());
        }

        if (_methodName95.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
            return EventServiceUtil.getByidEvent(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
