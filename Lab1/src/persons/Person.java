package persons;

import java.util.ArrayList;

public class Person {
    private int cod;
    private String name;
    private String surname;
    private Function function;

    private static int i = 1;
    private static ArrayList<Person>  arrayList = new ArrayList<>();

    public Person(String name, String surname, Function function) {
        this.cod = i++;
        this.name = name;
        this.surname = surname;
        this.function = function;
        arrayList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cod=" + cod +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", function=" + function +
                '}';
    }

    public ArrayList<Person> showPersons() {
        return arrayList;
    }
}
