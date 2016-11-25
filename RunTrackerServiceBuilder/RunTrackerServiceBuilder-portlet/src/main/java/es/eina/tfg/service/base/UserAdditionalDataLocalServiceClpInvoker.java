package es.eina.tfg.service.base;

import es.eina.tfg.service.UserAdditionalDataLocalServiceUtil;

import java.util.Arrays;

/**
 * @author adelrioj
 * @generated
 */
public class UserAdditionalDataLocalServiceClpInvoker {
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
    private String _methodName103;
    private String[] _methodParameterTypes103;
    private String _methodName104;
    private String[] _methodParameterTypes104;
    private String _methodName105;
    private String[] _methodParameterTypes105;

    public UserAdditionalDataLocalServiceClpInvoker() {
        _methodName0 = "addUserAdditionalData";

        _methodParameterTypes0 = new String[] {
                "es.eina.tfg.model.UserAdditionalData"
            };

        _methodName1 = "createUserAdditionalData";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteUserAdditionalData";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteUserAdditionalData";

        _methodParameterTypes3 = new String[] {
                "es.eina.tfg.model.UserAdditionalData"
            };

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

        _methodName10 = "fetchUserAdditionalData";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getUserAdditionalData";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getUserAdditionalDatas";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getUserAdditionalDatasCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateUserAdditionalData";

        _methodParameterTypes15 = new String[] {
                "es.eina.tfg.model.UserAdditionalData"
            };

        _methodName94 = "getBeanIdentifier";

        _methodParameterTypes94 = new String[] {  };

        _methodName95 = "setBeanIdentifier";

        _methodParameterTypes95 = new String[] { "java.lang.String" };

        _methodName100 = "addUserAdditionalData";

        _methodParameterTypes100 = new String[] {
                "es.eina.tfg.model.UserAdditionalData"
            };

        _methodName101 = "updateUserAdditionalData";

        _methodParameterTypes101 = new String[] {
                "es.eina.tfg.model.UserAdditionalData"
            };

        _methodName103 = "getUserAndRoute";

        _methodParameterTypes103 = new String[] { "java.lang.Long" };

        _methodName104 = "getAssociatedRoutes";

        _methodParameterTypes104 = new String[] { "java.lang.Long" };

        _methodName105 = "getAssociatedEvents";

        _methodParameterTypes105 = new String[] { "java.lang.Long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.addUserAdditionalData((es.eina.tfg.model.UserAdditionalData) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.createUserAdditionalData(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.deleteUserAdditionalData(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.deleteUserAdditionalData((es.eina.tfg.model.UserAdditionalData) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.fetchUserAdditionalData(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.getUserAdditionalData(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.getUserAdditionalDatas(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.getUserAdditionalDatasCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.updateUserAdditionalData((es.eina.tfg.model.UserAdditionalData) arguments[0]);
        }

        if (_methodName94.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes94, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName95.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes95, parameterTypes)) {
            UserAdditionalDataLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName100.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes100, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.addUserAdditionalData((es.eina.tfg.model.UserAdditionalData) arguments[0]);
        }

        if (_methodName101.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes101, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.updateUserAdditionalData((es.eina.tfg.model.UserAdditionalData) arguments[0]);
        }

        if (_methodName103.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes103, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.getUserAndRoute((java.lang.Long) arguments[0]);
        }

        if (_methodName104.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes104, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.getAssociatedRoutes((java.lang.Long) arguments[0]);
        }

        if (_methodName105.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
            return UserAdditionalDataLocalServiceUtil.getAssociatedEvents((java.lang.Long) arguments[0]);
        }

        throw new UnsupportedOperationException();
    }
}
