package store;


import java.util.ArrayList;
import java.util.Arrays;

public class Products extends Product {
    private int Cod;

    private static int i = 1;
    private static ArrayList<Products> arrayList = new ArrayList<>();


    public Products(int subaccount, String name) {
        super(subaccount, name);
        setAccount(211);
        this.Cod = i++;
        arrayList.add(this);
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

    public String show() {
        return Arrays.toString(arrayList.toArray());
    }

}
