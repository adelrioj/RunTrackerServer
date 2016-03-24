/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package es.eina.tfg.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PowerLocalService}.
 *
 * @author adelrioj
 * @see PowerLocalService
 * @generated
 */
public class PowerLocalServiceWrapper implements PowerLocalService,
	ServiceWrapper<PowerLocalService> {
	public PowerLocalServiceWrapper(PowerLocalService powerLocalService) {
		_powerLocalService = powerLocalService;
	}

	/**
	* Adds the power to the database. Also notifies the appropriate model listeners.
	*
	* @param power the power
	* @return the power that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Power addPower(es.eina.tfg.model.Power power)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _powerLocalService.addPower(power);
	}

	/**
	* Creates a new power with the primary key. Does not add the power to the database.
	*
	* @param measurementId the primary key for the new power
	* @return the new power
	*/
	@Override
	public es.eina.tfg.model.Power createPower(long measurementId) {
		return _powerLocalService.createPower(measurementId);
	}

	/**
	* Deletes the power with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param measurementId the primary key of the power
	* @return the power that was removed
	* @throws PortalException if a power with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Power deletePower(long measurementId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _powerLocalService.deletePower(measurementId);
	}

	/**
	* Deletes the power from the database. Also notifies the appropriate model listeners.
	*
	* @param power the power
	* @return the power that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Power deletePower(es.eina.tfg.model.Power power)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _powerLocalService.deletePower(power);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _powerLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _powerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.PowerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _powerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.PowerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _powerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _powerLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _powerLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public es.eina.tfg.model.Power fetchPower(long measurementId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _powerLocalService.fetchPower(measurementId);
	}

	/**
	* Returns the power with the primary key.
	*
	* @param measurementId the primary key of the power
	* @return the power
	* @throws PortalException if a power with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Power getPower(long measurementId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _powerLocalService.getPower(measurementId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _powerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the powers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.PowerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of powers
	* @param end the upper bound of the range of powers (not inclusive)
	* @return the range of powers
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.eina.tfg.model.Power> getPowers(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _powerLocalService.getPowers(start, end);
	}

	/**
	* Returns the number of powers.
	*
	* @return the number of powers
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPowersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _powerLocalService.getPowersCount();
	}

	/**
	* Updates the power in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param power the power
	* @return the power that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Power updatePower(es.eina.tfg.model.Power power)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _powerLocalService.updatePower(power);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _powerLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_powerLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _powerLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public es.eina.tfg.model.Power add(java.lang.Long raceId,
		java.lang.Long userId, java.lang.Long deviceId,
		java.lang.Long sensorId, java.util.Date time,
		java.lang.String sensorMode, java.lang.Integer level)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingDeviceAndSensorRelationException,
			es.eina.tfg.NonExistingRaceException,
			es.eina.tfg.NonExistingUserException {
		return _powerLocalService.add(raceId, userId, deviceId, sensorId, time,
			sensorMode, level);
	}

	@Override
	public es.eina.tfg.model.Power update(java.lang.Long measurementId,
		java.lang.Long raceId, java.lang.Long userId, java.lang.Long deviceId,
		java.lang.Long sensorId, java.util.Date time,
		java.lang.String sensorMode, java.lang.Integer level)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingDeviceAndSensorRelationException,
			es.eina.tfg.NonExistingMeasurementException,
			es.eina.tfg.NonExistingRaceException,
			es.eina.tfg.NonExistingUserException {
		return _powerLocalService.update(measurementId, raceId, userId,
			deviceId, sensorId, time, sensorMode, level);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PowerLocalService getWrappedPowerLocalService() {
		return _powerLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPowerLocalService(PowerLocalService powerLocalService) {
		_powerLocalService = powerLocalService;
	}

	@Override
	public PowerLocalService getWrappedService() {
		return _powerLocalService;
	}

	@Override
	public void setWrappedService(PowerLocalService powerLocalService) {
		_powerLocalService = powerLocalService;
	}

	private PowerLocalService _powerLocalService;
}