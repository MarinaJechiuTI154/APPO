package documents;

import persons.Administration;
import persons.Person;
import store.Product;

import java.util.Date;

public class SalesInvoce extends Document {
    private Administration user;
    private Product product;
    private double quantity;
    private double price;
    private String customer;


    public SalesInvoce(int typeAcc,  Date date,Administration user, Product product, double quantity, double price, String customer) {
        super(typeAcc, date);
        this.user = user;
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

    public Administration getUser() {
        return user;
    }

    @Override
    public void print() {
        System.out.println("SalesInvoce{" +
                "Number doc: " + getNumberDoc() + "\n" +
                "Type doc: "  + getTypeAcc()  + "\n" +
                "Date: " + getDate() + "\n" +
                "User: "  + user.getName() +"  " + user.getSurname() + "\n" +
                "product=" + product.getName() +
                ", quantity=" + quantity +
                ", price=" + price +
                ", customer='" + customer + '\'' +
                '}' + "\n");
    }
}
