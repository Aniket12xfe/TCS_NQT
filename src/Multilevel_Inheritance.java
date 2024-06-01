class Animal{
    void eat(){
        System.out.println("Animal is eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking...");
    }
}
class Puppy extends Dog{
    void Baby(){
        System.out.println("Puppy is baby of dog...");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Puppy py = new Puppy();
        py.eat();
        py.bark();
        py.bark();
    }
}
