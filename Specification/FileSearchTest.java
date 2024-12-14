package Specification;

public class FileSearchTest {
    public static void main(String[] args) {
        SearchParams params = new SearchParams();
        // params.extensions = "xml";
        params.name = "aaa";
        params.maxSize = 5;
        File xmlFile = new File("aaa", "xml");
    
        File txtFile = new File("aaa", "txt");
    
        File jsonFile = new File("ccc", "json");
    
        Directory dir1 = new Directory("test Directory");
        dir1.addEntry(txtFile);
        dir1.addEntry(xmlFile);
    
        Directory dir0 = new Directory("Parent Direct");
        dir0.addEntry(jsonFile);
        dir0.addEntry(dir1);
    
        FileSearcher searcher = new FileSearcher();
        System.out.println(searcher.search(dir0, params));
    }
}
