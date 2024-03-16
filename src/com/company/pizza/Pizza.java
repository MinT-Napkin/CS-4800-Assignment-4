package com.company.pizza;

import java.util.List;

public class Pizza
{
        private final String pizzaChainName;
        private final String size;
        private final List<String> toppings;

        public Pizza(String pizzaChainName, String size, List<String> toppings)
        {
                this.pizzaChainName = pizzaChainName;
                this.size = size;
                this.toppings = toppings;
        }

        public void eat()
        {
                System.out.println("Pizza eaten!");
                System.out.println("PizzaChain: " + pizzaChainName);
                System.out.println("Size: " + size);
                System.out.println("Toppings: " + String.join(", ", toppings) + "\n");
        }
}