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

package es.eina.tfg.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.DeviceLocalServiceUtil;
import es.eina.tfg.service.DeviceServiceUtil;
import es.eina.tfg.service.Device_SensorLocalServiceUtil;
import es.eina.tfg.service.Device_SensorServiceUtil;
import es.eina.tfg.service.LocationLocalServiceUtil;
import es.eina.tfg.service.LocationServiceUtil;
import es.eina.tfg.service.PowerLocalServiceUtil;
import es.eina.tfg.service.PowerServiceUtil;
import es.eina.tfg.service.RaceLocalServiceUtil;
import es.eina.tfg.service.RaceServiceUtil;
import es.eina.tfg.service.RouteLocalServiceUtil;
import es.eina.tfg.service.RouteLocationLocalServiceUtil;
import es.eina.tfg.service.RouteLocationServiceUtil;
import es.eina.tfg.service.RouteServiceUtil;
import es.eina.tfg.service.SensorLocalServiceUtil;
import es.eina.tfg.service.SensorServiceUtil;
import es.eina.tfg.service.UserAdditionalDataLocalServiceUtil;
import es.eina.tfg.service.UserAdditionalDataServiceUtil;
import es.eina.tfg.service.UserSelectedRoutesLocalServiceUtil;
import es.eina.tfg.service.UserSelectedRoutesServiceUtil;

/**
 * @author adelrioj
 */
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			DeviceLocalServiceUtil.clearService();

			DeviceServiceUtil.clearService();
			Device_SensorLocalServiceUtil.clearService();

			Device_SensorServiceUtil.clearService();
			LocationLocalServiceUtil.clearService();

			LocationServiceUtil.clearService();
			PowerLocalServiceUtil.clearService();

			PowerServiceUtil.clearService();
			RaceLocalServiceUtil.clearService();

			RaceServiceUtil.clearService();
			RouteLocalServiceUtil.clearService();

			RouteServiceUtil.clearService();
			RouteLocationLocalServiceUtil.clearService();

			RouteLocationServiceUtil.clearService();
			SensorLocalServiceUtil.clearService();

			SensorServiceUtil.clearService();
			UserAdditionalDataLocalServiceUtil.clearService();

			UserAdditionalDataServiceUtil.clearService();
			UserSelectedRoutesLocalServiceUtil.clearService();

			UserSelectedRoutesServiceUtil.clearService();
		}
	}
}