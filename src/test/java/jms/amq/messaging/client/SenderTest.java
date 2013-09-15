package jms.amq.messaging.client;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

    @Autowired
    private Sender sender;

    @Before
    public void setUp() {
        sender = new Sender();
    }

    @Test
    public void senderObjectTest() {
        Assert.assertNotNull(sender);
    }

    @Test
    public void senderMethodInjectionTest() {
        Assert.assertNotNull(sender.getJmsTemplate());
    }

//    @Test
//    public void sendMessageTest() {
//        sender = new Sender();
//        sender.simpleSend();
//    }
}
