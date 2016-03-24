<%@ page import="com.liferay.docs.route.util.WebKeys" %>
<%@ page import="com.liferay.portal.kernel.util.Validator" %>
<%@ page import="es.eina.tfg.model.RouteLocation" %>
<%@ page import="es.eina.tfg.service.RouteLocationLocalServiceUtil" %>
<%@ page import="java.util.List" %>

<%@include file="custom_init.jsp"%>

<%
    List<RouteLocation> selectedRouteLocations = RouteLocationLocalServiceUtil.findByRouteId(selectedRouteId);
%>

<script type="text/javascript">
    var map;

    function initialize() {
        var myLatlng = new google.maps.LatLng(<%= selectedRouteLocations.get(0).getLatitude()%>, <%= selectedRouteLocations.get(0).getLongitude()%>);
        var myOptions = {
            zoom: 14,
            center: myLatlng,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        };

        map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);

        var routeCoordinates = [
            <%
              for (RouteLocation selectedRouteLocation : selectedRouteLocations) {
            %>
            {lat: <%= selectedRouteLocation.getLatitude()%>, lng: <%= selectedRouteLocation.getLongitude()%>},
            <%
              }
            %>
        ];
        setPolyLine(routeCoordinates);
        setMarker(<%= selectedRouteLocations.get(0).getLatitude()%>,
                <%= selectedRouteLocations.get(0).getLongitude()%>,
                "Inicio",
                '<%= WebKeys.MARKER_GEEEN%>');
        setMarker(<%= selectedRouteLocations.get(selectedRouteLocations.size()-1).getLatitude()%>,
                <%= selectedRouteLocations.get(selectedRouteLocations.size()-1).getLongitude()%>,
                "Final",
                '<%= WebKeys.MARKER_YELLOW%>');
        <%
            Long selectedRouteLocationId = (Long) request.getAttribute("selectedRouteLocationId");
            if (Validator.isNotNull(selectedRouteLocationId)){
                RouteLocation selectedLocation = RouteLocationLocalServiceUtil.getRouteLocation(selectedRouteLocationId);
                if (Validator.isNotNull(selectedLocation)){
        %>
        setMarker(<%= selectedLocation.getLatitude()%>,
                <%= selectedLocation.getLongitude()%>,
                "Seleccionado",
                '<%= WebKeys.MARKER_RED%>');
        <%
                }
            }
        %>
    }

    function setMarker(latitude, longitude, title, iconPath) {
        var myLatlng = new google.maps.LatLng(latitude, longitude);
        var marker = new google.maps.Marker({
            position: myLatlng,
            title: title,
            icon: '<%= renderRequest.getContextPath()%>' + iconPath
        });
        marker.setMap(map);
    }

    function setPolyLine (routeCoordinates){
        var routePath = new google.maps.Polyline({
            path: routeCoordinates,
            geodesic: true,
            strokeColor: '#FF0000',
            strokeOpacity: 1.0,
            strokeWeight: 4
        });

        routePath.setMap(map);
    }

    function loadScript() {
        var script = document.createElement("script");
        script.type = "text/javascript";
        script.src = "http://maps.google.com/maps/api/js?callback=initialize";
        document.body.appendChild(script);
    }

    window.onload = loadScript;

</script>

<div id="map_canvas"></div>