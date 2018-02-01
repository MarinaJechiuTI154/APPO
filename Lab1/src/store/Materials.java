package store;

import java.util.ArrayList;

public class Materials extends Product {
    private  int Cod;

    private static ArrayList<Materials> list = new ArrayList<>();
    private static int i = 1;


    public Materials() {
        super();
    }

    public Materials(int subaccount, String name) {
        super(subaccount, name);
        setAccount(211);
        this.Cod = i++;
        list.add(this);
    }

    public void deleteMaterial() {
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

     public ArrayList showAllMaterials(){
        return list;
     }
}


