package com.company.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private String pizzaChainName;
    private String size;
    private List<String> toppings;

    public PizzaBuilder() {
        toppings = new ArrayList<>();
    }

    public PizzaBuilder setChainName(String pizzaChainName)
    {
        this.pizzaChainName = pizzaChainName;
        return this;
    }

    public PizzaBuilder smallSize() {
        size = "Small";
        return this;
    }

    public PizzaBuilder mediumSize() {
        size = "Medium";
        return this;
    }

    public PizzaBuilder largeSize() {
        size = "Large";
        return this;
    }

    public PizzaBuilder addPepperoni() {
        toppings.add("Pepperoni");
        return this;
    }

    public PizzaBuilder addSausage() {
        toppings.add("Sausage");
        return this;
    }

    public PizzaBuilder addMushrooms() {
        toppings.add("Mushrooms");
        return this;
    }

    public PizzaBuilder addBacon() {
        toppings.add("Bacon");
        return this;
    }

    public PizzaBuilder addOnions() {
        toppings.add("Onions");
        return this;
    }

    public PizzaBuilder addExtraCheese() {
        toppings.add("Extra Cheese");
        return this;
    }

    public PizzaBuilder addPeppers() {
        toppings.add("Peppers");
        return this;
    }

    public PizzaBuilder addChicken() {
        toppings.add("Chicken");
        return this;
    }

    public PizzaBuilder addOlives() {
        toppings.add("Olives");
        return this;
    }

    public PizzaBuilder addSpinach() {
        toppings.add("Spinach");
        return this;
    }

    public PizzaBuilder addTomatoAndBasil() {
        toppings.add("Tomato and Basil");
        return this;
    }

    public PizzaBuilder addBeef() {
        toppings.add("Beef");
        return this;
    }

    public PizzaBuilder addHam() {
        toppings.add("Ham");
        return this;
    }

    public PizzaBuilder addPesto() {
        toppings.add("Pesto");
        return this;
    }

    public PizzaBuilder addSpicyPork() {
        toppings.add("Spicy Pork");
        return this;
    }

    public PizzaBuilder addHamAndPineapple() {
        toppings.add("Ham and Pineapple");
        return this;
    }

    public Pizza build() {
        return new Pizza(pizzaChainName, size, toppings);
    }
}
