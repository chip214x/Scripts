package scheduler;

import org.apache.camel.builder.RouteBuilder;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Sreejith S
 * @since: 8/2/12
 * Time: 12:14 PM
 */
public class RB extends RouteBuilder {

    String scheduleString;

    RB(String scheduleString){
        this.scheduleString = scheduleString;
    }


    @Override
    public void configure() throws Exception {
        def definition = from(scheduleString)
        definition.process(new Processor1("This is my message input", "/home/sree/testhi.txt")).process(new Processor2("/home/sree/testhi.txt"));
    }
}
