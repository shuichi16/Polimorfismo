package polimorfismo;

public class Bird extends Animal {

    private String featherColor;

    @Override
    public void movement() {
        System.out.println("Flying");

    }

    @Override
    public void eat() {
        System.out.println("Eating some fruits");

    }

    @Override
    public void makeSound() {
        System.out.println("Bird sounds");

    }

    public void buildingNest() {
        System.out.println("Building Nest");
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
}
