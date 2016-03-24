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
 * Provides a wrapper for {@link SensorLocalService}.
 *
 * @author adelrioj
 * @see SensorLocalService
 * @generated
 */
public class SensorLocalServiceWrapper implements SensorLocalService,
	ServiceWrapper<SensorLocalService> {
	public SensorLocalServiceWrapper(SensorLocalService sensorLocalService) {
		_sensorLocalService = sensorLocalService;
	}

	/**
	* Adds the sensor to the database. Also notifies the appropriate model listeners.
	*
	* @param sensor the sensor
	* @return the sensor that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Sensor addSensor(es.eina.tfg.model.Sensor sensor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sensorLocalService.addSensor(sensor);
	}

	/**
	* Creates a new sensor with the primary key. Does not add the sensor to the database.
	*
	* @param sensorId the primary key for the new sensor
	* @return the new sensor
	*/
	@Override
	public es.eina.tfg.model.Sensor createSensor(long sensorId) {
		return _sensorLocalService.createSensor(sensorId);
	}

	/**
	* Deletes the sensor with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sensorId the primary key of the sensor
	* @return the sensor that was removed
	* @throws PortalException if a sensor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Sensor deleteSensor(long sensorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sensorLocalService.deleteSensor(sensorId);
	}

	/**
	* Deletes the sensor from the database. Also notifies the appropriate model listeners.
	*
	* @param sensor the sensor
	* @return the sensor that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Sensor deleteSensor(
		es.eina.tfg.model.Sensor sensor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sensorLocalService.deleteSensor(sensor);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sensorLocalService.dynamicQuery();
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
		return _sensorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _sensorLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _sensorLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _sensorLocalService.dynamicQueryCount(dynamicQuery);
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
		return _sensorLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public es.eina.tfg.model.Sensor fetchSensor(long sensorId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sensorLocalService.fetchSensor(sensorId);
	}

	/**
	* Returns the sensor with the primary key.
	*
	* @param sensorId the primary key of the sensor
	* @return the sensor
	* @throws PortalException if a sensor with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Sensor getSensor(long sensorId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sensorLocalService.getSensor(sensorId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _sensorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the sensors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link es.eina.tfg.model.impl.SensorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sensors
	* @param end the upper bound of the range of sensors (not inclusive)
	* @return the range of sensors
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<es.eina.tfg.model.Sensor> getSensors(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _sensorLocalService.getSensors(start, end);
	}

	/**
	* Returns the number of sensors.
	*
	* @return the number of sensors
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getSensorsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sensorLocalService.getSensorsCount();
	}

	/**
	* Updates the sensor in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param sensor the sensor
	* @return the sensor that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public es.eina.tfg.model.Sensor updateSensor(
		es.eina.tfg.model.Sensor sensor)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sensorLocalService.updateSensor(sensor);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _sensorLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_sensorLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sensorLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public es.eina.tfg.model.Sensor add(java.lang.Integer type,
		java.lang.String description, java.lang.String dataUnits,
		java.lang.String dataType, java.lang.String dataUncertainity,
		java.lang.String dataLowerRange, java.lang.String dataUpperRange,
		java.lang.String dataPacketFormat)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _sensorLocalService.add(type, description, dataUnits, dataType,
			dataUncertainity, dataLowerRange, dataUpperRange, dataPacketFormat);
	}

	@Override
	public es.eina.tfg.model.Sensor update(java.lang.Long sensorId,
		java.lang.Integer type, java.lang.String description,
		java.lang.String dataUnits, java.lang.String dataType,
		java.lang.String dataUncertainity, java.lang.String dataLowerRange,
		java.lang.String dataUpperRange, java.lang.String dataPacketFormat)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingSensorException {
		return _sensorLocalService.update(sensorId, type, description,
			dataUnits, dataType, dataUncertainity, dataLowerRange,
			dataUpperRange, dataPacketFormat);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public SensorLocalService getWrappedSensorLocalService() {
		return _sensorLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedSensorLocalService(
		SensorLocalService sensorLocalService) {
		_sensorLocalService = sensorLocalService;
	}

	@Override
	public SensorLocalService getWrappedService() {
		return _sensorLocalService;
	}

	@Override
	public void setWrappedService(SensorLocalService sensorLocalService) {
		_sensorLocalService = sensorLocalService;
	}

	private SensorLocalService _sensorLocalService;
}