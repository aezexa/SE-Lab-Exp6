package org.example.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GardenCreatorFactoryTest {

    @Test
    void createGardenCreator() {
        assertAll(() -> assertTrue(GardenCreatorFactory.createGardenCreator("Japanese") instanceof JapaneseGardenCreator),
                () -> assertTrue(GardenCreatorFactory.createGardenCreator("Iranian") instanceof IranianGardenCreator),
                () -> assertNull(GardenCreatorFactory.createGardenCreator("German")));

    }
}