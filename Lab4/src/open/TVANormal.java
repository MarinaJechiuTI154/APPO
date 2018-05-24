package open;

public class TVANormal extends  TVA {
    @Override
    public double calculateTVA(double price) {
        return price * 0.2;
    }
}
