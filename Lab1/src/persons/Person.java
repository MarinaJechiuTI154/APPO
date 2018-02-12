package persons;

import java.util.ArrayList;

public abstract class Person {
    private int cod;
    private String name;
    private String surname;

    private static int i = 1;

    public Person(String name, String surname) {
        this.cod = i++;
        this.name = name;
        this.surname = surname;
    }
    public int getCod(){return cod;}

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


    @Override
    public String toString() {
        return "Person{" +
                "cod=" + cod +
                ", name='" + getName() + '\'' +
                ", surname='" + surname + '\'' +
                '}' + "\n";
    }


}
