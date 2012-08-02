package scheduler

import org.apache.camel.Processor
import org.apache.camel.Exchange

/**
 * Created with IntelliJ IDEA.
 * @author: Sreejith S
 * @since: 8/2/12
 * Time: 12:21 PM
 *
 */
class Processor1 implements Processor{

    String mymessage
    String fileName

    Processor1(String mymessage, String fileName) {
        this.mymessage = mymessage
        this.fileName = fileName
    }

    @Override
    void process(Exchange exchange) {
        File f = new File(fileName)
        f.append("Processor1 writes message :" + mymessage )
    }
}
