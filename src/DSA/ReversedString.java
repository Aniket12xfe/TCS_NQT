package DSA;

public class ReversedString {
    public static String reverseString(String s){
        StringBuilder revStr = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--){
            revStr.append(s.charAt(i));
        }
        return revStr.toString();

    }
    public static void main(String[] args) {
        String str = "Aniket";
        String result = reverseString(str);
        System.out.println(result);
    }
}
