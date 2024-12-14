package Specification;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FileSearcher {
    private FileFilter filter = new FileFilter();
    public List<File> search(Directory dir, SearchParams params){
        List<File> files = new ArrayList<>();
        Queue<Entry> queue = new LinkedList<>();
        queue.add(dir);
        while (queue.size() > 0){
            Entry entry = queue.remove();
            if (entry.isDirectory() == true){
                Directory directory = (Directory) entry;
                for(Entry childrenEntry : directory.getEntries()){
                    queue.add(childrenEntry);
                }
            }
            else {
                File file = (File) entry;
                if (filter.isValid(params, file)){
                    files.add(file);
                }
            }
        }
        return files;
    }
}
