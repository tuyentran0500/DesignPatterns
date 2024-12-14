package Specification;

import java.util.ArrayList;
import java.util.List;

public class FileFilter implements IFilter {
    private final List<IFilter> filters = new ArrayList<>();

    public FileFilter(){
        filters.add(new MaxSizeFilter());
        filters.add(new ExtensionFilter());
        filters.add(new NameFilter());
    }

    @Override
    public boolean isValid(SearchParams params, File file) {
        for(IFilter filter : filters){
            if (filter.isValid(params, file) == false){
                return false;
            }
        }
        return true;
    }
}
