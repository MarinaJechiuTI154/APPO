package store;


public class Products extends Product {
    private  int Cod;

    private static int i = 1;


     public Products(int subaccount, String name) {
        super(subaccount, name);
        setAccount(211);
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
