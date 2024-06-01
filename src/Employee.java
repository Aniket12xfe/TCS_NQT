public class Employee {
    String name = "Aniket";
    int employeeID = 4101008;

    public void work(){
        System.out.println("I am working....");
    }
}

class Developer extends Employee{
    public void Develop(){
        System.out.println("I am developing....");
    }
}

class Manger extends Developer{
    public void Manage(){
        System.out.println("I am Managing....");
    }
}