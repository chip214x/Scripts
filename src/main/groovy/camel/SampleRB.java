package camel;

import org.apache.camel.builder.RouteBuilder;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Sreejith S
 * @since: 8/2/12
 * Time: 11:54 AM
 */
public class SampleRB extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("test-jms:queue:test.queue").to("file:/home/sree/camelfile");
    }
}
