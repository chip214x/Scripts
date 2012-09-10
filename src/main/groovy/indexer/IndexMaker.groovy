package indexer

import org.apache.lucene.index.IndexWriter
import org.apache.lucene.analysis.standard.StandardAnalyzer
import org.apache.lucene.document.Document
import org.apache.lucene.document.Field
import org.apache.lucene.index.IndexWriterConfig
import org.apache.lucene.util.Version
import org.apache.lucene.store.SimpleFSDirectory
/**
 * Created with IntelliJ IDEA.
 * User: sree
 * Date: 9/10/12
 * Time: 12:45 PM
 * To change this template use File | Settings | File Templates.
 */


class IndexMaker {

    IndexMaker() {
    }

    public IndexWriter createIndexer(String indexPath) throws Exception{
        IndexWriterConfig iwc = new IndexWriterConfig(Version.LUCENE_CURRENT,new StandardAnalyzer(Version.LUCENE_CURRENT))
        IndexWriter indexWriter = new IndexWriter(new SimpleFSDirectory(new File(indexPath)),iwc)
        indexWriter
    }


    public void indexDocument(IndexWriter indexWriter,Doc doc){

        try {
        Document document = new Document()
        document.add(new Field("path", doc.getPath(), Field.Store.YES, Field.Index.NO))
        document.add(new Field("content", doc.getText(),Field.Store.YES, Field.Index.ANALYZED))

        indexWriter.addDocument(document)
        } catch (Exception e){
            e.printStackTrace()
        }


    }



}
