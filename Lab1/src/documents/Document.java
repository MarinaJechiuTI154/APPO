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
    private static ArrayList<Document> arrayList = new ArrayList<>();

    public Document(int typeAcc, Date date) {
        this.numberDoc = number++;
        this.typeAcc = typeAcc;
        this.date = date;
        arrayList.add(this);
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

    public void showDocuments(){
        System.out.println(Arrays.toString(arrayList.toArray()));
    }



    public void deleteDocument(int number) {
        for (Document list : arrayList) {
            if(list.getNumberDoc() == number)
            arrayList.remove(list);
        }
    }


    public boolean searchDocument(int number){
        for (Document list : arrayList) {
            if(list.getNumberDoc() == number)
                return true;
        }
        return false;
    }



}
