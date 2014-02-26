package transferService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by dcrespo on 26/02/14.
 */
public class TransferServiceImpl2 implements TransferService {
    private static Log logger = LogFactory.getLog(TransferServiceImpl2.class);
    private String cad = "cad is empty";

    @Override
    public void transfer() {
        logger.debug("Transfer method executed: " + cad);
    }

    public String getCad() {
        return cad;
    }

    public void setCad(String cad) {
        this.cad = cad;
    }
}
