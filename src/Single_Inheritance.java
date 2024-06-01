class Male{
    void talk(){
        System.out.println("I am talking...");
    }
}

class Boy extends Male{
    void Walk(){
        System.out.println("I am Walking...");
    }
}

public class Single_Inheritance {
    public static void main(String[] args){
//      Single Inheritance extends one class only
        Boy obj = new Boy();
        obj.talk();
        obj.Walk();
    }
}
