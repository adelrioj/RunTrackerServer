package es.eina.tfg.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import es.eina.tfg.NonExistingUserException;
import es.eina.tfg.RouteAlreadySelectedByUserException;
import es.eina.tfg.model.UserSelectedRoutes;
import es.eina.tfg.service.base.UserSelectedRoutesLocalServiceBaseImpl;
import es.eina.tfg.service.persistence.UserSelectedRoutesPK;
import es.eina.tfg.service.persistence.UserSelectedRoutesUtil;

import java.util.List;

/**
 * The implementation of the user selected routes local service.
 *
 * <p>
 * This is a local service.
 * Methods of this service will not have security checks based on the propagated JAAS credentials
 * because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adelrioj
 * @see es.eina.tfg.service.base.UserSelectedRoutesLocalServiceBaseImpl
 * @see es.eina.tfg.service.UserSelectedRoutesLocalServiceUtil
 */
public class UserSelectedRoutesLocalServiceImpl extends UserSelectedRoutesLocalServiceBaseImpl {

	public UserSelectedRoutes add(Long userId, Long routeId) throws NonExistingUserException, RouteAlreadySelectedByUserException, SystemException {
		UserSelectedRoutesPK primaryKey = new UserSelectedRoutesPK(userId, routeId);
		UserSelectedRoutes userSelectedRoutes;
		try {
			userSelectedRoutes = fetchUserSelectedRoutes(primaryKey);
		} catch (SystemException e) {
			throw new NonExistingUserException(e);
		}
		if (userSelectedRoutes == null){
			userSelectedRoutes = createUserSelectedRoutes(primaryKey);
		}else {
			throw new RouteAlreadySelectedByUserException("User: " + userId + "already selected route: " + routeId);
		}
		return updateUserSelectedRoutes(userSelectedRoutes);
	}

	public List<UserSelectedRoutes> findByUser(Long userId) throws SystemException {
		return UserSelectedRoutesUtil.findByuserId(userId);
	}
}