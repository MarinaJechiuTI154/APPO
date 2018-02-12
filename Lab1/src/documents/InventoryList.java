package documents;

import persons.Administration;
import persons.Person;
import store.Product;
import java.util.Date;

public class InventoryList extends Document {
    private Administration user;
    private Person gestionar;
    private Product product;
    private double quantity;
    private double price;

    public InventoryList(int typeAcc, Date date, Administration user, Person gestionar, Product product, double quantity, double price) {
        super(typeAcc, date);
        this.gestionar = gestionar;
        this.product = product;
        this.quantity = quantity;
        this.price = price;

    }

    public Person getGestionar() {
        return gestionar;
    }

    public void setGestionar(Person gestionar) {
        this.gestionar = gestionar;
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

    public Administration getUser() {
        return user;
    }

    @Override
    public void print() {
        System.out.println("InventoryList{" +
                "Number doc: " + getNumberDoc() + "\n" +
                "Type doc: "  + getTypeAcc()  + "\n" +
                "Date: " + getDate() + "\n" +
                "User: "  + user.getName() +"  " + user.getSurname() + "\n" +
                "gestionar='" + gestionar.getName() +"  " + user.getSurname()+ '\n' +
                ", product=" + product.getName() + '\n' +
                ", quantity=" + quantity + '\n' +
                ", price=" + price +
                '}' + "\n");
    }


}
