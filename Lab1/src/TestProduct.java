import documents.Document;
import documents.InventoryList;
import documents.PourchaseInvoce;
import documents.SalesInvoce;
import persons.Function;
import persons.Person;
import store.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TestProduct {
    public static void main(String[] args) {
        //creare produse
        Materials material = new Materials(2, "Sare");
        Product material1 = new Materials(7, "Lapte");
        Products product = new Products(1, "Franzele");
        Product product1 = new Products(2, "Chifle");
        OMVSD omvsd =  new OMVSD(3, "Printer");
        Product omvsd1 =  new OMVSD(2, "Capsator");
        Merchandises merchandises =  new Merchandises(1, "Lapte condensat");
        Product merchandises1 =  new Merchandises(2, "");
        showStore(material, product, omvsd, merchandises);


        //creare utilizatori
        Person user = new Person("Jechiu", "Marina", Function.Contabil_sef);
        Person user1 = new Person("Tonu", "Maria", Function.Contabil);
        Person user2 = new Person("Sarpe", "Diana", Function.Casier);
        System.out.println("Utilizatori inregistrati: \n" + Arrays.toString(user.showPersons().toArray()));


        //creare documente
        ArrayList<Document> documents = new ArrayList<>();
        SalesInvoce salesInvoce = new SalesInvoce(1, user1,new Date(10/2/2017), omvsd, 14.5, 4.25, "SRL A");
        documents.add(salesInvoce);
        Document pourchaseInvoce = new PourchaseInvoce(3, user, new Date(14/3/2018), merchandises, 123, 50.5, "SRL B");
        documents.add(pourchaseInvoce);
        InventoryList inventoryList = new InventoryList(1,user1,new Date(1/1/2018),"Tonu Ion", material, 25, 5);
        documents.add(inventoryList);
        Document salesInvoce1 = new SalesInvoce(2, user2, new Date(14/11/2017), omvsd1, 23, 14,"SRL A");
        documents.add(salesInvoce1);
        Document salesInvoce2 = new SalesInvoce(2, user2, new Date(14/10/2017), material1, 27, 14,"SRL C");
        documents.add(salesInvoce2);
        InventoryList inventoryList1 = new InventoryList(1, user, new Date(12/12/2012), "Plugaru Mihai", product1, 12,12);
        documents.add(inventoryList1);
        Document inventoryList2 = new InventoryList(2, user1, new Date(12/3/2016), "Pisica Doina", merchandises1,14, 2 );
        documents.add(inventoryList2);
        System.out.println("Documente inregistrate: \n" + Arrays.toString(documents.toArray()));







    }

    public static void showStore(Materials material, Products product, OMVSD omvsd, Merchandises merchandises) {
        System.out.println("All materials in store: \n" + Arrays.toString(material.showAllMaterials().toArray()));
        System.out.println("All products in store: \n" + Arrays.toString(product.showAllProducts().toArray()));
        System.out.println("All omvsd in store: \n" + Arrays.toString(omvsd.showAllOMVSD().toArray()));
        System.out.println("All merchandises in store: \n" + Arrays.toString(merchandises.showAllMerchandises().toArray()));
        return;
    }
}
