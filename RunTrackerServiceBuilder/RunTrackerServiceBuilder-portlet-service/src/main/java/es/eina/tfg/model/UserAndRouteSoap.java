package es.eina.tfg.model;

import es.eina.tfg.service.persistence.UserAndRoutePK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author adelrioj
 * @generated
 */
public class UserAndRouteSoap implements Serializable {
    private long _idUser;
    private long _idRoute;

    public UserAndRouteSoap() {
    }

    public static UserAndRouteSoap toSoapModel(UserAndRoute model) {
        UserAndRouteSoap soapModel = new UserAndRouteSoap();

        soapModel.setIdUser(model.getIdUser());
        soapModel.setIdRoute(model.getIdRoute());

        return soapModel;
    }

    public static UserAndRouteSoap[] toSoapModels(UserAndRoute[] models) {
        UserAndRouteSoap[] soapModels = new UserAndRouteSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static UserAndRouteSoap[][] toSoapModels(UserAndRoute[][] models) {
        UserAndRouteSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new UserAndRouteSoap[models.length][models[0].length];
        } else {
            soapModels = new UserAndRouteSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static UserAndRouteSoap[] toSoapModels(List<UserAndRoute> models) {
        List<UserAndRouteSoap> soapModels = new ArrayList<UserAndRouteSoap>(models.size());

        for (UserAndRoute model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new UserAndRouteSoap[soapModels.size()]);
    }

    public UserAndRoutePK getPrimaryKey() {
        return new UserAndRoutePK(_idUser, _idRoute);
    }

    public void setPrimaryKey(UserAndRoutePK pk) {
        setIdUser(pk.idUser);
        setIdRoute(pk.idRoute);
    }

    public long getIdUser() {
        return _idUser;
    }

    public void setIdUser(long idUser) {
        _idUser = idUser;
    }

    public long getIdRoute() {
        return _idRoute;
    }

    public void setIdRoute(long idRoute) {
        _idRoute = idRoute;
    }
}
