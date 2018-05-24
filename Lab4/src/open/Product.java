package open;

public class Product {
    private String name;
    private double cost;
    private double tva;
    private double price;

    public Product(String name, double cost, TVA tva) {
        this.name = name;
        this.cost = cost;
        this.tva = tva.calculateTVA(cost);
        this.price = this.cost + this.tva;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", tva=" + tva +
                ", price=" + price +
                '}' + '\n';
    }
}
