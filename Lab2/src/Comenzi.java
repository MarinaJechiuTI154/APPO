import java.util.ArrayList;

public class Comenzi {
    private static ArrayList<Object> list = new ArrayList<>();

    public void setList(Object object) {
        list.add(object);
    }

    public static ArrayList<Object> getList(){
        return list;
    }

    public void delete(Object object){
        for (Object iter: list) {
            if(iter.equals(object)){
                list.remove(iter);
            }
        }
    }
}
