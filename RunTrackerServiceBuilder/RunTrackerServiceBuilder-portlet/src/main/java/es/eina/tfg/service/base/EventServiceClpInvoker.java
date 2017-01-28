package es.eina.tfg.service.base;

import es.eina.tfg.service.EventServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class EventServiceClpInvoker {
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
    private String _methodName93;
    private String[] _methodParameterTypes93;

    public EventServiceClpInvoker() {
        _methodName84 = "getBeanIdentifier";

        _methodParameterTypes84 = new String[] {  };

        _methodName85 = "setBeanIdentifier";

        _methodParameterTypes85 = new String[] { "java.lang.String" };

        _methodName90 = "add";

        _methodParameterTypes90 = new String[] {
                "long", "long", "java.lang.String", "java.util.Date",
                "java.util.Date", "java.util.Date", "java.util.Date"
            };

        _methodName91 = "update";

        _methodParameterTypes91 = new String[] {
                "long", "long", "java.lang.String", "java.util.Date",
                "java.util.Date", "java.util.Date", "java.util.Date"
            };

        _methodName92 = "delete";

        _methodParameterTypes92 = new String[] { "long" };

        _methodName93 = "getByidEvent";

        _methodParameterTypes93 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName84.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes84, parameterTypes)) {
            return EventServiceUtil.getBeanIdentifier();
        }

        if (_methodName85.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes85, parameterTypes)) {
            EventServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName90.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes90, parameterTypes)) {
            return EventServiceUtil.add(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.String) arguments[2], (java.util.Date) arguments[3],
                (java.util.Date) arguments[4], (java.util.Date) arguments[5],
                (java.util.Date) arguments[6]);
        }

        if (_methodName91.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes91, parameterTypes)) {
            return EventServiceUtil.update(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                (java.lang.String) arguments[2], (java.util.Date) arguments[3],
                (java.util.Date) arguments[4], (java.util.Date) arguments[5],
                (java.util.Date) arguments[6]);
        }

        if (_methodName92.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes92, parameterTypes)) {
            return EventServiceUtil.delete(((Long) arguments[0]).longValue());
        }

        if (_methodName93.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes93, parameterTypes)) {
            return EventServiceUtil.getByidEvent(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
