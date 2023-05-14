package org.example;

public class Main {
    public static void main(String[] args) {
        AbstractGardenCreator japaneseGardenCreator = GardenCreatorFactory.createGardenCreator("Japanese");
        assert japaneseGardenCreator != null;
        Tree japaneseTree = japaneseGardenCreator.createTree();
        Flower japaneseFlower = japaneseGardenCreator.createFlower();
        japaneseTree.grow();
        japaneseFlower.bloom();

        AbstractGardenCreator iranianGardenCreator = GardenCreatorFactory.createGardenCreator("Iranian");
        assert iranianGardenCreator != null;
        Tree iranianTree = iranianGardenCreator.createTree();
        Flower iranianFlower = iranianGardenCreator.createFlower();
        iranianTree.grow();
        iranianFlower.bloom();

    }
}