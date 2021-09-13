package polimorfismo;

public class Turtle extends Reptile {

    @Override
    public void movement() {
        System.out.println("Walking Slowly");
    }

    public void hide() {
        System.out.println("To hide inside the hull");
    }
}
