package json;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * Created by dcrespo on 02/02/14.
 */
public class DataContractBuilder {

    public static String build() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String featurePayloadJson = objectMapper.writeValueAsString(new FeaturePayload());
            return featurePayloadJson;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
