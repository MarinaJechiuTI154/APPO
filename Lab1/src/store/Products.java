package store;

import java.util.ArrayList;

public class Products extends Product {
    private  int Cod;

    private static ArrayList<Products> list = new ArrayList<>();
    private static int i = 1;


    public Products() {
        super();
    }

    public Products(int subaccount, String name) {
        super(subaccount, name);
        setAccount(211);
        this.Cod = i++;
        list.add(this);
    }

    public void deleteProduct() {
        list.remove(this);
    }

    public int getCod() {
        return Cod;
    }

    @Override
    public String toString() {
        return "Cod\t" + getCod() + "\n" +
                "Cont\t" + getAccount() + "\n" +
                "Subcont\t" + getSubaccount() + "\n" +
                "Name\t" + getName() + "\n\n";
    }

    public ArrayList showAllProducts(){
        return list;
    }
}
