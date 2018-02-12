package store;

import java.util.ArrayList;

public class OMVSD extends Product {
    private  int Cod;

    private static int i = 1;


    public OMVSD(int subaccount, String name) {
        super(subaccount, name);
        setAccount(213);
        this.Cod = i++;
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

}
