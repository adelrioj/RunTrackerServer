package es.eina.tfg.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import es.eina.tfg.service.LocationServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link es.eina.tfg.service.LocationServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link es.eina.tfg.model.LocationSoap}.
 * If the method in the service utility returns a
 * {@link es.eina.tfg.model.Location}, that is translated to a
 * {@link es.eina.tfg.model.LocationSoap}. Methods that SOAP cannot
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
 * @see LocationServiceHttp
 * @see es.eina.tfg.model.LocationSoap
 * @see es.eina.tfg.service.LocationServiceUtil
 * @generated
 */
public class LocationServiceSoap {
    private static Log _log = LogFactoryUtil.getLog(LocationServiceSoap.class);

    public static es.eina.tfg.model.LocationSoap add(java.lang.Long raceId,
        java.lang.Long deviceId, java.lang.Long sensorId, java.util.Date time,
        java.lang.String sensorMode, int sysRef, double latitude,
        double longitude, double speed, double distance, double altitude)
        throws RemoteException {
        try {
            es.eina.tfg.model.Location returnValue = LocationServiceUtil.add(raceId,
                    deviceId, sensorId, time, sensorMode, sysRef, latitude,
                    longitude, speed, distance, altitude);

            return es.eina.tfg.model.LocationSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static es.eina.tfg.model.LocationSoap getByidLocation(
        long idMeasurement, long idRace) throws RemoteException {
        try {
            es.eina.tfg.model.Location returnValue = LocationServiceUtil.getByidLocation(idMeasurement,
                    idRace);

            return es.eina.tfg.model.LocationSoap.toSoapModel(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }

    public static es.eina.tfg.model.LocationSoap[] getByidRace(
        java.lang.Long idRace) throws RemoteException {
        try {
            java.util.List<es.eina.tfg.model.Location> returnValue = LocationServiceUtil.getByidRace(idRace);

            return es.eina.tfg.model.LocationSoap.toSoapModels(returnValue);
        } catch (Exception e) {
            _log.error(e, e);

            throw new RemoteException(e.getMessage());
        }
    }
}
