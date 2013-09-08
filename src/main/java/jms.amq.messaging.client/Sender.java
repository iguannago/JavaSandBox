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
    @Autowired
    private Queue queue;

    public void setConnectionFactory(ConnectionFactory cf) {
        this.jmsTemplate = new JmsTemplate(cf);
    }

    public void setQueue(Queue queue) {
        this.queue = queue;
    }

    public void simpleSend() {
        this.jmsTemplate.send(this.queue, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage("hello queue world");
            }
        });
    }



}
