import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Comenzi lista = new Comenzi();
        ComenziDirecte comenziDirecte = new ComenziDirecte();
        comenziDirecte.comandaDirect(120.5, "Pizza Peperoni");
        lista.setList(comenziDirecte);

        ComenziPlasateOnline comenziPlasateOnline = new ComenziPlasateOnline();
        comenziPlasateOnline.comandaOnline(123456789, "Pizza Capricioasa");
        lista.setList(comenziPlasateOnline);

        ComenziPlasateTelefon comenziPlasateTelefon = new ComenziPlasateTelefon();
        comenziPlasateTelefon.comandaTelefon(0104212, 130.2, "Pizza Vegetariana");
        lista.setList(comenziPlasateTelefon);

        System.out.println(lista);




    }
}
