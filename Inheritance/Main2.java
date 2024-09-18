package Inheritance;

public class Main2 
{
    public static void main(String[] args) {
        Animal animal1 = new Dog(); 
        Animal animal2 = new Cat(); 

        animal1.makeSound(); // Output: Dog barks
        animal2.makeSound(); // Output: Cat meows
    }
}
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    // Method overriding
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass inheriting from Animal
class Cat extends Animal {
    // Method overriding
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}