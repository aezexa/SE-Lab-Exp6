package org.example.builder;

// Product class
class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getDescription() {
        return "Pizza with " + dough + " dough, " + sauce + " sauce, and " + topping + " topping.";
    }
}

// Abstract builder class
abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizza() {
        pizza = new Pizza();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();
}

// Concrete builder classes
class MargheritaPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("Thin crust");
    }

    public void buildSauce() {
        pizza.setSauce("Marinara sauce");
    }

    public void buildTopping() {
        pizza.setTopping("Mozzarella cheese");
    }
}

class PepperoniPizzaBuilder extends PizzaBuilder {
    public void buildDough() {
        pizza.setDough("Thick crust");
    }

    public void buildSauce() {
        pizza.setSauce("Tomato sauce");
    }

    public void buildTopping() {
        pizza.setTopping("Pepperoni and olives");
    }
}

// Director class
class PizzaDirector {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder builder) {
        pizzaBuilder = builder;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}

// Client
public class Main {
    public static void main(String[] args) {
        PizzaDirector pizzaDirector = new PizzaDirector();

        PizzaBuilder margheritaPizzaBuilder = new MargheritaPizzaBuilder();
        pizzaDirector.setPizzaBuilder(margheritaPizzaBuilder);
        pizzaDirector.constructPizza();
        Pizza margheritaPizza = pizzaDirector.getPizza();
        System.out.println("Margherita Pizza: " + margheritaPizza.getDescription());

        PizzaBuilder pepperoniPizzaBuilder = new PepperoniPizzaBuilder();
        pizzaDirector.setPizzaBuilder(pepperoniPizzaBuilder);
        pizzaDirector.constructPizza();
        Pizza pepperoniPizza = pizzaDirector.getPizza();
        System.out.println("Pepperoni Pizza: " + pepperoniPizza.getDescription());
    }
}
