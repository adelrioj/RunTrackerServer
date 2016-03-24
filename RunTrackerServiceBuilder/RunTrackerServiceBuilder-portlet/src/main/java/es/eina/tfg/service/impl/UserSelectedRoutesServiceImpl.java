package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NonExistingUserException;
import es.eina.tfg.RouteAlreadySelectedByUserException;
import es.eina.tfg.model.UserSelectedRoutes;
import es.eina.tfg.service.UserSelectedRoutesLocalServiceUtil;
import es.eina.tfg.service.base.UserSelectedRoutesServiceBaseImpl;
import es.eina.tfg.service.persistence.UserSelectedRoutesPK;

/**
 * The implementation of the user selected routes remote service.
 *
 *
 * <p>
 * All custom service methods should be put in this class.
 * Whenever methods are added, rerun ServiceBuilder to copy their definitions
 * into the {@link es.eina.tfg.service.UserSelectedRoutesService} interface.
 * <p>
 * This is a remote service.
 * Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author adelrioj
 * @see es.eina.tfg.service.base.UserSelectedRoutesServiceBaseImpl
 * @see es.eina.tfg.service.UserSelectedRoutesServiceUtil
 */
public class UserSelectedRoutesServiceImpl extends UserSelectedRoutesServiceBaseImpl {
	public UserSelectedRoutes add(Long userId, Long routeId) throws NonExistingUserException, RouteAlreadySelectedByUserException, SystemException {
		return UserSelectedRoutesLocalServiceUtil.add(userId, routeId);
	}

	public UserSelectedRoutes delete(Long userId, Long routeId) throws SystemException, PortalException {
		return UserSelectedRoutesLocalServiceUtil.deleteUserSelectedRoutes(new UserSelectedRoutesPK(userId, routeId));
	}

	public UserSelectedRoutes getUserSelectedRoute(Long userId, Long routeId) throws SystemException, PortalException {
		return UserSelectedRoutesLocalServiceUtil.getUserSelectedRoutes(new UserSelectedRoutesPK(userId, routeId));
	}
}