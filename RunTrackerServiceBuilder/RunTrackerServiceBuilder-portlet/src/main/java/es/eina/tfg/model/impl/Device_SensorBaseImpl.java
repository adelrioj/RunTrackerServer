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

package es.eina.tfg.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import es.eina.tfg.model.Device_Sensor;
import es.eina.tfg.service.Device_SensorLocalServiceUtil;

/**
 * The extended model base implementation for the Device_Sensor service. Represents a row in the &quot;GL_Device_Sensor&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Device_SensorImpl}.
 * </p>
 *
 * @author adelrioj
 * @see Device_SensorImpl
 * @see es.eina.tfg.model.Device_Sensor
 * @generated
 */
public abstract class Device_SensorBaseImpl extends Device_SensorModelImpl
	implements Device_Sensor {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a device_ sensor model instance should use the {@link Device_Sensor} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Device_SensorLocalServiceUtil.addDevice_Sensor(this);
		}
		else {
			Device_SensorLocalServiceUtil.updateDevice_Sensor(this);
		}
	}
}