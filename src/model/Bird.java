package model;

public class Bird  extends Animal{
    public Bird(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp!");
    }
    public void fly() {
        System.out.println(name + " does: flying");
    }
}
