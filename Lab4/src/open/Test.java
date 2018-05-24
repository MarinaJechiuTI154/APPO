package open;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();
        Product piine  = new Product("piine",5, new TVALactate());
        product.add(piine);
        Product gaz  = new Product("gaz",10, new TVAPetrol());
        product.add(gaz);
        Product ciocolata  = new Product("ciocolata",55, new TVANormal());
        product.add(ciocolata);
        Product marfuriExport  = new Product("mere",10, new TVAEXport());
        product.add(marfuriExport);

        System.out.println(product);
    }
}
