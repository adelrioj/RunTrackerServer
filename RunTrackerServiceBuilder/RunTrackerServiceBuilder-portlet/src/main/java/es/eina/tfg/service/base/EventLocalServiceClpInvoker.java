package es.eina.tfg.service.base;

import es.eina.tfg.service.EventLocalServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class EventLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName106;
    private String[] _methodParameterTypes106;
    private String _methodName107;
    private String[] _methodParameterTypes107;
    private String _methodName112;
    private String[] _methodParameterTypes112;
    private String _methodName113;
    private String[] _methodParameterTypes113;
    private String _methodName114;
    private String[] _methodParameterTypes114;
    private String _methodName116;
    private String[] _methodParameterTypes116;
    private String _methodName117;
    private String[] _methodParameterTypes117;
    private String _methodName118;
    private String[] _methodParameterTypes118;
    private String _methodName119;
    private String[] _methodParameterTypes119;
    private String _methodName120;
    private String[] _methodParameterTypes120;
    private String _methodName121;
    private String[] _methodParameterTypes121;
    private String _methodName122;
    private String[] _methodParameterTypes122;
    private String _methodName123;
    private String[] _methodParameterTypes123;
    private String _methodName124;
    private String[] _methodParameterTypes124;

    public EventLocalServiceClpInvoker() {
        _methodName0 = "addEvent";

        _methodParameterTypes0 = new String[] { "es.eina.tfg.model.Event" };

        _methodName1 = "createEvent";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteEvent";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteEvent";

        _methodParameterTypes3 = new String[] { "es.eina.tfg.model.Event" };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchEvent";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getEvent";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getEvents";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getEventsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateEvent";

        _methodParameterTypes15 = new String[] { "es.eina.tfg.model.Event" };

        _methodName106 = "getBeanIdentifier";

        _methodParameterTypes106 = new String[] {  };

        _methodName107 = "setBeanIdentifier";

        _methodParameterTypes107 = new String[] { "java.lang.String" };

        _methodName112 = "generateNewIdEvent";

        _methodParameterTypes112 = new String[] {  };

        _methodName113 = "addEvent";

        _methodParameterTypes113 = new String[] { "es.eina.tfg.model.Event" };

        _methodName114 = "updateEvent";

        _methodParameterTypes114 = new String[] { "es.eina.tfg.model.Event" };

        _methodName116 = "getByidAuthor";

        _methodParameterTypes116 = new String[] { "long" };

        _methodName117 = "getByidRoute";

        _methodParameterTypes117 = new String[] { "long" };

        _methodName118 = "getByPlannedStartTime";

        _methodParameterTypes118 = new String[] {
                "java.util.Date", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName119 = "getByIdUserAndTimeRange";

        _methodParameterTypes119 = new String[] {
                "long", "java.util.Date", "java.util.Date", "int", "int"
            };

        _methodName120 = "getLastEvent";

        _methodParameterTypes120 = new String[] { "long" };

        _methodName121 = "getLastUnselectedEvent";

        _methodParameterTypes121 = new String[] { "long" };

        _methodName122 = "getUnselectedEventsByIdUserAndTimeRange";

        _methodParameterTypes122 = new String[] {
                "long", "java.util.Date", "java.util.Date", "int", "int"
            };

        _methodName123 = "getLiveEvents";

        _methodParameterTypes123 = new String[] {
                "java.lang.String", "boolean", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName124 = "countByIdAuthor";

        _methodParameterTypes124 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return EventLocalServiceUtil.addEvent((es.eina.tfg.model.Event) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return EventLocalServiceUtil.createEvent(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return EventLocalServiceUtil.deleteEvent(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return EventLocalServiceUtil.deleteEvent((es.eina.tfg.model.Event) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return EventLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return EventLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return EventLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return EventLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return EventLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return EventLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return EventLocalServiceUtil.fetchEvent(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return EventLocalServiceUtil.getEvent(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return EventLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return EventLocalServiceUtil.getEvents(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return EventLocalServiceUtil.getEventsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return EventLocalServiceUtil.updateEvent((es.eina.tfg.model.Event) arguments[0]);
        }

        if (_methodName106.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
            return EventLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName107.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
            EventLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName112.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
            return EventLocalServiceUtil.generateNewIdEvent();
        }

        if (_methodName113.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
            return EventLocalServiceUtil.addEvent((es.eina.tfg.model.Event) arguments[0]);
        }

        if (_methodName114.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
            return EventLocalServiceUtil.updateEvent((es.eina.tfg.model.Event) arguments[0]);
        }

        if (_methodName116.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
            return EventLocalServiceUtil.getByidAuthor(((Long) arguments[0]).longValue());
        }

        if (_methodName117.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
            return EventLocalServiceUtil.getByidRoute(((Long) arguments[0]).longValue());
        }

        if (_methodName118.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
            return EventLocalServiceUtil.getByPlannedStartTime((java.util.Date) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName119.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
            return EventLocalServiceUtil.getByIdUserAndTimeRange(((Long) arguments[0]).longValue(),
                (java.util.Date) arguments[1], (java.util.Date) arguments[2],
                ((Integer) arguments[3]).intValue(),
                ((Integer) arguments[4]).intValue());
        }

        if (_methodName120.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
            return EventLocalServiceUtil.getLastEvent(((Long) arguments[0]).longValue());
        }

        if (_methodName121.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
            return EventLocalServiceUtil.getLastUnselectedEvent(((Long) arguments[0]).longValue());
        }

        if (_methodName122.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
            return EventLocalServiceUtil.getUnselectedEventsByIdUserAndTimeRange(((Long) arguments[0]).longValue(),
                (java.util.Date) arguments[1], (java.util.Date) arguments[2],
                ((Integer) arguments[3]).intValue(),
                ((Integer) arguments[4]).intValue());
        }

        if (_methodName123.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
            return EventLocalServiceUtil.getLiveEvents((java.lang.String) arguments[0],
                ((Boolean) arguments[1]).booleanValue(),
                ((Integer) arguments[2]).intValue(),
                ((Integer) arguments[3]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[4]);
        }

        if (_methodName124.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
            return EventLocalServiceUtil.countByIdAuthor(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
