package polimorfismo;

public class Mammal extends Animal {

    private String skinColor;

    @Override
    public void movement() {
        System.out.println("Running");
    }

    @Override
    public void eat() {
        System.out.println("Drinking Milk");
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal Sound");
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}
