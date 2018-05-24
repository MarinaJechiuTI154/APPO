package open;

public class TVAPetrol extends TVA {
    @Override
    public double calculateTVA(double price) {
        return price * 0.06;
    }
}
