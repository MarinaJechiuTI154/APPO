import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TeoriaSistemelor extends Disciplina {

    public TeoriaSistemelor( double examen, double test1) throws IOException {
        super(examen);
        setAtestare1(test1);
        setLaboratoare(readFile());
        setAtestare2(mediaLaboratoare(1, 5));
    }

    private double mediaLaboratoare(int primulLaborator, int numarLaboratoare){
        double media = 0;
        for (int i = primulLaborator-1; i < primulLaborator + numarLaboratoare -1; i++) {
            media += getLaboratoare().get(i);
        }
        return media/numarLaboratoare;
    }

    public static String readFile() throws IOException {
        String content = null;
        File file = new File("ts.txt"); // For example, foo.txt
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            content = new String(chars);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return content;
    }

}
