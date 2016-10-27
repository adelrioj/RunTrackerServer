<%@include file="custom_init.jsp"%>

<script type="text/javascript">
    var map;

    function initialize() {

        var myLatlng = new google.maps.LatLng(
                ${requestScope.routeToEditLocations[0].latitude},
                ${requestScope.routeToEditLocations[0].longitude}
        );
        var myOptions = {
            zoom: 14,
            center: myLatlng,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        };

        map = new google.maps.Map(document.getElementById("map_canvas"), myOptions);
        var routeCoordinates = [
            <c:forEach items="${requestScope.routeToEditLocations}" var="routeLocation" >
                {lat: ${routeLocation.latitude}, lng:${routeLocation.longitude}},
            </c:forEach>
        ];
        setPolyLine(routeCoordinates);

        setMarker(
                ${requestScope.routeToEditLocations[0].latitude},
                ${requestScope.routeToEditLocations[0].longitude},
                '<liferay-ui:message key="startLocationMarkerLabel" />',
                '${constants.MARKER_GEEEN}');

        setMarker(
                ${requestScope.routeToEditLocations[fn:length(requestScope.routeToEditLocations)-1].latitude},
                ${requestScope.routeToEditLocations[fn:length(requestScope.routeToEditLocations)-1].longitude},
                '<liferay-ui:message key="finishLocationMarkerLabel" />',
                '${constants.MARKER_YELLOW}');

        <c:if test="${not empty requestScope.routeLocationSelected}">
        setMarker(
                ${requestScope.routeLocationSelected.latitude},
                ${requestScope.routeLocationSelected.longitude},
                '<liferay-ui:message key="selectedLocationMarkerLabel" />',
                '${constants.MARKER_RED}');
        </c:if>
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
        script.src = "http://maps.google.com/maps/api/js?callback=initialize&key=AIzaSyDHGIgNTF3GMNjx6JjcNAisC5MoT0ebom0";
        document.body.appendChild(script);
    }

    window.onload = loadScript;

</script>

<div id="map_canvas"></div>