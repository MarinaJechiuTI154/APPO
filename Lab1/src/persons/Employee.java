package persons;

import persons.enums.AdministrationFunction;
import persons.enums.Departments;
import persons.enums.ExecutionFunction;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee extends Person {
    private Departments department;
    private double salary;
    private ExecutionFunction function;


    public Employee(String name, String surname, ExecutionFunction function, Departments department, double salary) {
        super(name, surname);
        this.function = function;
        this.department = department;
        this.salary = salary;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ExecutionFunction getFunction() {
        return function;
    }

    public void setFunction(ExecutionFunction function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                ", salary=" + salary +
                ", function=" + function +
                '}'+ "\n";
    }

}
