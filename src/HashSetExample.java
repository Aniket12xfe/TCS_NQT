import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> st = new HashSet<>();
        st.add("Aniket");
        st.add("Mitali");
        st.add("Om");
        st.add("Ashwini");
        for(String str : st){
            System.out.print(str+" ");
        }
    }
}
