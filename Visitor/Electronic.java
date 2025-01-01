package Visitor;
class Electronics implements Item {
    private String brand;
    private double price;

    public Electronics(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }
}
