package es.eina.tfg.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import es.eina.tfg.service.UserAdditionalDataServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link es.eina.tfg.service.UserAdditionalDataServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link es.eina.tfg.model.UserAdditionalDataSoap}.
 * If the method in the service utility returns a
 * {@link es.eina.tfg.model.UserAdditionalData}, that is translated to a
 * {@link es.eina.tfg.model.UserAdditionalDataSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author adelrioj
 * @see UserAdditionalDataServiceHttp
 * @see es.eina.tfg.model.UserAdditionalDataSoap
 * @see es.eina.tfg.service.UserAdditionalDataServiceUtil
 * @generated
 */
public class UserAdditionalDataServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(UserAdditionalDataServiceSoap.class);

    public static es.eina.tfg.model.UserAdditionalDataSoap add(
        java.lang.Long userId, java.lang.Integer weight,
        java.lang.Integer height, java.lang.String registerType)
        throws RemoteException {
        try {
            es.eina.tfg.model.UserAdditionalData returnValue = UserAdditionalDataServiceUtil.add(userId,
                    weight, height, registerType);

            return es.eina.tfg.model.UserAdditionalDataSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static es.eina.tfg.model.UserAdditionalDataSoap update(
        java.lang.Long userId, java.lang.Integer weight,
        java.lang.Integer height, java.lang.String registerType,
        java.lang.Long smsCount) throws RemoteException {
        try {
            es.eina.tfg.model.UserAdditionalData returnValue = UserAdditionalDataServiceUtil.update(userId,
                    weight, height, registerType, smsCount);

            return es.eina.tfg.model.UserAdditionalDataSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static es.eina.tfg.model.UserAdditionalDataSoap delete(
        java.lang.Long userId) throws RemoteException {
        try {
            es.eina.tfg.model.UserAdditionalData returnValue = UserAdditionalDataServiceUtil.delete(userId);

            return es.eina.tfg.model.UserAdditionalDataSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static es.eina.tfg.model.UserAdditionalDataSoap getUserAdditionalData(
        java.lang.Long userId) throws RemoteException {
        try {
            es.eina.tfg.model.UserAdditionalData returnValue = UserAdditionalDataServiceUtil.getUserAdditionalData(userId);

            return es.eina.tfg.model.UserAdditionalDataSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static es.eina.tfg.model.UserSelectedRoutesSoap[] getUserSelectedRoutes(
        java.lang.Long userId) throws RemoteException {
        try {
            java.util.List<es.eina.tfg.model.UserSelectedRoutes> returnValue = UserAdditionalDataServiceUtil.getUserSelectedRoutes(userId);

            return es.eina.tfg.model.UserSelectedRoutesSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
