package documents;

import persons.Person;
import store.Product;

import java.util.Date;

public class SalesInvoce extends Document {
    private Product product;
    private double quantity;
    private double price;
    private String customer;

    public SalesInvoce(int typeAcc, Person user, Date date, Product product, double quantity, double price, String customer) {
        super(typeAcc, user, date);
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.customer = customer;
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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "SalesInvoce{" +
                "product=" + product.getName() +
                ", quantity=" + quantity +
                ", price=" + price +
                ", customer='" + customer + '\'' +
                '}' + "\n";
    }
}
