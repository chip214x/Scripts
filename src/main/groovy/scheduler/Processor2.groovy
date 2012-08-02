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

    String fileName

    Processor2(String fileName) {
        this.fileName = fileName
    }

    @Override
    void process(Exchange exchange) {

        new File(fileName).eachLine {
            println "Processor two reads data from file : -> "  + it
        }

    }
}
