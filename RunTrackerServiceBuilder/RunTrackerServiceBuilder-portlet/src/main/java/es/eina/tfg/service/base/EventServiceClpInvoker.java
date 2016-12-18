package es.eina.tfg.service.base;

import es.eina.tfg.service.EventServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class EventServiceClpInvoker {
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

    public EventServiceClpInvoker() {
        _methodName80 = "getBeanIdentifier";

        _methodParameterTypes80 = new String[] {  };

        _methodName81 = "setBeanIdentifier";

        _methodParameterTypes81 = new String[] { "java.lang.String" };

        _methodName86 = "add";

        _methodParameterTypes86 = new String[] {
                "long", "long", "java.lang.String", "java.util.Date",
                "java.util.Date", "java.util.Date", "java.util.Date"
            };

        _methodName87 = "update";

        _methodParameterTypes87 = new String[] {
                "long", "long", "java.lang.String", "java.util.Date",
                "java.util.Date", "java.util.Date", "java.util.Date"
            };

        _methodName88 = "delete";

        _methodParameterTypes88 = new String[] { "long" };

        _methodName89 = "getByidEvent";

        _methodParameterTypes89 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName80.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes80, parameterTypes)) {
            return EventServiceUtil.getBeanIdentifier();
        }

        if (_methodName81.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes81, parameterTypes)) {
            EventServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
            return EventServiceUtil.add(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.String) arguments[2], (java.util.Date) arguments[3],
                (java.util.Date) arguments[4], (java.util.Date) arguments[5],
                (java.util.Date) arguments[6]);
        }

        if (_methodName87.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
            return EventServiceUtil.update(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.String) arguments[2], (java.util.Date) arguments[3],
                (java.util.Date) arguments[4], (java.util.Date) arguments[5],
                (java.util.Date) arguments[6]);
        }

        if (_methodName88.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes88, parameterTypes)) {
            return EventServiceUtil.delete(((Long) arguments[0]).longValue());
        }

        if (_methodName89.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes89, parameterTypes)) {
            return EventServiceUtil.getByidEvent(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
