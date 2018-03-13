import java.util.ArrayList;

public class ComenziDirecte implements Achitare, Comanda {

    private double suma;
    private String produs;

    public ComenziDirecte() {
    }

    private void adaugaComanda(double suma, String produs) {
        this.suma = suma;
        if (suma>0)
            this.produs = produs;
    }

    @Override
    public  void achitareCash(ArrayList<Object> list) {
        list.remove(this);
    }

    @Override
    public void comandaDirect(double suma, String produs, ArrayList<Object> list) {
        this.adaugaComanda(suma, produs);
        list.add(this);
    }

    @Override
    public String toString() {
        return "ComenziDirecte{" +
                "suma=" + suma +
                ", produs='" + produs + '\'' +
                '}' + '\n';
    }

    @Override
    public void achitareOnline(ArrayList<Object> list) {

    }


    @Override
    public void comandaOnline(int cont, String produs, ArrayList<Object> list) {

    }

    @Override
    public void comandaTelefon(int numarTelefon, double suma, String produs, ArrayList<Object> list) {

    }
}
