package store;

import java.util.ArrayList;
import java.util.Arrays;

public class Materials extends Product {
    private  int Cod;

    private static int i = 1;
    private static ArrayList<Product> arrayList = new ArrayList<>();


    public Materials(int subaccount, String name) {
        super(subaccount, name);
        setAccount(211);
        this.Cod = i++;
        arrayList.add(this);
    }

    public void setCod(int cod) {
        Cod = cod;
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


