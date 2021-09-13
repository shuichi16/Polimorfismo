package polimorfismo;

public class Aligator extends Reptile {

    @Override
    public void movement() {
        System.out.println("Creeping and Swimming");
    }

    public void hunting() {
        System.out.println("Nocturnal Predator");
    }
}
