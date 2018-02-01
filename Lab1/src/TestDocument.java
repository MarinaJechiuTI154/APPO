import documents.Document;
import documents.PourchaseInvoce;
import store.Materials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TestDocument {
    public static void main(String[] args) {
        PourchaseInvoce doc5 = new PourchaseInvoce(2, 3, new Date(13/2/2017),  13.4, 14, "SRL A");
        Materials material = new Materials();
        ArrayList<Materials> list = material.showAllMaterials();
        System.out.println(Arrays.toString(list.toArray()));


    }
}
