package org.example;

public class IranianGardenCreator implements AbstractGardenCreator {
    @Override
    public Tree createTree() {
        return new GajTree();
    }

    @Override
    public Flower createFlower() {
        return new SoosanFlower();
    }
}
