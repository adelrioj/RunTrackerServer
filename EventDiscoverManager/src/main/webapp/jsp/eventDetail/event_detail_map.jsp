<%@include file="../custom_init.jsp"%>


<script type="text/javascript">

    var map;

    function initialize() {
        var mapCenterPoint = new google.maps.LatLng(
            ${requestScope.requestedEvent.route.startLocation.latitude},
            ${requestScope.requestedEvent.route.startLocation.longitude}
        );
        var myOptions = {
            zoom: 14,
            center: mapCenterPoint,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        };

        map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);

        var routeCoordinates =
            [
                <c:forEach items="${requestScope.requestedEvent.route.locations}" var="eventLocation" >
                {lat: ${eventLocation.latitude}, lng:${eventLocation.longitude}},
                </c:forEach>
            ];
        setPolyLine(routeCoordinates, '#FF0000', 0.5, 4);


        setMarker(
            ${requestScope.requestedEvent.route.startLocation.latitude},
            ${requestScope.requestedEvent.route.startLocation.longitude},
            '<liferay-ui:message key="startLocationMarkerLabel" />',
            '/images/green-dot.png');

        setMarker(
            ${requestScope.requestedEvent.route.endLocation.latitude},
            ${requestScope.requestedEvent.route.endLocation.longitude},
            '<liferay-ui:message key="finishLocationMarkerLabel" />',
            '/images/yellow-dot.png');
    }

    function setMarker(latitude, longitude, title, iconPath) {
        var myLatlng = new google.maps.LatLng(latitude, longitude);
        var marker = new google.maps.Marker({
            position: myLatlng,
            title: title,
            icon: '${renderRequest.contextPath}' + iconPath
        });
        marker.setMap(map);
    }

    function setPolyLine (coordinates, color, strokeOpacity, strokeWeight){
        var path = new google.maps.Polyline({
            path: coordinates,
            geodesic: true,
            strokeColor: color,
            strokeOpacity: strokeOpacity,
            strokeWeight: strokeWeight
        });

        path.setMap(map);
    }

    function loadScript() {
        var script = document.createElement("script");
        script.type = "text/javascript";
        script.src = "http://maps.google.com/maps/api/js?callback=initialize&key=AIzaSyDHGIgNTF3GMNjx6JjcNAisC5MoT0ebom0";
        document.body.appendChild(script);
    }

    window.onload = loadScript;

</script>

<div id="map_canvas"></div>