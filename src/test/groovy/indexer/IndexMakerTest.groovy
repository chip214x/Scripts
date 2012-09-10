package indexer

import org.junit.Before
import org.junit.After
import org.junit.Test
import org.apache.lucene.index.IndexWriter
import indexer.Doc
import indexer.IndexMaker
/**
 * Created with IntelliJ IDEA.
 * User: sree
 * Date: 9/10/12
 * Time: 12:46 PM
 * To change this template use File | Settings | File Templates.
 */


class IndexMakerTest {

    IndexMaker indexMaker

    @Before
    public void setUp() {

    }

    @After
    public void tearDown(){

    }


    @Test
    public void testCreateIndex() {
        indexMaker = new IndexMaker()
        IndexWriter indexWriter = indexMaker.createIndexer("/home/sree/code/Word_ELimination/src/test/index")
        Doc doc = new Doc("/home/sree/code/Word_ELimination/src/resources")
        println doc.getText()
        indexMaker.indexDocument(indexWriter,doc)
        indexWriter.close()

    }

}
