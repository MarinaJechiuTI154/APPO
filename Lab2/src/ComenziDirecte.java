import achitare.AchitareCash;
import comanda.ComandaDirect;

public class ComenziDirecte extends Comenzi implements ComandaDirect, AchitareCash  {
    private double suma;
    private String produs;

    public ComenziDirecte() {
        super();
    }

    private void adaugaComanda(double suma, String produs) {
        this.suma = suma;
        if (suma>0)
        this.produs = produs;
        setList(this);
    }

    @Override
    public  void achitareCash() {
        delete(this);
    }

    @Override
    public void comandaDirect(double suma, String produs) {
         this.adaugaComanda(suma, produs);
        setList(this);
    }

    @Override
    public String toString() {
        return "ComenziDirecte{" +
                "suma=" + suma +
                ", produs='" + produs + '\'' +
                '}' + '\n';
    }


}
