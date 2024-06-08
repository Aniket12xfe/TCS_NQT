public class PassByValue {
    public static void main(String[] args) {
        int num = 10;
        passByValue(num);
        System.out.println("The pass by value is: "+num);
    }

    public static void passByValue(int n){
        n = 20;
    }
}
