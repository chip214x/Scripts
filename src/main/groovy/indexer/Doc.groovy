package indexer

/**
 * Created with IntelliJ IDEA.
 * User: sree
 * Date: 9/10/12
 * Time: 12:54 PM
 * To change this template use File | Settings | File Templates.
 */

class Doc {

    String path;
    String text;
    String url;

    Doc(String path) {
        this.path = path
    }

    String getPath() {
        return path
    }

    void setPath(String path) {
        this.path = path
    }

    String getText() {
        try{
            return new File(path).text
        } catch(FileNotFoundException e){
            return ""
        }
    }

    void setText(String text) {
        this.text = text
    }

    String getUrl() {
        return url
    }

    void setUrl(String url) {
        this.url = url
    }
}
