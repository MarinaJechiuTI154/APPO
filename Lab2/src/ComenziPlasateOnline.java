import achitare.AchitareOnline;
import comanda.ComandaOnline;

public class ComenziPlasateOnline extends Comenzi implements AchitareOnline, ComandaOnline {
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
    public void achitareOnline() {
        delete(this);
    }

    @Override
    public void comandaOnline(int cont, String produs) {
         adaugaComanda(cont, produs);
        setList(this);
    }

    @Override
    public String toString() {
        return "ComenziPlasateOnline{" +
                "cont=" + cont +
                ", produs='" + produs + '\'' +
                '}' + '\n';
    }
}
