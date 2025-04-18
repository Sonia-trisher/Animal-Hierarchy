package model;

public class Bird  extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }
    public void fly() {
        System.out.println("flying");
    }
}
