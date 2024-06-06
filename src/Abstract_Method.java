abstract class Animal1{
    public abstract void makeSound();
    public void sleep(){
        System.out.println("Sleeping...");
    }
}

class Dog1 extends Animal1{
    @Override
    public void makeSound() {
        System.out.println("Bark...");
    }
}

public class Abstract_Method {
    public static void main(String[] args) {
    Dog1 d1 = new Dog1();
    d1.makeSound();
    d1.sleep();
    }
}
