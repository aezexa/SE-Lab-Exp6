package org.example.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        PizzaDirector pizzaDirector = new PizzaDirector();
        PizzaBuilder margheritaPizzaBuilder = new MargheritaPizzaBuilder();
        PizzaBuilder pepperoniPizzaBuilder = new PepperoniPizzaBuilder();
        pizzaDirector.setPizzaBuilder(margheritaPizzaBuilder);
        pizzaDirector.constructPizza();
        Pizza margheritaPizza = pizzaDirector.getPizza();
        assertEquals("Pizza with Thin crust dough, Marinara sauce sauce, and Mozzarella cheese topping.", margheritaPizza.getDescription());
        pizzaDirector.setPizzaBuilder(pepperoniPizzaBuilder);
        pizzaDirector.constructPizza();
        Pizza pepperoniPizza = pizzaDirector.getPizza();
        assertEquals("Pizza with Thick crust dough, Tomato sauce sauce, and Pepperoni and olives topping.", pepperoniPizza.getDescription());
    }
}