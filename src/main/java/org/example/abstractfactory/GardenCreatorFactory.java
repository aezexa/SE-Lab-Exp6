package org.example.abstractfactory;

public class GardenCreatorFactory {
    public static AbstractGardenCreator createGardenCreator(String gardenType) {
        if (gardenType.equalsIgnoreCase("Japanese")) {
            return new JapaneseGardenCreator();
        } else if (gardenType.equalsIgnoreCase("Iranian")) {
            return new IranianGardenCreator();
        }
    return null;
    }
}
