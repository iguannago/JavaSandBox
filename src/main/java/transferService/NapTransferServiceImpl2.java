package transferService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by dcrespo on 26/02/14.
 */
public class NapTransferServiceImpl2 extends TransferServiceImpl2 {
    private static Log logger = LogFactory.getLog(NapTransferServiceImpl2.class);
    @Override
    public void transfer() {
        logger.debug("Transfer method executed:" + getCad());
    }
}
