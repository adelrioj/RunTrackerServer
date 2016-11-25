package es.eina.tfg.service.base;

import es.eina.tfg.service.EventServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class EventServiceClpInvoker {
    private String _methodName78;
    private String[] _methodParameterTypes78;
    private String _methodName79;
    private String[] _methodParameterTypes79;
    private String _methodName84;
    private String[] _methodParameterTypes84;
    private String _methodName85;
    private String[] _methodParameterTypes85;
    private String _methodName86;
    private String[] _methodParameterTypes86;
    private String _methodName87;
    private String[] _methodParameterTypes87;

    public EventServiceClpInvoker() {
        _methodName78 = "getBeanIdentifier";

        _methodParameterTypes78 = new String[] {  };

        _methodName79 = "setBeanIdentifier";

        _methodParameterTypes79 = new String[] { "java.lang.String" };

        _methodName84 = "add";

        _methodParameterTypes84 = new String[] {
                "long", "long", "java.lang.String", "java.util.Date",
                "java.util.Date", "java.util.Date", "java.util.Date"
            };

        _methodName85 = "update";

        _methodParameterTypes85 = new String[] {
                "long", "long", "java.lang.String", "java.util.Date",
                "java.util.Date", "java.util.Date", "java.util.Date"
            };

        _methodName86 = "delete";

        _methodParameterTypes86 = new String[] { "long" };

        _methodName87 = "getByidEvent";

        _methodParameterTypes87 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName78.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes78, parameterTypes)) {
            return EventServiceUtil.getBeanIdentifier();
        }

        if (_methodName79.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes79, parameterTypes)) {
            EventServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName84.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
            return EventServiceUtil.add(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.String) arguments[2], (java.util.Date) arguments[3],
                (java.util.Date) arguments[4], (java.util.Date) arguments[5],
                (java.util.Date) arguments[6]);
        }

        if (_methodName85.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
            return EventServiceUtil.update(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.String) arguments[2], (java.util.Date) arguments[3],
                (java.util.Date) arguments[4], (java.util.Date) arguments[5],
                (java.util.Date) arguments[6]);
        }

        if (_methodName86.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes86, parameterTypes)) {
            return EventServiceUtil.delete(((Long) arguments[0]).longValue());
        }

        if (_methodName87.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes87, parameterTypes)) {
            return EventServiceUtil.getByidEvent(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
