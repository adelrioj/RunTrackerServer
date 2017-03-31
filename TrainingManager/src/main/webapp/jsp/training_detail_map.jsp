<%@include file="custom_init.jsp"%>

<script type="text/javascript">

    var map;

    function initialize() {
        var mapCenterPoint = new google.maps.LatLng(
            ${requestScope.requestedRace.startLocation.latitude},
            ${requestScope.requestedRace.startLocation.longitude}
        );
        var myOptions = {
            zoom: 14,
            center: mapCenterPoint,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        };

        map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);




        var routeCoordinates =
            [
                <c:forEach items="${requestScope.requestedRace.route.locations}" var="routeLocation" >
                {lat: ${routeLocation.latitude}, lng:${routeLocation.longitude}},
                </c:forEach>
            ];
        setPolyLine(routeCoordinates, '#FF0000', 0.5, 4);

        var raceCoordinates =
            [
                <c:forEach items="${requestScope.requestedRace.locations}" var="raceLocation" >
                {lat: ${raceLocation.latitude}, lng:${raceLocation.longitude}},
                </c:forEach>
            ];
        setPolyLine(raceCoordinates, '#389145', 1.0, 4);


        setMarker(
            ${requestScope.requestedRace.startLocation.latitude},
            ${requestScope.requestedRace.startLocation.longitude},
            '<liferay-ui:message key="startLocationMarkerLabel" />',
            '/images/green-dot.png');

        setMarker(
            ${requestScope.requestedRace.endLocation.latitude},
            ${requestScope.requestedRace.endLocation.longitude},
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