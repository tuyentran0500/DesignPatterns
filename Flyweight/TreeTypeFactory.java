package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();
    public static TreeType getTreeType(String type, String color){
        String key = type + "-" + color;
        if (!treeTypes.containsKey(key)){
            treeTypes.put(key, new TreeType(type, color));
        }
        return treeTypes.get(key);
    }
}
