package org.example.prototype;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Prototype interface
interface Animal extends Cloneable {
    String describe();
    void changeColor(String color);
    String makeSound();
    Animal clone();
}

// Concrete prototype classes
class Sheep implements Animal {
    private String color = "White";
    public Sheep() {
        System.out.println("Sheep is made");
    }


    @Override
    public String describe() {
        return "Sheep is " + this.color;
    }

    @Override
    public void changeColor(String color) {
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "Sheep says baa";
    }

    @Override
    public Animal clone() {
        try {
            return (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

class Dog implements Animal {
    private String color = "Brown";
    public Dog() {
        System.out.println("Dog is made");
    }

    @Override
    public String describe() {
        return "Dog is " + this.color;
    }

    @Override
    public void changeColor(String color) {
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "Dog says woof";
    }

    @Override
    public Animal clone() {
        try {
            return (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}

// Prototype manager
class AnimalCache {
    private static final Map<String, Animal> animalCache = new HashMap<>();

    public static Animal getAnimal(String type) {
        Animal cachedAnimal = animalCache.get(type);
        return cachedAnimal.clone();
    }

    public static void loadCache() {
        Sheep sheep = new Sheep();
        Dog dog = new Dog();

        animalCache.put("Sheep", sheep);
        animalCache.put("Dog", dog);
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        AnimalCache.loadCache();

        ArrayList<Animal> myAnimals = new ArrayList<>();

        Animal clonedSheep = AnimalCache.getAnimal("Sheep");
        myAnimals.add(clonedSheep);

        Animal clonedDog = AnimalCache.getAnimal("Dog");
        myAnimals.add(clonedDog);

        Animal clonedSheep2 = clonedSheep.clone();
        clonedSheep.changeColor("Black");
        myAnimals.add(clonedSheep2);

        for (Animal animal : myAnimals) {
            System.out.println(animal.describe() + " and " + animal.makeSound());
        }

        // We visit another farm which has the same animals.
        ArrayList<Animal> clonedAnimals = new ArrayList<>();
        for (Animal animal: myAnimals) {
            clonedAnimals.add(animal.clone());
        }
        // We easily cloned the previous array with using the prototype pattern.
    }
}