import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import documents.InventoryList;
import persons.Administration;
import persons.Employee;
import persons.Person;
import persons.enums.AdministrationFunction;
import persons.enums.Departments;
import persons.enums.ExecutionFunction;
import store.*;
import sun.plugin2.main.server.Plugin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TestProduct {
    public static void main(String[] args) {
        ArrayList<Person> listPerson = new ArrayList<>();
        //create Administration person;
        Administration user1 = new Administration("Tonu", "Maria", 1, 1500, AdministrationFunction.Contabil);
        listPerson.add(user1);
        Person user2 = new Employee("Alina", "Iovu", ExecutionFunction.Depozitar, Departments.Depozitare, 2000);
        listPerson.add(user2);
        Administration user3 = new Administration("Cristi", "Albu", 3, 1600, AdministrationFunction.Contabil_sef);
        listPerson.add(user3);
        Administration user4 = new Administration("Mihai", "Plugaru", 3, 5500, AdministrationFunction.Director);
        listPerson.add(user4);
        System.out.println("Persoanele inregistrate\n");
        System.out.println(Arrays.toString(listPerson.toArray()));


        //create store
        ArrayList<Product> listProduct = new ArrayList<>();
        Materials material1 = new Materials(2, "lapte");
        listProduct.add(material1);
        Product omvsd = new OMVSD(1, "Capsator");
        listProduct.add(omvsd);
        Merchandises merchandises = new Merchandises(2, "Lapte condensat");
        listProduct.add(merchandises);
        Product products = new Products(4, "Biscuiti");
        listProduct.add(products);
        System.out.println("\n\n Produsele din stoc \n");
        System.out.println(Arrays.toString(listProduct.toArray()));


        //create idocuments
        InventoryList inventoryList1 = new InventoryList(1, new Date(10/01/2017), user1, user2, material1, 120, 12.5);
        System.out.println("Lista documentelor inregistrate: ");
        inventoryList1.print();

    }

}
