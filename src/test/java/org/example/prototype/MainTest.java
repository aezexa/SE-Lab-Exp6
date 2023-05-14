package org.example.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Sheep sheep = new Sheep();
        Sheep clonedSheep = (Sheep) sheep.clone();
        assertNotSame(sheep, clonedSheep);
        assertEquals(sheep.describe(), clonedSheep.describe());
        sheep.changeColor("Black");
        assertNotEquals(sheep.describe(), clonedSheep.describe());
        Dog dog = new Dog();
        Dog clonedDog = (Dog) dog.clone();
        assertNotSame(dog, clonedDog);
        assertEquals(dog.describe(), clonedDog.describe());
        dog.changeColor("Black");
        assertNotEquals(dog.describe(), clonedDog.describe());
    }
}