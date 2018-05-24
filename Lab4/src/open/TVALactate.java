package open;

public class TVALactate extends TVA{
    @Override
    public double calculateTVA(double price) {
        return price*0.08;
    }
}
