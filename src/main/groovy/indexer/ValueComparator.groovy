package indexer

/**
 * Created with IntelliJ IDEA.
 * User: sree
 * Date: 9/10/12
 * Time: 5:50 PM
 * To change this template use File | Settings | File Templates.
 */

class ValueComparator implements Comparator<String> {

    Map<String, Double> base;
    public ValueComparator(Map<String, Double> base) {
        this.base = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with equals.
    public int compare(String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}

