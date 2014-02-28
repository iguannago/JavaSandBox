package feature;

/**
 * Created by dcrespo on 28/02/14.
 */
public class PublishMessageServiceImpl implements PublishMessageService {
    @Override
    public String buildPayLoad(Feature feature) {
        return feature.getSeries().concat("hi world");
    }
}
