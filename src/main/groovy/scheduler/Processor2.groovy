package scheduler

import org.apache.camel.Processor
import org.apache.camel.Exchange

/**
 * Created with IntelliJ IDEA.
 * @author: Sreejith S
 * @since: 8/2/12
 * Time: 12:30 PM
 * 
 */
class Processor2 implements Processor{


    @Override
    void process(Exchange exchange) {

        String fileName = exchange.getIn().getBody()

        new File(fileName).eachLine {
            println "Processor two reads data from file : -> "  + it
        }

    }
}
