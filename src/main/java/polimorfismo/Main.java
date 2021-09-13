package polimorfismo;

public class Main {

    public static void main(String[] args) {

        Mammal m = new Mammal();
        Reptile r = new Reptile();
        Bird b = new Bird();
        Fox f = new Fox();
        Dog d = new Dog();
        Cacatua c = new Cacatua();
        Aligator j = new Aligator();
        Turtle t = new Turtle();
        MoonFish mf = new MoonFish();

        d.toReact("Hi honey");
        d.toReact(11,45);
        
        m.setWeight(35.3f);
        m.setSkinColor("Black");

        f.movement();
        f.toDig();
        f.makeSound();
        j.hunting();

        }

    }
