package polimorfismo;

public class Cacatua extends Bird {

    @Override
    public void movement() {
        System.out.println("Flying high");
    }

    public void makeSound() {
        System.out.println("Repeat people talking");
    }
}
