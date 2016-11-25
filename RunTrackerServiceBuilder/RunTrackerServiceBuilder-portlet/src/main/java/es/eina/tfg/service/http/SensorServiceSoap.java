package es.eina.tfg.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import es.eina.tfg.service.SensorServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link es.eina.tfg.service.SensorServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link es.eina.tfg.model.SensorSoap}.
 * If the method in the service utility returns a
 * {@link es.eina.tfg.model.Sensor}, that is translated to a
 * {@link es.eina.tfg.model.SensorSoap}. Methods that SOAP cannot
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
 * @see SensorServiceHttp
 * @see es.eina.tfg.model.SensorSoap
 * @see es.eina.tfg.service.SensorServiceUtil
 * @generated
 */
public class SensorServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(SensorServiceSoap.class);

    public static es.eina.tfg.model.SensorSoap getSensor(
        java.lang.Long sensorId) throws RemoteException {
        try {
            es.eina.tfg.model.Sensor returnValue = SensorServiceUtil.getSensor(sensorId);

            return es.eina.tfg.model.SensorSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
