import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> AL = new ArrayList<>();
        AL.add(10);
        AL.add(20);
        AL.add(30);
        AL.add(40);
        for (Integer arr : AL){
            System.out.println(arr);
        }
        System.out.println("------------------------");
        Collections.sort(AL);
        for (Integer arr : AL){
            System.out.println(arr);
        }
    }
}
