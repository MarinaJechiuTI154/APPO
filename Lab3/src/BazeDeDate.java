import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class BazeDeDate extends Disciplina {
    private double test1;
    private double test2;

    public BazeDeDate( double examen, int absente,double test1, double test2) throws IOException {
        super(examen, absente);
        this.test1 = test1;
        this.test2 = test2;
        super.setLaboratoare(readFile());
        setAtestare1(test1);
        setAtestare2(test2);
    }


    @Override
    public void setAtestare1(double test1 ) {
        List<Double> laboratoare = super.getLaboratoare();
        if(super.getAbsente() <= 2)
           super.setAtestare1 (0.5 * mediaLaboratoare(1, 3 ) + 0.4* test1 +1);
        else super.setAtestare1( 0.5 * mediaLaboratoare(1, 3 ) + 0.4* test1 );
    }

    @Override
    public void setAtestare2(double test2 ) {
        List<Double> laboratoare = super.getLaboratoare();
        if(super.getAbsente() <= 4)
            super.setAtestare2 (0.5 * mediaLaboratoare(4, 3) + 0.4* test2 +1);
        else super.setAtestare2( 0.5 * mediaLaboratoare(4, 3) + 0.4* test2 );
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
        File file = new File("bdc.txt"); // For example, foo.txt
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
