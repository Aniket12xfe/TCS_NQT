public class Main {
    public static void main(String[] args) {
        Manger obj = new Manger();
        System.out.println(obj.employeeID);
        System.out.println(obj.name);
        obj.Develop();
        obj.Manage();
        obj.work();

        System.out.println("----------------------");

        Developer dev = new Developer();
        System.out.println(dev.name);
        System.out.println(dev.employeeID);
        dev.Develop();
        dev.work();

        System.out.println("-----------------------");

        Employee emp = new Employee();
        System.out.println(emp.name);
        System.out.println(emp.employeeID);
        emp.work();
    }
}