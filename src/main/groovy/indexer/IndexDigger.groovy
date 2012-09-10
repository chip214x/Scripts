package indexer

import org.apache.lucene.index.IndexReader
import org.apache.lucene.store.SimpleFSDirectory
import org.apache.lucene.index.TermEnum
import org.apache.lucene.index.Term
import org.apache.lucene.misc.HighFreqTerms
import org.apache.lucene.misc.TermStats

/**
 * Created with IntelliJ IDEA.
 * User: sree
 * Date: 9/10/12
 * Time: 2:33 PM
 * To change this template use File | Settings | File Templates.
 */

class IndexDigger {

    public void getIndexReader(String indexPath){
        IndexReader reader = IndexReader.open(new SimpleFSDirectory(new File(indexPath)));
        final Map<String,Integer> frequencyMap = new HashMap<String,Integer>();
        List<String> termlist = new ArrayList<String>();
        TermEnum terms = reader.terms();



        while (terms.next()) {
            Term term = terms.term();
            String termText = term.text();
            int frequency = reader.docFreq(term);
            frequencyMap.put(termText, frequency);
            termlist.add(termText);
        }


        ValueComparator bvc =  new ValueComparator(frequencyMap);
        TreeMap<String,Integer> sorted_map = new TreeMap<String,Integer>(bvc);



        sorted_map.putAll(frequencyMap);

        System.out.println("results: "+ sorted_map);


        File f = new File("output.text")
        sorted_map.each{
            f.append(it)
            f.append("\n")
        }

        reader.close();
    }
}
