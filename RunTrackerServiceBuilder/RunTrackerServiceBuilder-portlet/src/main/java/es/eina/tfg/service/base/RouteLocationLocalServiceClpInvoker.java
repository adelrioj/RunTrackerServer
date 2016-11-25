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
    private String _methodName94;
    private String[] _methodParameterTypes94;
    private String _methodName95;
    private String[] _methodParameterTypes95;
    private String _methodName100;
    private String[] _methodParameterTypes100;
    private String _methodName101;
    private String[] _methodParameterTypes101;
    private String _methodName102;
    private String[] _methodParameterTypes102;
    private String _methodName104;
    private String[] _methodParameterTypes104;
    private String _methodName105;
    private String[] _methodParameterTypes105;
    private String _methodName106;
    private String[] _methodParameterTypes106;

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

        _methodName94 = "getBeanIdentifier";

        _methodParameterTypes94 = new String[] {  };

        _methodName95 = "setBeanIdentifier";

        _methodParameterTypes95 = new String[] { "java.lang.String" };

        _methodName100 = "generateNewIdRouteLocation";

        _methodParameterTypes100 = new String[] { "long" };

        _methodName101 = "addRouteLocation";

        _methodParameterTypes101 = new String[] {
                "es.eina.tfg.model.RouteLocation"
            };

        _methodName102 = "updateRouteLocation";

        _methodParameterTypes102 = new String[] {
                "es.eina.tfg.model.RouteLocation"
            };

        _methodName104 = "getByidRoute";

        _methodParameterTypes104 = new String[] { "java.lang.Long" };

        _methodName105 = "getByidRoute";

        _methodParameterTypes105 = new String[] { "long", "int", "int" };

        _methodName106 = "getByidRouteCount";

        _methodParameterTypes106 = new String[] { "java.lang.Long" };
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

        if (_methodName94.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
            return RouteLocationLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName95.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
            RouteLocationLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName100.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
            return RouteLocationLocalServiceUtil.generateNewIdRouteLocation(((Long) arguments[0]).longValue());
        }

        if (_methodName101.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
            return RouteLocationLocalServiceUtil.addRouteLocation((es.eina.tfg.model.RouteLocation) arguments[0]);
        }

        if (_methodName102.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes102, parameterTypes)) {
            return RouteLocationLocalServiceUtil.updateRouteLocation((es.eina.tfg.model.RouteLocation) arguments[0]);
        }

        if (_methodName104.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
            return RouteLocationLocalServiceUtil.getByidRoute((java.lang.Long) arguments[0]);
        }

        if (_methodName105.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
            return RouteLocationLocalServiceUtil.getByidRoute(((Long) arguments[0]).longValue(),
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName106.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
            return RouteLocationLocalServiceUtil.getByidRouteCount((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
