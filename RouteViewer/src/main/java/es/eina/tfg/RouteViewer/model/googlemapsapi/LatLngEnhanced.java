package es.eina.tfg.RouteViewer.model.googlemapsapi;

import es.eina.tfg.RouteViewer.util.MathUtil;

public class LatLngEnhanced{

    private static final double DELTA = .00001;
    public static final int DELTA_POSITIONS = 4;

    private Double lat;
    private Double lng;

    public LatLngEnhanced(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public Double getLat() {
        return lat;
    }
    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }
    public void setLng(Double lng) {
        this.lng = lng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LatLngEnhanced)) return false;

        LatLngEnhanced enhanced = (LatLngEnhanced) o;

        if (!(Math.abs(getLat() - enhanced.getLat()) < DELTA)) return false;
        return (Math.abs(getLng() - enhanced.getLng()) < DELTA);
    }

    @Override
    public int hashCode() {
        Double result = MathUtil.round(getLat(), DELTA_POSITIONS);
        result = 31 * result + MathUtil.round(getLng(), DELTA_POSITIONS);
        return result.intValue();
    }
}