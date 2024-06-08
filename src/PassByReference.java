public class PassByReference {
    public static void main(String[] args) {
        MyClass m = new MyClass(10);
        modifyReference(m);
        System.out.println(m.value);
    }

    public static void modifyReference(MyClass o){
        o.value = 20;
    }
}
