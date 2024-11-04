package Specification;

public class MaxSizeFilter implements IFilter {
    @Override
    public boolean isValid(SearchParams params, File file) {
        if (params.maxSize == null){
            return true;
        }
        return params.maxSize >= file.getSize();
    }
}
