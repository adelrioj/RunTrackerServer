package es.eina.tfg.RouteViewer.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtil {

    /**
     * Rounds number to given decimals
     * @param  value number to round
     * @param places number of decimals
     * @return round number
     * @link http://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
     */
    public static double round(double value, int places) {
        if (places < 0)
            throw new IllegalArgumentException("places must be >= 0");

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
