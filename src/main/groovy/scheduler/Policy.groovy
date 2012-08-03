package scheduler

import org.apache.camel.spi.RoutePolicy
import org.apache.camel.Route
import org.apache.camel.Exchange

/**
 * Created with IntelliJ IDEA.
 * @author: Sreejith S
 * @since: 8/2/12
 * Time: 4:16 PM
 * 
 */
class Policy implements RoutePolicy{
    @Override
    void onInit(Route route) {
        println "Initaialized"
    }

    @Override
    void onRemove(Route route) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    void onStart(Route route) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    void onStop(Route route) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    void onSuspend(Route route) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    void onResume(Route route) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    void onExchangeBegin(Route route, Exchange exchange) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    void onExchangeDone(Route route, Exchange exchange) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
