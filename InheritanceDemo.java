// Parent Class
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }
}

// Child Class 1
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Pass name to Parent constructor
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof! Woof!");
    }
}

// Child Class 2
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow! Meow!");
    }
}

// Main Executable Class
public class InheritanceDemo {
    public static void main(String[] args) {
        // Polymorphism: Parent reference pointing to Child objects
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        System.out.println("--- Polymorphism in Action ---");
        myDog.makeSound(); // Calls Dog's overridden method
        myCat.makeSound(); // Calls Cat's overridden method
    }
}