package json;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dcrespo on 02/02/14.
 */
public class FeaturePayload {

    private int featureId = 1;
    private int seriesId = 1;
    private List<Partial> partials = new ArrayList<Partial>() {
        {
            Partial partial1 = new Partial();
            add(partial1);
        }
    };

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    public int getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(int seriesId) {
        this.seriesId = seriesId;
    }

    public List<Partial> getPartials() {
        return partials;
    }

    public void setPartials(List<Partial> partials) {
        this.partials = partials;
    }

    public class Partial {
        String type = "type1";
        String body = "body1";

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
    }

}
