package polimorfismo;

public abstract class Animal {

    protected float weight;
    protected int age;
    protected int member;

    //animal's methods
    public abstract void movement();
    public abstract void eat();
    public abstract void makeSound();

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMember() {
        return member;
    }

    public void setMember(int member) {
        this.member = member;
    }

}
