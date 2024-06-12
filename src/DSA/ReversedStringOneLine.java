package DSA;

public class ReversedStringOneLine {
    public static void main(String[] args) {
        String s = "Aniket";
        String str = new StringBuilder(s).reverse().toString();
        System.out.println("Reversed String: "+str);
    }
}
