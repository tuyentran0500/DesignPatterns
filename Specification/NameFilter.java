package Specification;

public class NameFilter implements IFilter {
    @Override
    public boolean isValid(SearchParams params, File file) {
        if (params.name == null){
            return true;
        }
        // TODO Auto-generated method stub
        return params.name.equals(file.getName());
    }
}
