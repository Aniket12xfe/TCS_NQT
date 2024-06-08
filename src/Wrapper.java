public class Wrapper {
    public static void main(String[] args) {

//        Autoboxing: Primitive to wrapper class
        Integer intObject = 100;
        Double doubleObject = 12.55;

//        Unboxing: wrapper class to Primitive

        int intPrimitive = intObject;
        double doublePrimitive = doubleObject;

        System.out.println(intObject);
        System.out.println(doubleObject);
        System.out.println(intPrimitive);
        System.out.println(doublePrimitive);
    }
}
