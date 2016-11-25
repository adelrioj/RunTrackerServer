package es.eina.tfg.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link es.eina.tfg.service.http.RouteServiceSoap}.
 *
 * @author adelrioj
 * @see es.eina.tfg.service.http.RouteServiceSoap
 * @generated
 */
public class RouteSoap implements Serializable {
    private long _idRoute;
    private long _idAuthor;
    private String _type;
    private String _name;
    private String _description;
    private boolean _isPublic;
    private Date _creationTime;

    public RouteSoap() {
    }

    public static RouteSoap toSoapModel(Route model) {
        RouteSoap soapModel = new RouteSoap();

        soapModel.setIdRoute(model.getIdRoute());
        soapModel.setIdAuthor(model.getIdAuthor());
        soapModel.setType(model.getType());
        soapModel.setName(model.getName());
        soapModel.setDescription(model.getDescription());
        soapModel.setIsPublic(model.getIsPublic());
        soapModel.setCreationTime(model.getCreationTime());

        return soapModel;
    }

    public static RouteSoap[] toSoapModels(Route[] models) {
        RouteSoap[] soapModels = new RouteSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RouteSoap[][] toSoapModels(Route[][] models) {
        RouteSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RouteSoap[models.length][models[0].length];
        } else {
            soapModels = new RouteSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RouteSoap[] toSoapModels(List<Route> models) {
        List<RouteSoap> soapModels = new ArrayList<RouteSoap>(models.size());

        for (Route model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RouteSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _idRoute;
    }

    public void setPrimaryKey(long pk) {
        setIdRoute(pk);
    }

    public long getIdRoute() {
        return _idRoute;
    }

    public void setIdRoute(long idRoute) {
        _idRoute = idRoute;
    }

    public long getIdAuthor() {
        return _idAuthor;
    }

    public void setIdAuthor(long idAuthor) {
        _idAuthor = idAuthor;
    }

    public String getType() {
        return _type;
    }

    public void setType(String type) {
        _type = type;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public boolean getIsPublic() {
        return _isPublic;
    }

    public boolean isIsPublic() {
        return _isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        _isPublic = isPublic;
    }

    public Date getCreationTime() {
        return _creationTime;
    }

    public void setCreationTime(Date creationTime) {
        _creationTime = creationTime;
    }
}
