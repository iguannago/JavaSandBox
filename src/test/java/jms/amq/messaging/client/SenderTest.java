package jms.amq.messaging.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/13
 * Time: 21:13
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration
@RunWith(JUnit4.class)
public class SenderTest {

    private Sender sender;

    @Test
    public void sendMessageTest() {
        sender = new Sender();
        sender.simpleSend();
    }
}
