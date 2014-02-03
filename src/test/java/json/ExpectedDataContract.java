package json;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * Created by dcrespo on 02/02/14.
 */
public class ExpectedDataContract {

    private static final Log logger = LogFactory.getLog(ExpectedDataContract.class);

    public String build() {
        DummyFeaturePayload featurePayload = new DummyFeaturePayload();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String featurePayloadJson = objectMapper.writeValueAsString(featurePayload);
            return featurePayloadJson;
        } catch (Exception e) {
            e.printStackTrace();
            return "no data contract";
        }
    }
}
