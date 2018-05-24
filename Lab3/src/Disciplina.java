import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private double atestare1;
    private double atestare2;
    private double examen;
    private List<Double> laboratoare = new ArrayList<>();
    private int absente;


    public Disciplina(double atestare1, double atestare2, double examen) {
        this.atestare1 = atestare1;
        this.atestare2 = atestare2;
        this.examen = examen;
    }


    public Disciplina(double examen, int absente) {
        this.examen = examen;
        this.absente = absente;
    }

    public Disciplina(double examen) {
        this.examen = examen;
    }



    public int getAbsente() {
        return absente;
    }

    public double getAtestare1() {
        return atestare1;
    }

    public void setAtestare1(double atestare1) {
        this.atestare1 = atestare1;
    }

    public double getAtestare2() {
        return atestare2;
    }

    public void setAtestare2(double atestare2) {
        this.atestare2 = atestare2;
    }

    public double getExamen() {
        return examen;
    }

    public void setExamen(double examen) {
        this.examen = examen;
    }

    public void setLaboratoare(String str){
        laboratoare = parseString(str);
    }

    public List<Double> getLaboratoare() {
        return laboratoare;
    }

    private static List<Double> parseString(String sentence) {
        List<Double> words = new ArrayList<>();
        BreakIterator breakIterator = BreakIterator.getWordInstance();
        breakIterator.setText(sentence);
        int lastIndex = breakIterator.first();
        while (BreakIterator.DONE != lastIndex) {
            int firstIndex = lastIndex;
            lastIndex = breakIterator.next();
            if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(sentence.charAt(firstIndex))) {
                words.add(Double.parseDouble(sentence.substring(firstIndex, lastIndex)));
            }
        }
        return words;
    }
}
