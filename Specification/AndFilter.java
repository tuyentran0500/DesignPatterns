package Specification;

public class AndFilter implements IFilter {
    private Filter filterLeft;
    private Filter filterRight;
    public AndFilter(Filter filterLeft, Filter  filterRight){
        this.filterLeft = filterLeft;
        this.filterRight = filterRight;
    }
    @Override
    public boolean isValid(SearchParams params, File file) {
        // TODO Auto-generated method stub
        return this.filterLeft.isValid(params, file) && this.filterRight.isValid(params, file);
    }
}
