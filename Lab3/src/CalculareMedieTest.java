import java.io.IOException;

public class CalculareMedieTest {
    public static void main(String[] args) throws IOException {
        CalculareMedie calculareMedie = new CalculareMedie();

        System.out.println("Lab disciplina: " +calculareMedie.CalculMedie(new Disciplina(10, 10, 9)));
        System.out.println("Lab BDC: " + calculareMedie.CalculMedie(new BazeDeDate(10, 10, 9, 10)));
        System.out.println("Lab TS: " + calculareMedie.CalculMedie(new TeoriaSistemelor(10, 10)));
        System.out.println("Lab SM: " + calculareMedie.CalculMedie(new SistemeMultimedia(10, 10, 9)));

    }
}
