package Visitor;

class DetailVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("Book: " + book.getTitle() + ", Price: $" + book.getPrice());
    }

    @Override
    public void visit(Electronics electronics) {
        System.out.println("Electronics: " + electronics.getBrand() + ", Price: $" + electronics.getPrice());
    }
}
