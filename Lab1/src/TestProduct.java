import documents.PourchaseInvoce;
import store.Materials;
import store.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TestProduct {
    public static void main(String[] args) {
        Materials material = new Materials(2, "Sare");
        Materials material1 = new Materials(7, "Lapte");
        Materials material2 = new Materials(9, "Magiun");
        material1.deleteMaterial();
        ArrayList list = material.showAllMaterials();
        System.out.println(Arrays.toString(list.toArray()));


        PourchaseInvoce doc5 = new PourchaseInvoce(2, 3, new Date(13/2/2017),  13.4, 14, "SRL A");
        doc5.setProduct((Product) list.get(1));

    }
}
