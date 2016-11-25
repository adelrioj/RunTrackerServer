package es.eina.tfg.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import es.eina.tfg.service.ClpSerializer;
import es.eina.tfg.service.DeviceAndSensorLocalServiceUtil;
import es.eina.tfg.service.DeviceLocalServiceUtil;
import es.eina.tfg.service.DeviceServiceUtil;
import es.eina.tfg.service.EventLocalServiceUtil;
import es.eina.tfg.service.EventServiceUtil;
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
import es.eina.tfg.service.UserAndEventLocalServiceUtil;
import es.eina.tfg.service.UserAndRouteLocalServiceUtil;


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
            DeviceAndSensorLocalServiceUtil.clearService();

            EventLocalServiceUtil.clearService();

            EventServiceUtil.clearService();
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
            UserAndEventLocalServiceUtil.clearService();

            UserAndRouteLocalServiceUtil.clearService();
        }
    }
}
