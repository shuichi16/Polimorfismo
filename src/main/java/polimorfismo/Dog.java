package polimorfismo;

public class Dog extends Mammal {

    @Override
    public void movement() {
        System.out.println("Running Happy");
    }

    public void makeSound() {
        System.out.println("Au au au au au");
    }

    public void toReact(String words) {
        if (words == "Let's walk outside" || words == "Hi honey") {
            System.out.println("Wag the tail and Au au au au au");
        } else {
            System.out.println("He'll growl");
        }
    }

    public void toReact(int hour, int min) {
        if (hour < 12) {
            System.out.println("Wag the tail");
        } else if (hour >= 18) {
            System.out.println("Ignore");
        } else {
            System.out.println("Wag the tail and make noise");
        }
    }

    public void toReact(boolean tutor) {
        if (tutor) {
            System.out.println("Wag the tail");
        } else {
            System.out.println("He'll growl and make noise");
        }
    }

    public void toReact(int age, float weight) {
        if (age < 5) {
            if (weight < 10) {
                System.out.println("Wag the tail");
            } else {
                System.out.println("Make noise");
            }
        } else {
            if (weight < 10) {
                System.out.println("He'll growl");
            } else {
                System.out.println("Ignore");
            }
        }
    }
}
