package documents;

import java.util.ArrayList;

public interface DocumentManagement {
      void editDoc();
      ArrayList<Document> deleteDoc(ArrayList<Document> arrayList);
      boolean searchDoc(ArrayList<Document> arrayList, int i);


}
