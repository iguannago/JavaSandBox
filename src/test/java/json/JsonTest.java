package json;

import junit.framework.Assert;
import org.junit.Test;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

/**
 * Created by dcrespo on 02/02/14.
 */

public class JsonTest {

    private static final Log logger = LogFactory.getLog(JsonTest.class);

    @Test
    public void dataContractTest() {
        ExpectedDataContract expectedDataContract = new ExpectedDataContract();
        String expected = expectedDataContract.build();
        logger.debug("expected: " + expected);
        String actual = DataContractBuilder.build();
        logger.debug("actual:" + actual);
        Assert.assertEquals("data contract is not valid", expected, actual);
    }
}
