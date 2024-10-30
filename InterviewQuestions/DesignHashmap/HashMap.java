package InterviewQuestions.DesignHashmap;

import java.util.ArrayList;
import java.util.List;

public class HashMap {
    private int size;
    private List<Item>[] table;
    public HashMap(int size){
        this.size = size;
        table = new ArrayList[size];
        for(int i=0;i<size;++i){
            table[i] = new ArrayList<>();
        }
    }

    public void insert(Item item){
        table[item.key % size].add(item);
    }

    public Item find(int key){
        for(Item item : table[key % size]){
            if (item.key == key){
                return item;
            }
        }
        return null;
    }

    public Item remove(int key){
        for(Item item : table[key % size]){
            if (item.key == key){
                table[key % size].remove(item);
                return item;
            }
        }
        return null;
    }

    
}
