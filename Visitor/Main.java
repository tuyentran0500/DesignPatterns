package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Book("Design Patterns", 30.0));
        items.add(new Electronics("Smartphone", 200.0));

        // Pricing Visitor
        PricingVisitor pricingVisitor = new PricingVisitor();
        for (Item item : items) {
            item.accept(pricingVisitor);
        }
        System.out.println("Total Cost: $" + pricingVisitor.getTotalCost());

        // Detail Visitor
        DetailVisitor detailVisitor = new DetailVisitor();
        for (Item item : items) {
            item.accept(detailVisitor);
        }
    }
}
