package org.example;

public class JapaneseGardenCreator implements AbstractGardenCreator {
    @Override
    public Tree createTree() {
        return new SakuraTree();
    }

    @Override
    public Flower createFlower() {
        return new SakuraFlower();
    }
}
