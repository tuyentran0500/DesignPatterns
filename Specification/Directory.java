package Specification;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private List<Entry> entries;

    public Directory(String name){
        entries = new ArrayList<>();
        this.name = name;
        this.extension = null;
    }
    @Override
    public boolean isDirectory() {
        // TODO Auto-generated method stub
        return true;
    }
    public List<Entry> getEntries() {
        return entries;
    }

    public void addEntry(Entry entry){
        entries.add(entry);
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        int ans = 0;
        for(Entry entry : entries){
            ans += entry.getSize();
        }
        return ans;
    }
}
