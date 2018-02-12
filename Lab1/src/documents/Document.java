package documents;

import persons.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Document {
    private  int numberDoc;
    private int typeAcc;
    private Date date;

    private static int number = 1;

    public Document(int typeAcc, Date date) {
        this.numberDoc = number++;
        this.typeAcc = typeAcc;
        this.date = date;
    }

    public int getNumberDoc() {
        return numberDoc;
    }

    public int getTypeAcc() {
        return typeAcc;
    }


    public Date getDate() {
        return date;
    }

    private void setTypeAcc(int typeAcc) {
        this.typeAcc = typeAcc;
    }


    public void print() {
        System.out.println("Number doc: " + getNumberDoc() + "\n" +
                "Type doc: "  + getTypeAcc()  + "\n" +
                "Date: " + getDate() + "\n");
    }

}
