import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comenzi<T> {
    private    List<T> list =  list = new ArrayList<T>();

    public Comenzi() {
    }

    public void setList(T object) {
        list.add(object);
    }

    public  List<T> getList(){
        return list;
    }

    public void delete(T object){
        for (T iter: list) {
            if(iter.equals(object)){
                list.remove(iter);
            }
        }
    }

    @Override
    public String toString() {
        return "Comenzi{" +
                "list=" + Arrays.toString(list.toArray()) +
                '}';
    }
}
