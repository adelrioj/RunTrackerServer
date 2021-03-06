package es.eina.tfg.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import es.eina.tfg.model.DeviceAndSensorClp;
import es.eina.tfg.model.DeviceClp;
import es.eina.tfg.model.EventClp;
import es.eina.tfg.model.LocationClp;
import es.eina.tfg.model.PowerClp;
import es.eina.tfg.model.RaceClp;
import es.eina.tfg.model.RouteClp;
import es.eina.tfg.model.RouteLocationClp;
import es.eina.tfg.model.SensorClp;
import es.eina.tfg.model.UserAdditionalDataClp;
import es.eina.tfg.model.UserAndEventClp;
import es.eina.tfg.model.UserAndRouteClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;


public class ClpSerializer {
    private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
    private static String _servletContextName;
    private static boolean _useReflectionToTranslateThrowable = true;

    public static String getServletContextName() {
        if (Validator.isNotNull(_servletContextName)) {
            return _servletContextName;
        }

        synchronized (ClpSerializer.class) {
            if (Validator.isNotNull(_servletContextName)) {
                return _servletContextName;
            }

            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Class<?> portletPropsClass = classLoader.loadClass(
                        "com.liferay.util.portlet.PortletProps");

                Method getMethod = portletPropsClass.getMethod("get",
                        new Class<?>[] { String.class });

                String portletPropsServletContextName = (String) getMethod.invoke(null,
                        "RunTrackerServiceBuilder-portlet-deployment-context");

                if (Validator.isNotNull(portletPropsServletContextName)) {
                    _servletContextName = portletPropsServletContextName;
                }
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info(
                        "Unable to locate deployment context from portlet properties");
                }
            }

            if (Validator.isNull(_servletContextName)) {
                try {
                    String propsUtilServletContextName = PropsUtil.get(
                            "RunTrackerServiceBuilder-portlet-deployment-context");

                    if (Validator.isNotNull(propsUtilServletContextName)) {
                        _servletContextName = propsUtilServletContextName;
                    }
                } catch (Throwable t) {
                    if (_log.isInfoEnabled()) {
                        _log.info(
                            "Unable to locate deployment context from portal properties");
                    }
                }
            }

            if (Validator.isNull(_servletContextName)) {
                _servletContextName = "RunTrackerServiceBuilder-portlet";
            }

            return _servletContextName;
        }
    }

    public static Object translateInput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(DeviceClp.class.getName())) {
            return translateInputDevice(oldModel);
        }

        if (oldModelClassName.equals(DeviceAndSensorClp.class.getName())) {
            return translateInputDeviceAndSensor(oldModel);
        }

        if (oldModelClassName.equals(EventClp.class.getName())) {
            return translateInputEvent(oldModel);
        }

        if (oldModelClassName.equals(LocationClp.class.getName())) {
            return translateInputLocation(oldModel);
        }

        if (oldModelClassName.equals(PowerClp.class.getName())) {
            return translateInputPower(oldModel);
        }

        if (oldModelClassName.equals(RaceClp.class.getName())) {
            return translateInputRace(oldModel);
        }

        if (oldModelClassName.equals(RouteClp.class.getName())) {
            return translateInputRoute(oldModel);
        }

        if (oldModelClassName.equals(RouteLocationClp.class.getName())) {
            return translateInputRouteLocation(oldModel);
        }

        if (oldModelClassName.equals(SensorClp.class.getName())) {
            return translateInputSensor(oldModel);
        }

        if (oldModelClassName.equals(UserAdditionalDataClp.class.getName())) {
            return translateInputUserAdditionalData(oldModel);
        }

        if (oldModelClassName.equals(UserAndEventClp.class.getName())) {
            return translateInputUserAndEvent(oldModel);
        }

        if (oldModelClassName.equals(UserAndRouteClp.class.getName())) {
            return translateInputUserAndRoute(oldModel);
        }

        return oldModel;
    }

    public static Object translateInput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateInput(curObj));
        }

        return newList;
    }

    public static Object translateInputDevice(BaseModel<?> oldModel) {
        DeviceClp oldClpModel = (DeviceClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getDeviceRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputDeviceAndSensor(BaseModel<?> oldModel) {
        DeviceAndSensorClp oldClpModel = (DeviceAndSensorClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getDeviceAndSensorRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputEvent(BaseModel<?> oldModel) {
        EventClp oldClpModel = (EventClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getEventRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputLocation(BaseModel<?> oldModel) {
        LocationClp oldClpModel = (LocationClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getLocationRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPower(BaseModel<?> oldModel) {
        PowerClp oldClpModel = (PowerClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPowerRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputRace(BaseModel<?> oldModel) {
        RaceClp oldClpModel = (RaceClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getRaceRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputRoute(BaseModel<?> oldModel) {
        RouteClp oldClpModel = (RouteClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getRouteRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputRouteLocation(BaseModel<?> oldModel) {
        RouteLocationClp oldClpModel = (RouteLocationClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getRouteLocationRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputSensor(BaseModel<?> oldModel) {
        SensorClp oldClpModel = (SensorClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getSensorRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputUserAdditionalData(BaseModel<?> oldModel) {
        UserAdditionalDataClp oldClpModel = (UserAdditionalDataClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getUserAdditionalDataRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputUserAndEvent(BaseModel<?> oldModel) {
        UserAndEventClp oldClpModel = (UserAndEventClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getUserAndEventRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputUserAndRoute(BaseModel<?> oldModel) {
        UserAndRouteClp oldClpModel = (UserAndRouteClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getUserAndRouteRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateInput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateInput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Object translateOutput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals("es.eina.tfg.model.impl.DeviceImpl")) {
            return translateOutputDevice(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "es.eina.tfg.model.impl.DeviceAndSensorImpl")) {
            return translateOutputDeviceAndSensor(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("es.eina.tfg.model.impl.EventImpl")) {
            return translateOutputEvent(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("es.eina.tfg.model.impl.LocationImpl")) {
            return translateOutputLocation(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("es.eina.tfg.model.impl.PowerImpl")) {
            return translateOutputPower(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("es.eina.tfg.model.impl.RaceImpl")) {
            return translateOutputRace(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("es.eina.tfg.model.impl.RouteImpl")) {
            return translateOutputRoute(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("es.eina.tfg.model.impl.RouteLocationImpl")) {
            return translateOutputRouteLocation(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("es.eina.tfg.model.impl.SensorImpl")) {
            return translateOutputSensor(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals(
                    "es.eina.tfg.model.impl.UserAdditionalDataImpl")) {
            return translateOutputUserAdditionalData(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("es.eina.tfg.model.impl.UserAndEventImpl")) {
            return translateOutputUserAndEvent(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        if (oldModelClassName.equals("es.eina.tfg.model.impl.UserAndRouteImpl")) {
            return translateOutputUserAndRoute(oldModel);
        } else if (oldModelClassName.endsWith("Clp")) {
            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Method getClpSerializerClassMethod = oldModelClass.getMethod(
                        "getClpSerializerClass");

                Class<?> oldClpSerializerClass = (Class<?>) getClpSerializerClassMethod.invoke(oldModel);

                Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

                Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
                        BaseModel.class);

                Class<?> oldModelModelClass = oldModel.getModelClass();

                Method getRemoteModelMethod = oldModelClass.getMethod("get" +
                        oldModelModelClass.getSimpleName() + "RemoteModel");

                Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

                BaseModel<?> newModel = (BaseModel<?>) translateOutputMethod.invoke(null,
                        oldRemoteModel);

                return newModel;
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info("Unable to translate " + oldModelClassName, t);
                }
            }
        }

        return oldModel;
    }

    public static Object translateOutput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateOutput(curObj));
        }

        return newList;
    }

    public static Object translateOutput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateOutput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateOutput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Throwable translateThrowable(Throwable throwable) {
        if (_useReflectionToTranslateThrowable) {
            try {
                UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

                objectOutputStream.writeObject(throwable);

                objectOutputStream.flush();
                objectOutputStream.close();

                UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
                        0, unsyncByteArrayOutputStream.size());

                Thread currentThread = Thread.currentThread();

                ClassLoader contextClassLoader = currentThread.getContextClassLoader();

                ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
                        contextClassLoader);

                throwable = (Throwable) objectInputStream.readObject();

                objectInputStream.close();

                return throwable;
            } catch (SecurityException se) {
                if (_log.isInfoEnabled()) {
                    _log.info("Do not use reflection to translate throwable");
                }

                _useReflectionToTranslateThrowable = false;
            } catch (Throwable throwable2) {
                _log.error(throwable2, throwable2);

                return throwable2;
            }
        }

        Class<?> clazz = throwable.getClass();

        String className = clazz.getName();

        if (className.equals(PortalException.class.getName())) {
            return new PortalException();
        }

        if (className.equals(SystemException.class.getName())) {
            return new SystemException();
        }

        if (className.equals("es.eina.tfg.NonExistingDeviceException")) {
            return new es.eina.tfg.NonExistingDeviceException();
        }

        if (className.equals("es.eina.tfg.NonExistingEventException")) {
            return new es.eina.tfg.NonExistingEventException();
        }

        if (className.equals("es.eina.tfg.NonExistingMeasurementException")) {
            return new es.eina.tfg.NonExistingMeasurementException();
        }

        if (className.equals("es.eina.tfg.NonExistingRaceException")) {
            return new es.eina.tfg.NonExistingRaceException();
        }

        if (className.equals("es.eina.tfg.NonExistingRouteException")) {
            return new es.eina.tfg.NonExistingRouteException();
        }

        if (className.equals("es.eina.tfg.NonExistingRouteLocationException")) {
            return new es.eina.tfg.NonExistingRouteLocationException();
        }

        if (className.equals("es.eina.tfg.NonExistingSensorException")) {
            return new es.eina.tfg.NonExistingSensorException();
        }

        if (className.equals("es.eina.tfg.NonExistingUserException")) {
            return new es.eina.tfg.NonExistingUserException();
        }

        if (className.equals("es.eina.tfg.NoSuchDeviceException")) {
            return new es.eina.tfg.NoSuchDeviceException();
        }

        if (className.equals("es.eina.tfg.NoSuchDeviceAndSensorException")) {
            return new es.eina.tfg.NoSuchDeviceAndSensorException();
        }

        if (className.equals("es.eina.tfg.NoSuchEventException")) {
            return new es.eina.tfg.NoSuchEventException();
        }

        if (className.equals("es.eina.tfg.NoSuchLocationException")) {
            return new es.eina.tfg.NoSuchLocationException();
        }

        if (className.equals("es.eina.tfg.NoSuchPowerException")) {
            return new es.eina.tfg.NoSuchPowerException();
        }

        if (className.equals("es.eina.tfg.NoSuchRaceException")) {
            return new es.eina.tfg.NoSuchRaceException();
        }

        if (className.equals("es.eina.tfg.NoSuchRouteException")) {
            return new es.eina.tfg.NoSuchRouteException();
        }

        if (className.equals("es.eina.tfg.NoSuchRouteLocationException")) {
            return new es.eina.tfg.NoSuchRouteLocationException();
        }

        if (className.equals("es.eina.tfg.NoSuchSensorException")) {
            return new es.eina.tfg.NoSuchSensorException();
        }

        if (className.equals("es.eina.tfg.NoSuchUserAdditionalDataException")) {
            return new es.eina.tfg.NoSuchUserAdditionalDataException();
        }

        if (className.equals("es.eina.tfg.NoSuchUserAndEventException")) {
            return new es.eina.tfg.NoSuchUserAndEventException();
        }

        if (className.equals("es.eina.tfg.NoSuchUserAndRouteException")) {
            return new es.eina.tfg.NoSuchUserAndRouteException();
        }

        return throwable;
    }

    public static Object translateOutputDevice(BaseModel<?> oldModel) {
        DeviceClp newModel = new DeviceClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setDeviceRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputDeviceAndSensor(BaseModel<?> oldModel) {
        DeviceAndSensorClp newModel = new DeviceAndSensorClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setDeviceAndSensorRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputEvent(BaseModel<?> oldModel) {
        EventClp newModel = new EventClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setEventRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputLocation(BaseModel<?> oldModel) {
        LocationClp newModel = new LocationClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setLocationRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPower(BaseModel<?> oldModel) {
        PowerClp newModel = new PowerClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPowerRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputRace(BaseModel<?> oldModel) {
        RaceClp newModel = new RaceClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setRaceRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputRoute(BaseModel<?> oldModel) {
        RouteClp newModel = new RouteClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setRouteRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputRouteLocation(BaseModel<?> oldModel) {
        RouteLocationClp newModel = new RouteLocationClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setRouteLocationRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputSensor(BaseModel<?> oldModel) {
        SensorClp newModel = new SensorClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setSensorRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputUserAdditionalData(
        BaseModel<?> oldModel) {
        UserAdditionalDataClp newModel = new UserAdditionalDataClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setUserAdditionalDataRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputUserAndEvent(BaseModel<?> oldModel) {
        UserAndEventClp newModel = new UserAndEventClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setUserAndEventRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputUserAndRoute(BaseModel<?> oldModel) {
        UserAndRouteClp newModel = new UserAndRouteClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setUserAndRouteRemoteModel(oldModel);

        return newModel;
    }
}
