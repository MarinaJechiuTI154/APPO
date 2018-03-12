import documents.Document;
import documents.InventoryList;
import documents.PourchaseInvoce;
import documents.SalesInvoce;
import persons.Administration;
import persons.Employee;
import persons.enums.AdministrationFunction;
import persons.enums.Departments;
import persons.enums.ExecutionFunction;
import store.*;
import java.util.Date;

public class TestProduct {
    public static void main(String[] args) {
        //create Administration person;
        Administration user1 = new Administration("Tonu", "Maria", 1, 1500, AdministrationFunction.Contabil);
        Employee user2 = new Employee("Alina", "Iovu", ExecutionFunction.Depozitar, Departments.Depozitare, 2000);
        Administration user3 = new Administration("Cristi", "Albu", 3, 1600, AdministrationFunction.Contabil_sef);
        Administration user4 = new Administration("Mihai", "Plugaru", 3, 5500, AdministrationFunction.Director);
        System.out.println("Persoanele din administratie inregistrate\n");
        System.out.println(user1.show());
        System.out.println("Muncitorii inregistrate\n");
        System.out.println(user2.show());


        //create store
        Materials material1 = new Materials(2, "lapte");
        OMVSD omvsd = new OMVSD(1, "Capsator");
        Merchandises merchandises = new Merchandises(2, "Lapte condensat");
        Products products = new Products(4, "Biscuiti");
        System.out.println("\n\n Materialele din stoc \n");
        System.out.println(material1.show() + "\n");
        System.out.println("Marfurile din stoc \n");
        System.out.println(merchandises.show() + "\n");
        System.out.println("OMVSD in stoc");
        System.out.println(omvsd.show());
        System.out.println("Produse in stoc \n");
        System.out.println(products.show());



        //create idocuments
        InventoryList inventoryList1 = new InventoryList(1, new Date(10/01/2017), user1, user2, material1, 120, 12.5);
        System.out.println("Lista documentelor inregistrate: ");
        inventoryList1.print();
        Document salesInvoice = new SalesInvoce(1, new Date(10/2/2018), user4, omvsd, 125, 25.7, "SRL A");
        salesInvoice.print();
        Document pourchaseInvoice = new PourchaseInvoce(2, new Date(01/01/2018), user3, products, 12,12, "SRL B");
        pourchaseInvoice.print();

    }

}
