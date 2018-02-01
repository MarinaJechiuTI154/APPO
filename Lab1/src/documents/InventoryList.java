package documents;

import persons.Person;
import store.Product;

import java.util.ArrayList;
import java.util.Date;

public class InventoryList extends Document {
    private String administrator;
    private Product product;
    private double quantity;
    private double price;

    public InventoryList(int typeAcc, Person user, Date date, String administrator, Product product, double quantity, double price) {
        super(typeAcc, user, date);
        this.administrator = administrator;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    public String getProduct() {
        return product.getName();
    }

    public void setProduct(Product product) {
        this.product = product;
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

    @Override
    public String toString() {
        return "InventoryList{" +
                "administrator='" + administrator + '\'' +
                ", product=" + product.getName() +
                ", quantity=" + quantity +
                ", price=" + price +
                '}' + "\n";
    }
}
