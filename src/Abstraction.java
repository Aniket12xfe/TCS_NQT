abstract class Student{
    abstract public void Entry();
    abstract public void present();
    public void Marks(){
        System.out.println("Pass or fail");
    }
}

public class Abstraction extends Student {
    @Override
    public void Entry() {
        System.out.println("Entry in Register");
    }

    @Override
    public void present() {
        System.out.println("Student is present");
    }

    public static void main(String[] args) {
        Abstraction ab = new Abstraction();
        ab.Entry();
        ab.present();
        ab.Marks();

    }
}
