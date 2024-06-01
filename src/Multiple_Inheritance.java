interface phone{
    void makeCall();
}

interface camera{
    void clickPhotos();
}

class SmartPhone implements phone, camera{
    @Override
    public void makeCall() {
        System.out.println("calling available...");
    }

    @Override
    public void clickPhotos() {
        System.out.println("Photos can take...");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
    SmartPhone sp = new SmartPhone();
    sp.makeCall();
    sp.clickPhotos();
    }
}
