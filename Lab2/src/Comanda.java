import java.util.ArrayList;

public interface Comanda {
    void comandaDirect(double suma, String produs, ArrayList<Object> list);
    void comandaOnline(int cont, String produs, ArrayList<Object> list);
    void comandaTelefon(int numarTelefon, double suma, String produs, ArrayList<Object> list);
}
