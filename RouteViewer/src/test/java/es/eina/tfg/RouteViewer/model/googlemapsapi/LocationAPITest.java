package es.eina.tfg.RouteViewer.model.googlemapsapi;

import com.google.maps.ElevationApi;
import com.google.maps.GeoApiContext;
import com.google.maps.model.ElevationResult;
import com.google.maps.model.LatLng;
import org.junit.Ignore;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Ignore
public class LocationAPITest extends AuthenticatedTest{

    private static final double SYDNEY_ELEVATION = 19.11174774169922;
    private static final double MELBOURNE_ELEVATION = 25.49982643127441;
    private static final double EPSILON = .00001;

    private static final LatLng SYDNEY = new LatLng(-33.867487, 151.206990);
    private static final LatLng MELBOURNE = new LatLng(-37.814107, 144.963280);

    private GeoApiContext context;

    public LocationAPITest(GeoApiContext context) {
        this.context = context
                .setQueryRateLimit(3)
                .setConnectTimeout(1, TimeUnit.SECONDS)
                .setReadTimeout(1, TimeUnit.SECONDS)
                .setWriteTimeout(1, TimeUnit.SECONDS);
    }

    @Test
    public void testGetPoints() throws Exception {
        ElevationResult[] results = ElevationApi.getByPoints(context, SYDNEY, MELBOURNE).await();

        assertNotNull(results);
        assertEquals(2, results.length);
        assertEquals(SYDNEY_ELEVATION, results[0].elevation, EPSILON);
        assertEquals(MELBOURNE_ELEVATION, results[1].elevation, EPSILON);
    }
}