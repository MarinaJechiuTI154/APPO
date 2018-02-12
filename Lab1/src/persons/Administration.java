package persons;

import persons.enums.AdministrationFunction;

import java.util.ArrayList;
import java.util.Arrays;

public class Administration extends Person  {
    private int accesRight;
    private double salary;
    private AdministrationFunction function;

    ArrayList<Administration> arrayList = new ArrayList<>();

    public Administration(String name, String surname, int accesRight, double salary, AdministrationFunction function) {
        super(name, surname);
        this.accesRight = accesRight;
        this.salary = salary;
        this.function = function;
        arrayList.add(this);
    }

    public int getAccesRight() {
        return accesRight;
    }

    public void setAccesRight(int accesRight) {
        this.accesRight = accesRight;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public AdministrationFunction getFunction() {
        return function;
    }

    public void setFunction(AdministrationFunction function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "Administration{" +
                "cod=" + getCod() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                "salary=" + salary +
                ", function=" + function +
                '}';
    }

    public ArrayList<Administration> showAdministration(){
        return arrayList;
    }
}
