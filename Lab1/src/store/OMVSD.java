package store;

import java.util.ArrayList;
import java.util.Arrays;

public class OMVSD extends Product {
    private int Cod;

    private static int i = 1;
    private static ArrayList<OMVSD> arrayList = new ArrayList<>();


    public OMVSD(int subaccount, String name) {
        super(subaccount, name);
        setAccount(213);
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
