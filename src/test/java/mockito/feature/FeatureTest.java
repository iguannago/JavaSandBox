package mockito.feature;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

/**
 * Created by dcrespo on 27/02/14.
 */
public class FeatureTest {
    private @Mock Feature feature = new Feature();
    private Series series = new Series();
    private PublishMessageServiceImpl publishMessageService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(feature.getSeries()).thenReturn(series.getName());
        publishMessageService = new PublishMessageServiceImpl();
    }

    @Test
    public void buildPayloadTest() {
        String buildPayLoad = publishMessageService.buildPayLoad(feature);
        System.out.println("publishMessageService.buildPayLoad() = " + buildPayLoad);
        Assert.assertEquals(series.getName(), buildPayLoad);
        Assert.assertEquals(series.getName(), feature.getSeries());
    }
}
