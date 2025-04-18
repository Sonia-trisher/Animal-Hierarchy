import model.Animal;
import model.Bird;
import model.Cat;
import model.Dog;

public class Main {
    public static void main(String[] args) {
        Bird myBird = new Bird("Tweety");
        System.out.println("bird says :");
        myBird.makeSound();
        System.out.println("bird does :");
        myBird.fly();


        Dog myDog = new Dog("Rex");
        Cat myCat = new Cat("Whiskers");
        System.out.println("\nOther animals speaking:");
        myDog.makeSound();
        myCat.makeSound();




//        Polymorphic behavior

        System.out.println("\nPolymorphism in action:");
        Animal[] animals = {myCat, myDog, myBird};

        for (Animal animal : animals) {
            animal.makeSound();
//


        }

    }
}
