import achitare.AchitareCash;
import comanda.ComandaDirect;
import comanda.ComandaTelefon;

public class ComenziPlasateTelefon extends Comenzi implements ComandaTelefon, AchitareCash {
    private int numarTelefon;
    private double suma;
    private String product;

    public ComenziPlasateTelefon() {
        super();
    }

    private void adaugaComanda (int numarTelefon, double suma, String product) {
        this.numarTelefon = numarTelefon;
        this.suma = suma;
        this.product = product;
        setList(this);
    }

    @Override
    public void achitareCash() {
        delete(this);
    }

    @Override
    public void comandaTelefon(int numarTelefon, double suma, String produs) {
        adaugaComanda(numarTelefon, suma, produs);
        setList(this);
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
