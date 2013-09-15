package jms.amq.messaging.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.*;

/**
 * Created with IntelliJ IDEA.
 * User: david
 * Date: 08/09/13
 * Time: 20:41
 * To change this template use File | Settings | File Templates.
 */
@Service
public class Sender {

    @Autowired
    private JmsTemplate jmsTemplate;

    public JmsTemplate getJmsTemplate() {
        return jmsTemplate;
    }

    public void send() {
        CustomMessage message = new CustomMessage();
        jmsTemplate.convertAndSend(message);
    }


    private class CustomMessage {
        private final String text = "Hello, World!";
    }
}
