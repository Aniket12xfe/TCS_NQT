import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Aniket");
        map.put(2, "Sangita");
        map.put(3, "Vaishnavi");
        map.put(4, "Rajendra");
        for (Map.Entry<Integer, String> family : map.entrySet()){
            System.out.println(family.getKey()+" "+family.getValue());
        }
    }
}
