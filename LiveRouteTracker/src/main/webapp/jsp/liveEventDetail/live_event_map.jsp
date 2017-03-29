<%@include file="../custom_init.jsp"%>

<script type="text/javascript">

    var map;

    function initialize() {
        var mapCenterPoint = new google.maps.LatLng(
            ${requestScope.selectedEvent.route.startLocation.latitude},
            ${requestScope.selectedEvent.route.startLocation.longitude}
        );
        var myOptions = {
            zoom: 14,
            center: mapCenterPoint,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        };

        map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);

        var routeCoordinates =
            [
                <c:forEach items="${requestScope.selectedEvent.route.locations}" var="eventLocation" >
                {lat: ${eventLocation.latitude}, lng:${eventLocation.longitude}},
                </c:forEach>
            ];
        setPolyLine(routeCoordinates, '#FF0000', 0.5, 4);


        setMarker(
            ${requestScope.selectedEvent.route.startLocation.latitude},
            ${requestScope.selectedEvent.route.startLocation.longitude},
            '<liferay-ui:message key="startLocationMarkerLabel" />',
            '/images/green-dot.png');

        setMarker(
            ${requestScope.selectedEvent.route.endLocation.latitude},
            ${requestScope.selectedEvent.route.endLocation.longitude},
            '<liferay-ui:message key="finishLocationMarkerLabel" />',
            '/images/yellow-dot.png');

        <c:choose>
            <c:when test="${not empty requestScope.selectedParticipant}" >
                //Show selected participant path
                setMarker(${requestScope.selectedParticipant.userAndEvent.race.endLocation.latitude},
                            ${requestScope.selectedParticipant.userAndEvent.race.endLocation.longitude},
                            '${requestScope.selectedParticipant.name}',
                            "/images/red-dot.png");

                var raceCoordinates =
                    [
                        <c:forEach items="${requestScope.selectedParticipant.userAndEvent.race.locations}" var="raceLocation" >
                        {lat: ${raceLocation.latitude}, lng:${raceLocation.longitude}},
                        </c:forEach>
                    ];
                setPolyLine(raceCoordinates, '#389145', 1.0, 4);
            </c:when>
            <c:otherwise>
                //Show all participant path
                <c:forEach items="${requestScope.participantList}" var="participant" >
                    setMarker(${participant.userAndEvent.race.endLocation.latitude},
                        ${participant.userAndEvent.race.endLocation.longitude},
                        '${participant.name}',
                        "/images/red-dot.png");
                    var raceCoordinates =
                        [
                            <c:forEach items="${participant.userAndEvent.race.locations}" var="raceLocation" >
                            {lat: ${raceLocation.latitude}, lng:${raceLocation.longitude}},
                            </c:forEach>
                        ];
                    setPolyLine(raceCoordinates, '#389145', 1.0, 4);
                </c:forEach>
            </c:otherwise>
        </c:choose>
    };

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