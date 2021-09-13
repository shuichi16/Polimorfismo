package polimorfismo;

public class Reptile extends Animal{

    private String scaleColor;

    @Override
    public void movement() {
        System.out.println("Creeping");
    }

    @Override
    public void eat() {
        System.out.println("Eating Vegetables");
    }

    @Override
    public void makeSound() {
        System.out.println("Reptile sound");
    }

    public void hunting(){
        System.out.println("Hunting Something");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
}
