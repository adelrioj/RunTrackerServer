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

import com.liferay.portal.service.InvokableService;

/**
 * @author adelrioj
 * @generated
 */
public class DeviceServiceClp implements DeviceService {
	public DeviceServiceClp(InvokableService invokableService) {
		_invokableService = invokableService;

		_methodName0 = "getBeanIdentifier";

		_methodParameterTypes0 = new String[] {  };

		_methodName1 = "setBeanIdentifier";

		_methodParameterTypes1 = new String[] { "java.lang.String" };

		_methodName3 = "add";

		_methodParameterTypes3 = new String[] {
				"java.lang.Long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String"
			};

		_methodName4 = "update";

		_methodParameterTypes4 = new String[] {
				"java.lang.Long", "java.lang.String", "java.lang.Long",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String"
			};

		_methodName5 = "delete";

		_methodParameterTypes5 = new String[] { "java.lang.Long" };

		_methodName6 = "getDevice";

		_methodParameterTypes6 = new String[] { "java.lang.Long" };

		_methodName7 = "getSensors";

		_methodParameterTypes7 = new String[] { "java.lang.Long" };

		_methodName8 = "getActiveSensors";

		_methodParameterTypes8 = new String[] { "java.lang.Long" };

		_methodName9 = "getDeviceByPhoneNumber";

		_methodParameterTypes9 = new String[] { "java.lang.String" };

		_methodName10 = "findByUserId";

		_methodParameterTypes10 = new String[] { "java.lang.Long" };

		_methodName11 = "findByDeviceUUID";

		_methodParameterTypes11 = new String[] { "java.lang.String" };

		_methodName12 = "findByStatus";

		_methodParameterTypes12 = new String[] { "java.lang.String" };

		_methodName13 = "findByStatus";

		_methodParameterTypes13 = new String[] { "java.lang.String", "int", "int" };
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName0,
					_methodParameterTypes0, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableService.invokeMethod(_methodName1,
				_methodParameterTypes1,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public es.eina.tfg.model.Device add(java.lang.Long userId,
		java.lang.String deviceUUID, java.lang.String description,
		java.lang.String status, java.lang.String phoneNumber,
		java.lang.String serverPhoneNumber, java.lang.String smsPollTime,
		java.lang.String smsTransmitPeriod, java.lang.String cloudId,
		java.lang.String serverIp, java.lang.String httpTransmitPeriod)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingUserException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] {
						ClpSerializer.translateInput(userId),
						
					ClpSerializer.translateInput(deviceUUID),
						
					ClpSerializer.translateInput(description),
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(phoneNumber),
						
					ClpSerializer.translateInput(serverPhoneNumber),
						
					ClpSerializer.translateInput(smsPollTime),
						
					ClpSerializer.translateInput(smsTransmitPeriod),
						
					ClpSerializer.translateInput(cloudId),
						
					ClpSerializer.translateInput(serverIp),
						
					ClpSerializer.translateInput(httpTransmitPeriod)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof es.eina.tfg.NonExistingUserException) {
				throw (es.eina.tfg.NonExistingUserException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (es.eina.tfg.model.Device)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public es.eina.tfg.model.Device update(java.lang.Long deviceId,
		java.lang.String deviceUUID, java.lang.Long userId,
		java.lang.String description, java.lang.String status,
		java.lang.String phoneNumber, java.lang.String serverPhoneNumber,
		java.lang.String smsPollTime, java.lang.String smsTransmitPeriod,
		java.lang.String cloudId, java.lang.String serverIp,
		java.lang.String httpTransmitPeriod)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingDeviceException,
			es.eina.tfg.NonExistingUserException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName4,
					_methodParameterTypes4,
					new Object[] {
						ClpSerializer.translateInput(deviceId),
						
					ClpSerializer.translateInput(deviceUUID),
						
					ClpSerializer.translateInput(userId),
						
					ClpSerializer.translateInput(description),
						
					ClpSerializer.translateInput(status),
						
					ClpSerializer.translateInput(phoneNumber),
						
					ClpSerializer.translateInput(serverPhoneNumber),
						
					ClpSerializer.translateInput(smsPollTime),
						
					ClpSerializer.translateInput(smsTransmitPeriod),
						
					ClpSerializer.translateInput(cloudId),
						
					ClpSerializer.translateInput(serverIp),
						
					ClpSerializer.translateInput(httpTransmitPeriod)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof es.eina.tfg.NonExistingDeviceException) {
				throw (es.eina.tfg.NonExistingDeviceException)t;
			}

			if (t instanceof es.eina.tfg.NonExistingUserException) {
				throw (es.eina.tfg.NonExistingUserException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (es.eina.tfg.model.Device)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public es.eina.tfg.model.Device delete(java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName5,
					_methodParameterTypes5,
					new Object[] { ClpSerializer.translateInput(deviceId) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (es.eina.tfg.model.Device)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public es.eina.tfg.model.Device getDevice(java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] { ClpSerializer.translateInput(deviceId) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (es.eina.tfg.model.Device)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Sensor> getSensors(
		java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName7,
					_methodParameterTypes7,
					new Object[] { ClpSerializer.translateInput(deviceId) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<es.eina.tfg.model.Sensor>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Sensor> getActiveSensors(
		java.lang.Long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName8,
					_methodParameterTypes8,
					new Object[] { ClpSerializer.translateInput(deviceId) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<es.eina.tfg.model.Sensor>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public es.eina.tfg.model.Device getDeviceByPhoneNumber(
		java.lang.String phoneNumber)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName9,
					_methodParameterTypes9,
					new Object[] { ClpSerializer.translateInput(phoneNumber) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof es.eina.tfg.NoSuchDeviceException) {
				throw (es.eina.tfg.NoSuchDeviceException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (es.eina.tfg.model.Device)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Device> findByUserId(
		java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName10,
					_methodParameterTypes10,
					new Object[] { ClpSerializer.translateInput(userId) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<es.eina.tfg.model.Device>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public es.eina.tfg.model.Device findByDeviceUUID(
		java.lang.String deviceUUID)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NoSuchDeviceException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName11,
					_methodParameterTypes11,
					new Object[] { ClpSerializer.translateInput(deviceUUID) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof es.eina.tfg.NoSuchDeviceException) {
				throw (es.eina.tfg.NoSuchDeviceException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (es.eina.tfg.model.Device)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Device> findByStatus(
		java.lang.String status)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName12,
					_methodParameterTypes12,
					new Object[] { ClpSerializer.translateInput(status) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<es.eina.tfg.model.Device>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<es.eina.tfg.model.Device> findByStatus(
		java.lang.String status, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName13,
					_methodParameterTypes13,
					new Object[] {
						ClpSerializer.translateInput(status),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<es.eina.tfg.model.Device>)ClpSerializer.translateOutput(returnObj);
	}

	private InvokableService _invokableService;
	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
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
}