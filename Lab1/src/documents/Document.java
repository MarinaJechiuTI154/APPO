package documents;

import java.util.ArrayList;
import java.util.Date;

public class Document implements DocumentManagement{
    private  int numberDoc;
    private int typeAcc;
    private int user;
    private Date date;

    private static int number = 1;

    public Document() {
    }

    public Document(int typeAcc, int user, Date date) {
        this.numberDoc = number++;
        this.typeAcc = typeAcc;
        this.user = user;
        this.date = date;
    }

    public int getNumberDoc() {
        return numberDoc;
    }

    public int getTypeAcc() {
        return typeAcc;
    }

    public int getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    private void setTypeAcc(int typeAcc) {
        this.typeAcc = typeAcc;
    }

    private void setUser(int user) {
        this.user = user;
    }



    @Override
    public String toString() {
        return "Number doc: " + getNumberDoc() + "\n" +
                "Type doc: "  + getTypeAcc()  + "\n" +
                "User: "  + getUser() + "\n" +
                "Date: " + getDate() + "\n" ;
    }


    @Override
    public void editDoc() {
    }

    @Override
    public ArrayList<Document> deleteDoc(ArrayList <Document> arrayList) {
        for (Document list : arrayList) {
            arrayList.remove(list);
        }
        return arrayList;
    }

    @Override
    public boolean searchDoc(ArrayList<Document> arrayList, int i) {
        for (Document list : arrayList) {
            if(list.getNumberDoc() == i)
                return true;
        }
        return false;
    }

}
