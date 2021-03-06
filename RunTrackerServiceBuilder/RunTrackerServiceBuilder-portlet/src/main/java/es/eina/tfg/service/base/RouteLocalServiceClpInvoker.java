package es.eina.tfg.service.base;

import es.eina.tfg.service.RouteLocalServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RouteLocalServiceClpInvoker {
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
    private String _methodName125;
    private String[] _methodParameterTypes125;

    public RouteLocalServiceClpInvoker() {
        _methodName0 = "addRoute";

        _methodParameterTypes0 = new String[] { "es.eina.tfg.model.Route" };

        _methodName1 = "createRoute";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteRoute";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteRoute";

        _methodParameterTypes3 = new String[] { "es.eina.tfg.model.Route" };

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

        _methodName10 = "fetchRoute";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getRoute";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getRoutes";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getRoutesCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateRoute";

        _methodParameterTypes15 = new String[] { "es.eina.tfg.model.Route" };

        _methodName106 = "getBeanIdentifier";

        _methodParameterTypes106 = new String[] {  };

        _methodName107 = "setBeanIdentifier";

        _methodParameterTypes107 = new String[] { "java.lang.String" };

        _methodName112 = "generateNewIdRoute";

        _methodParameterTypes112 = new String[] {  };

        _methodName113 = "addRoute";

        _methodParameterTypes113 = new String[] { "es.eina.tfg.model.Route" };

        _methodName114 = "updateRoute";

        _methodParameterTypes114 = new String[] { "es.eina.tfg.model.Route" };

        _methodName116 = "getByAuthor";

        _methodParameterTypes116 = new String[] { "java.lang.Long" };

        _methodName117 = "getByisPublic";

        _methodParameterTypes117 = new String[] { "boolean" };

        _methodName118 = "getByisPublic";

        _methodParameterTypes118 = new String[] { "boolean", "int", "int" };

        _methodName119 = "getByName";

        _methodParameterTypes119 = new String[] {
                "java.lang.String", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName120 = "getByNameCount";

        _methodParameterTypes120 = new String[] { "java.lang.String" };

        _methodName121 = "getByIdUserAndName";

        _methodParameterTypes121 = new String[] {
                "long", "java.lang.String", "int", "int"
            };

        _methodName122 = "getByIdUserAndNameCount";

        _methodParameterTypes122 = new String[] { "long", "java.lang.String" };

        _methodName123 = "getPublicRoutesNotSelectedByUser";

        _methodParameterTypes123 = new String[] {
                "long", "java.lang.String", "int", "int"
            };

        _methodName124 = "getPublicRoutesNotSelectedByUserCount";

        _methodParameterTypes124 = new String[] { "long", "java.lang.String" };

        _methodName125 = "countByIdAuthor";

        _methodParameterTypes125 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return RouteLocalServiceUtil.addRoute((es.eina.tfg.model.Route) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return RouteLocalServiceUtil.createRoute(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return RouteLocalServiceUtil.deleteRoute(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return RouteLocalServiceUtil.deleteRoute((es.eina.tfg.model.Route) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return RouteLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return RouteLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return RouteLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return RouteLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return RouteLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return RouteLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return RouteLocalServiceUtil.fetchRoute(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return RouteLocalServiceUtil.getRoute(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return RouteLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return RouteLocalServiceUtil.getRoutes(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return RouteLocalServiceUtil.getRoutesCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return RouteLocalServiceUtil.updateRoute((es.eina.tfg.model.Route) arguments[0]);
        }

        if (_methodName106.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
            return RouteLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName107.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
            RouteLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName112.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
            return RouteLocalServiceUtil.generateNewIdRoute();
        }

        if (_methodName113.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
            return RouteLocalServiceUtil.addRoute((es.eina.tfg.model.Route) arguments[0]);
        }

        if (_methodName114.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
            return RouteLocalServiceUtil.updateRoute((es.eina.tfg.model.Route) arguments[0]);
        }

        if (_methodName116.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
            return RouteLocalServiceUtil.getByAuthor((java.lang.Long) arguments[0]);
        }

        if (_methodName117.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
            return RouteLocalServiceUtil.getByisPublic(((Boolean) arguments[0]).booleanValue());
        }

        if (_methodName118.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
            return RouteLocalServiceUtil.getByisPublic(((Boolean) arguments[0]).booleanValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName119.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
            return RouteLocalServiceUtil.getByName((java.lang.String) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName120.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
            return RouteLocalServiceUtil.getByNameCount((java.lang.String) arguments[0]);
        }

        if (_methodName121.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes121, parameterTypes)) {
            return RouteLocalServiceUtil.getByIdUserAndName(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                ((Integer) arguments[2]).intValue(),
                ((Integer) arguments[3]).intValue());
        }

        if (_methodName122.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
            return RouteLocalServiceUtil.getByIdUserAndNameCount(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1]);
        }

        if (_methodName123.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
            return RouteLocalServiceUtil.getPublicRoutesNotSelectedByUser(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1],
                ((Integer) arguments[2]).intValue(),
                ((Integer) arguments[3]).intValue());
        }

        if (_methodName124.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
            return RouteLocalServiceUtil.getPublicRoutesNotSelectedByUserCount(((Long) arguments[0]).longValue(),
                (java.lang.String) arguments[1]);
        }

        if (_methodName125.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
            return RouteLocalServiceUtil.countByIdAuthor(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
