package es.eina.tfg.service.base;

import es.eina.tfg.service.RouteLocationLocalServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class RouteLocationLocalServiceClpInvoker {
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
    private String _methodName115;
    private String[] _methodParameterTypes115;
    private String _methodName117;
    private String[] _methodParameterTypes117;
    private String _methodName118;
    private String[] _methodParameterTypes118;
    private String _methodName119;
    private String[] _methodParameterTypes119;
    private String _methodName120;
    private String[] _methodParameterTypes120;

    public RouteLocationLocalServiceClpInvoker() {
        _methodName0 = "addRouteLocation";

        _methodParameterTypes0 = new String[] { "es.eina.tfg.model.RouteLocation" };

        _methodName1 = "createRouteLocation";

        _methodParameterTypes1 = new String[] {
                "es.eina.tfg.service.persistence.RouteLocationPK"
            };

        _methodName2 = "deleteRouteLocation";

        _methodParameterTypes2 = new String[] {
                "es.eina.tfg.service.persistence.RouteLocationPK"
            };

        _methodName3 = "deleteRouteLocation";

        _methodParameterTypes3 = new String[] { "es.eina.tfg.model.RouteLocation" };

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

        _methodName10 = "fetchRouteLocation";

        _methodParameterTypes10 = new String[] {
                "es.eina.tfg.service.persistence.RouteLocationPK"
            };

        _methodName11 = "getRouteLocation";

        _methodParameterTypes11 = new String[] {
                "es.eina.tfg.service.persistence.RouteLocationPK"
            };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getRouteLocations";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getRouteLocationsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateRouteLocation";

        _methodParameterTypes15 = new String[] { "es.eina.tfg.model.RouteLocation" };

        _methodName106 = "getBeanIdentifier";

        _methodParameterTypes106 = new String[] {  };

        _methodName107 = "setBeanIdentifier";

        _methodParameterTypes107 = new String[] { "java.lang.String" };

        _methodName112 = "generateNewIdRouteLocation";

        _methodParameterTypes112 = new String[] { "long" };

        _methodName113 = "createRouteLocation";

        _methodParameterTypes113 = new String[] { "long", "long" };

        _methodName114 = "addRouteLocation";

        _methodParameterTypes114 = new String[] {
                "es.eina.tfg.model.RouteLocation"
            };

        _methodName115 = "updateRouteLocation";

        _methodParameterTypes115 = new String[] {
                "es.eina.tfg.model.RouteLocation"
            };

        _methodName117 = "deleteByIdRoute";

        _methodParameterTypes117 = new String[] { "long" };

        _methodName118 = "getByidRoute";

        _methodParameterTypes118 = new String[] { "java.lang.Long" };

        _methodName119 = "getByidRoute";

        _methodParameterTypes119 = new String[] { "long", "int", "int" };

        _methodName120 = "getByidRouteCount";

        _methodParameterTypes120 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return RouteLocationLocalServiceUtil.addRouteLocation((es.eina.tfg.model.RouteLocation) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return RouteLocationLocalServiceUtil.createRouteLocation((es.eina.tfg.service.persistence.RouteLocationPK) arguments[0]);
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return RouteLocationLocalServiceUtil.deleteRouteLocation((es.eina.tfg.service.persistence.RouteLocationPK) arguments[0]);
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return RouteLocationLocalServiceUtil.deleteRouteLocation((es.eina.tfg.model.RouteLocation) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return RouteLocationLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return RouteLocationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return RouteLocationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return RouteLocationLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return RouteLocationLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return RouteLocationLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return RouteLocationLocalServiceUtil.fetchRouteLocation((es.eina.tfg.service.persistence.RouteLocationPK) arguments[0]);
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return RouteLocationLocalServiceUtil.getRouteLocation((es.eina.tfg.service.persistence.RouteLocationPK) arguments[0]);
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return RouteLocationLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return RouteLocationLocalServiceUtil.getRouteLocations(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return RouteLocationLocalServiceUtil.getRouteLocationsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return RouteLocationLocalServiceUtil.updateRouteLocation((es.eina.tfg.model.RouteLocation) arguments[0]);
        }

        if (_methodName106.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
            return RouteLocationLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName107.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes107, parameterTypes)) {
            RouteLocationLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName112.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
            return RouteLocationLocalServiceUtil.generateNewIdRouteLocation(((Long) arguments[0]).longValue());
        }

        if (_methodName113.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
            return RouteLocationLocalServiceUtil.createRouteLocation(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue());
        }

        if (_methodName114.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
            return RouteLocationLocalServiceUtil.addRouteLocation((es.eina.tfg.model.RouteLocation) arguments[0]);
        }

        if (_methodName115.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
            return RouteLocationLocalServiceUtil.updateRouteLocation((es.eina.tfg.model.RouteLocation) arguments[0]);
        }

        if (_methodName117.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
            RouteLocationLocalServiceUtil.deleteByIdRoute(((Long) arguments[0]).longValue());

            return null;
        }

        if (_methodName118.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
            return RouteLocationLocalServiceUtil.getByidRoute((java.lang.Long) arguments[0]);
        }

        if (_methodName119.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
            return RouteLocationLocalServiceUtil.getByidRoute(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName120.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes120, parameterTypes)) {
            return RouteLocationLocalServiceUtil.getByidRouteCount((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
