package model;

public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("generic animal sound");
    }
    public void eat() {
        System.out.println("The  animal is eating");
    }

    public void sleep() {
        System.out.println("The  animal is sleeping");
    }
    public void name() {
        System.out.println("I am eating");
    }

}
