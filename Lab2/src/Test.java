import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        ComenziDirecte comenziDirecte = new ComenziDirecte();
        comenziDirecte.comandaDirect(120.5, "Pizza Peperoni");

        ComenziPlasateOnline comenziPlasateOnline = new ComenziPlasateOnline();
        comenziPlasateOnline.comandaOnline(123456789, "Pizza Capricioasa");

        ComenziPlasateTelefon comenziPlasateTelefon = new ComenziPlasateTelefon();
        comenziPlasateTelefon.comandaTelefon(0104212, 130.2, "Pizza Vegetariana");

        list = Comenzi.getList();

        System.out.println(Arrays.toString(list.toArray()));

    }
}
