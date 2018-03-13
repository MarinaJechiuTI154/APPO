import java.util.ArrayList;

public class ComenziPlasateTelefon implements Achitare, Comanda{
    private int numarTelefon;
    private double suma;
    private String product;

    public ComenziPlasateTelefon() {
    }

    private void adaugaComanda (int numarTelefon, double suma, String product) {
        this.numarTelefon = numarTelefon;
        this.suma = suma;
        this.product = product;
    }

    @Override
    public void achitareOnline(ArrayList<Object> list) {

    }

    @Override
    public  void achitareCash(ArrayList<Object> list) {
        list.remove(this);
    }

    @Override
    public void comandaDirect(double suma, String produs, ArrayList<Object> list) {

    }

    @Override
    public void comandaOnline(int cont, String produs, ArrayList<Object> list) {

    }

    @Override
    public void comandaTelefon(int numarTelefon, double suma, String produs, ArrayList<Object> list) {
        adaugaComanda(numarTelefon, suma, produs);
        list.add(this);
    }

    @Override
    public String toString() {
        return "ComenziPlasateTelefon{" +
                "numarTelefon=" + numarTelefon +
                ", suma=" + suma +
                ", product='" + product + '\'' +
                '}' + '\n';
    }
}
