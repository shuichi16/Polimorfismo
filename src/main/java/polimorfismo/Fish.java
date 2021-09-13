package polimorfismo;

public class Fish extends Animal{

    private String scaleColor;


    @Override
    public void movement() {
        System.out.println("Swimming");
    }

    @Override
    public void eat() {
        System.out.println("Eating some plankton");
    }

    @Override
    public void makeSound() {
        System.out.println("Fish Sound");
    }


    public void makeBubble(){
        System.out.println("Making Bubble");
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }
}
