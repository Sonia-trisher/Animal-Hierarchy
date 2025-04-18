import model.Animal;
import model.Bird;
import model.Cat;
import model.Dog;

public class Main {
    public static void main(String[] args) {
         Animal genericAnimal = new Animal();
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        Bird myBird = new Bird();
        System.out.println("bird says :");
        myBird.makeSound();
        System.out.println("bird does :");
        myBird.fly();







    }
}
