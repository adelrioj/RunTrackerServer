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
public class PowerServiceClp implements PowerService {
	public PowerServiceClp(InvokableService invokableService) {
		_invokableService = invokableService;

		_methodName0 = "getBeanIdentifier";

		_methodParameterTypes0 = new String[] {  };

		_methodName1 = "setBeanIdentifier";

		_methodParameterTypes1 = new String[] { "java.lang.String" };

		_methodName3 = "add";

		_methodParameterTypes3 = new String[] {
				"java.lang.Long", "java.lang.Long", "java.lang.Long",
				"java.lang.Long", "java.util.Date", "java.lang.String",
				"java.lang.Integer"
			};

		_methodName4 = "update";

		_methodParameterTypes4 = new String[] {
				"java.lang.Long", "java.lang.Long", "java.lang.Long",
				"java.lang.Long", "java.lang.Long", "java.util.Date",
				"java.lang.String", "java.lang.Integer"
			};

		_methodName5 = "delete";

		_methodParameterTypes5 = new String[] { "java.lang.Long" };

		_methodName6 = "getPower";

		_methodParameterTypes6 = new String[] { "java.lang.Long" };
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
	public es.eina.tfg.model.Power add(java.lang.Long raceId,
		java.lang.Long userId, java.lang.Long deviceId,
		java.lang.Long sensorId, java.util.Date time,
		java.lang.String sensorMode, java.lang.Integer level)
		throws com.liferay.portal.kernel.exception.SystemException,
			es.eina.tfg.NonExistingDeviceAndSensorRelationException,
			es.eina.tfg.NonExistingRaceException,
			es.eina.tfg.NonExistingUserException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName3,
					_methodParameterTypes3,
					new Object[] {
						ClpSerializer.translateInput(raceId),
						
					ClpSerializer.translateInput(userId),
						
					ClpSerializer.translateInput(deviceId),
						
					ClpSerializer.translateInput(sensorId),
						
					ClpSerializer.translateInput(time),
						
					ClpSerializer.translateInput(sensorMode),
						
					ClpSerializer.translateInput(level)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof es.eina.tfg.NonExistingDeviceAndSensorRelationException) {
				throw (es.eina.tfg.NonExistingDeviceAndSensorRelationException)t;
			}

			if (t instanceof es.eina.tfg.NonExistingRaceException) {
				throw (es.eina.tfg.NonExistingRaceException)t;
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

		return (es.eina.tfg.model.Power)ClpSerializer.translateOutput(returnObj);
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
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName4,
					_methodParameterTypes4,
					new Object[] {
						ClpSerializer.translateInput(measurementId),
						
					ClpSerializer.translateInput(raceId),
						
					ClpSerializer.translateInput(userId),
						
					ClpSerializer.translateInput(deviceId),
						
					ClpSerializer.translateInput(sensorId),
						
					ClpSerializer.translateInput(time),
						
					ClpSerializer.translateInput(sensorMode),
						
					ClpSerializer.translateInput(level)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.SystemException) {
				throw (com.liferay.portal.kernel.exception.SystemException)t;
			}

			if (t instanceof es.eina.tfg.NonExistingDeviceAndSensorRelationException) {
				throw (es.eina.tfg.NonExistingDeviceAndSensorRelationException)t;
			}

			if (t instanceof es.eina.tfg.NonExistingMeasurementException) {
				throw (es.eina.tfg.NonExistingMeasurementException)t;
			}

			if (t instanceof es.eina.tfg.NonExistingRaceException) {
				throw (es.eina.tfg.NonExistingRaceException)t;
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

		return (es.eina.tfg.model.Power)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public es.eina.tfg.model.Power delete(java.lang.Long measurementId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName5,
					_methodParameterTypes5,
					new Object[] { ClpSerializer.translateInput(measurementId) });
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

		return (es.eina.tfg.model.Power)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public es.eina.tfg.model.Power getPower(java.lang.Long measurementId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		Object returnObj = null;

		try {
			returnObj = _invokableService.invokeMethod(_methodName6,
					_methodParameterTypes6,
					new Object[] { ClpSerializer.translateInput(measurementId) });
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

		return (es.eina.tfg.model.Power)ClpSerializer.translateOutput(returnObj);
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
}