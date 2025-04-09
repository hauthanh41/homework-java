package  Bai6_6;
public class Main {
    public static void main(String[] args) {
        // Creating instances of Cat, Dog, and BigDog
        Cat cat = new Cat("Kitty");
        Dog dog = new Dog("Buddy");
        Dog dog2 = new Dog("Max");
        BigDog bigDog = new BigDog("Rex");
        BigDog bigDog2 = new BigDog("Rocky");

        // Testing greets() methods
        System.out.println("Cat greets:");
        cat.greets(); // Moew

        System.out.println("\nDog greets:");
        dog.greets(); // Woof

        System.out.println("\nDog greets another Dog:");
        dog.greets(dog2); // Woooof

        System.out.println("\nBigDog greets:");
        bigDog.greets(); // Wooow

        System.out.println("\nBigDog greets another Dog:");
        bigDog.greets(dog); // Woooooow

        System.out.println("\nBigDog greets another BigDog:");
        bigDog.greets(bigDog2); // Wooooooooow

        System.out.println("\nPolymorphism Test:");
        Animal animalDog = new BigDog("Bruno");
        animalDog.greets(); // Wooow (calls BigDog's greets() due to runtime polymorphism)
    }
}
