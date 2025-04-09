package Bai4_6;

public class Main {
    public static void main(String[] args) {
        // Testing Animal class
        System.out.println("=== Testing Animal ===");
        Animal animal = new Animal("Generic Animal");
        System.out.println(animal);

        // Testing Mammal class
        System.out.println("\n=== Testing Mammal ===");
        Mammal mammal = new Mammal("Generic Mammal");
        System.out.println(mammal);

        // Testing Cat class
        System.out.println("\n=== Testing Cat ===");
        Cat cat = new Cat("Whiskers");
        System.out.println(cat);
        cat.greets(); // Should print "Meow"

        // Testing Dog class
        System.out.println("\n=== Testing Dog ===");
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Max");
        System.out.println(dog1);
        dog1.greets();          // Should print "Woof"
        dog1.greets(dog2);      // Should print "Woooof" when greeting another dog

        // Polymorphism in action
        System.out.println("\n=== Testing Polymorphism ===");
        Animal animalCat = new Cat("Kitty");
        Animal animalDog = new Dog("Rocky");
        System.out.println(animalCat);
        System.out.println(animalDog);

        // Casting to call subclass-specific methods
        System.out.println("\n=== Calling Subclass Methods via Casting ===");
        if (animalCat instanceof Cat) {
            ((Cat) animalCat).greets();  // Prints "Meow"
        }
        if (animalDog instanceof Dog) {
            ((Dog) animalDog).greets();  // Prints "Woof"
        }
    }
}

