package feature;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by dcrespo on 27/02/14.
 */
public class FeatureTest {
    @Test
    public void featureSeriesAndSeriesNamesAreEqualTest() {
        Feature feature = mock(Feature.class);
        when(feature.getSeries()).thenReturn("Breaking Bad");

        Series series = mock(Series.class);
        when(series.getName()).thenReturn("Breaking Bad");

        System.out.println("seriesName = " + series.getName());
        System.out.println("featureGetSeries = " + feature.getSeries());
        Assert.assertEquals(feature.getSeries(), series.getName());
    }
}
