package store;

public class Product {

    private int account;
    private int subaccount;
    private String name;



    public Product(int subaccount, String name) {
        this.subaccount = subaccount;
        this.name = name;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }

    public int getSubaccount() {
        return subaccount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "account=" + account +
                ", subaccount=" + subaccount +
                ", name='" + name + '\'' +
                '}';
    }
}
