package indexer

import org.junit.Before
import org.junit.After
import org.junit.Test

/**
 * Created with IntelliJ IDEA.
 * User: sree
 * Date: 9/10/12
 * Time: 3:59 PM
 * To change this template use File | Settings | File Templates.
 */
class IndexDiggerTest {

    IndexDigger indexDigger

    @Before
    public void setUp() {
        indexDigger = new IndexDigger()
    }

    @After
    public void tearDown(){
        indexDigger = null
    }


    @Test
    public void testIndexDigger() {
         indexDigger.getIndexReader("/home/chip/code/Scripts/src/test/index")
    }
}
