

public class CalculareMedie {
    public double CalculMedie(Disciplina disciplina){
        return 0.3 * disciplina.getAtestare1() + 0.3 * disciplina.getAtestare2() + 0.4 * disciplina.getExamen();
    }

    public CalculareMedie() {
    }
}
