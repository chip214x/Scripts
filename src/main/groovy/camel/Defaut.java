package camel;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

import javax.jms.ConnectionFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Sreejith S
 * @since: 8/2/12
 * Time: 11:46 AM
 */

public class Defaut {

    public static void main(String[] args ) throws Exception {
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new SampleRB());


        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost?broker.persistent=false");
        context.addComponent("test-jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));


        ProducerTemplate template = context.createProducerTemplate();
        context.start();

        for (int i = 0; i < 10; i++) {
            template.sendBody("test-jms:queue:test.queue", "Test Message: " + i);
        }

       System.exit(0);
    }

}
