package org.example.abstractfactory;

public class GajTree implements Tree {
    @Override
    public void grow() {
        System.out.println("Gaj is growing.");
    }
}
