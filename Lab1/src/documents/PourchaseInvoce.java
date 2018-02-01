package documents;

import store.Product;

import java.util.Date;

public class PourchaseInvoce extends Document {
    private Product product;
    private double quantity;
    private double price;
    private String provider;

    public PourchaseInvoce(int typeAcc, int user, Date date, double quantity, double price, String provider) {
        super(typeAcc, user, date);
        this.quantity = quantity;
        this.price = price;
        this.provider = provider;
    }


    public void setProduct(Product product) {
        this.product = product;
    }

    public String getProduct() {
        return product.getName();
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    public String toString() {
        return "PourchaseInvoce{" +
                "product=" + product.getName() +
                ", quantity=" + quantity +
                ", price=" + price +
                ", provider='" + provider + '\'' +
                '}';
    }
}
