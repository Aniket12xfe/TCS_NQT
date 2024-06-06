import java.awt.*;

interface Star{
    public void Shine();
    default void Shape(){
        System.out.println("Star Shape.");
    }
    static void Color(){
        System.out.println("White Colour.");
    }
}

class BigStar implements Star{
    @Override
    public void Shine() {
        System.out.println("Star Shining.");
    }
}

public class InterFace_Methods {
    public static void main(String[] args) {
    BigStar bs = new BigStar();
    bs.Shine();
    bs.Shape();
    Star.Color();
    }
}
