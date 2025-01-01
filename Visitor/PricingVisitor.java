package Visitor;

public class PricingVisitor implements Visitor {
    private double totalCost;
    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public void visit(Book book) {
        totalCost += book.getPrice();
    }

    @Override
    public void visit(Electronics electronics) {
        totalCost += electronics.getPrice();
    }
}
