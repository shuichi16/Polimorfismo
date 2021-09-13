package polimorfismo;

public class Fox extends Mammal {

    @Override
    public void movement(){
        System.out.println("Walking Skipping");
    }

    public void toDig(){
        System.out.println("To dig burrow");
    }

}
