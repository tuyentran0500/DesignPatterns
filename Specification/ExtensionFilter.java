package Specification;

public class ExtensionFilter implements IFilter{
    @Override
    public boolean isValid(SearchParams params, File file) {
        // TODO Auto-generated method stub
        if (params.extensions == null){
            return true;
        }
        return params.extensions.equals(file.getExtension());
    }
}
