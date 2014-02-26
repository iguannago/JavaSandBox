package transferService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import transferService.TransferService;
import transferService.TransferServiceImpl2;

/**
 * Created by dcrespo on 26/02/14.
 */
@ContextConfiguration("transferService-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TransferServiceTest {
    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void transferServiceImpl2NotInjected() {
        TransferService transferService = new TransferServiceImpl2();
        transferService.transfer();
    }

    @Test
    public void transferServiceImpl2Injected(){
        TransferService transferService = (TransferServiceImpl2) applicationContext.getBean("transferService2");
        transferService.transfer();
    }

    @Test
    public void napTransferServiceImpl2Injected(){
        TransferService transferService = (NapTransferServiceImpl2) applicationContext.getBean("napTransferService2");
        transferService.transfer();
    }
}

