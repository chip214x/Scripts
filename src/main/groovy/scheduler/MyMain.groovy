package scheduler

import org.apache.camel.CamelContext
import org.apache.camel.impl.DefaultCamelContext

/**
 * Created with IntelliJ IDEA.
 * @author: Sreejith S
 * @since: 8/2/12
 * Time: 12:40 PM
 * 
 */
class MyMain {

    public static void main(String[] args){

        String period = 0
        String delay = 1000 * 1
        String scheduleString = "timer:schedule?period=$period&delay=$delay&daemon=true"
        CamelContext context = new DefaultCamelContext();
        context.addRoutes(new RB(scheduleString));

        context.start();
        while(true){

        };

    }

}
