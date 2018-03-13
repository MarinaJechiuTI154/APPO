import java.util.ArrayList;

public class ComenziPlasateOnline implements Achitare, Comanda {
    private int cont;
    private String produs;

    public ComenziPlasateOnline() {
    }

    private void adaugaComanda(int cont, String produs) {
        if(cont> 1000000000 && cont < 999999999)
            this.cont = cont;
        this.produs = produs;
    }

    @Override
    public void achitareOnline(ArrayList<Object> list) {

        list.remove(this);
    }

    @Override
    public void comandaOnline(int cont, String produs, ArrayList<Object> list) {
        adaugaComanda(cont, produs);
        list.add(this);
    }

    @Override
    public String toString() {
        return "ComenziPlasateOnline{" +
                "cont=" + cont +
                ", produs='" + produs + '\'' +
                '}' + '\n';
    }


    @Override
    public void achitareCash(ArrayList<Object> list) {

    }

    @Override
    public void comandaDirect(double suma, String produs, ArrayList<Object> list) {

    }


    @Override
    public void comandaTelefon(int numarTelefon, double suma, String produs, ArrayList<Object> list) {

    }
}
