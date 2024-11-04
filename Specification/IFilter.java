package Specification;

public interface IFilter {
    boolean isValid(SearchParams params, File file);
    
}