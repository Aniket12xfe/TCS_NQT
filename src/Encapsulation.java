class Teacher{
    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Teacher teach = new Teacher();
        teach.setName("Vaishnavi");
        System.out.println(teach.getName());
        teach.setId(18);
        System.out.println(teach.getId());
    }
}
