package com.company.pizza;

public class Driver {
    public static void main(String[] args) {

        System.out.println("\nTask 1)\n");
        Pizza pizza1 = new PizzaBuilder()
                .setChainName("Pizza Hut")
                .smallSize()
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .build();

        Pizza pizza2 = new PizzaBuilder()
                .setChainName("Pizza Hut")
                .mediumSize()
                .addPepperoni()
                .addSausage()
                .addPesto()
                .addBacon()
                .addOnions()
                .addExtraCheese()
                .build();

        Pizza pizza3 = new PizzaBuilder()
                .setChainName("Pizza Hut")
                .largeSize()
                .addPeppers()
                .addChicken()
                .addOlives()
                .addSpinach()
                .addTomatoAndBasil()
                .addBeef()
                .addPesto()
                .addSpicyPork()
                .addHamAndPineapple()
                .build();

        pizza1.eat();
        pizza2.eat();
        pizza3.eat();


        System.out.println("\n\nTask 2)\n");

        Pizza pizza4 = new PizzaBuilder()
                .setChainName("Pizza Hut")
                .largeSize()
                .addTomatoAndBasil()
                .addSpicyPork()
                .addPesto()
                .build();

        Pizza pizza5 = new PizzaBuilder()
                .setChainName("Pizza Hut")
                .smallSize()
                .addPepperoni()
                .addHamAndPineapple()
                .build();

        Pizza pizza6 = new PizzaBuilder()
                .setChainName("Little Caesars")
                .mediumSize()
                .addPepperoni()
                .addMushrooms()
                .addExtraCheese()
                .addOlives()
                .addSpinach()
                .addTomatoAndBasil()
                .addBeef()
                .addPesto()
                .build();

        Pizza pizza7 = new PizzaBuilder()
                .setChainName("Little Caesars")
                .smallSize()
                .addPepperoni()
                .addMushrooms()
                .addExtraCheese()
                .addOnions()
                .addChicken()
                .addHam()
                .build();

        Pizza pizza8 = new PizzaBuilder()
                .setChainName("Dominos")
                .smallSize()
                .addPepperoni()
                .build();

        Pizza pizza9 = new PizzaBuilder()
                .setChainName("Dominos")
                .largeSize()
                .addSausage()
                .addOlives()
                .addMushrooms()
                .build();

        pizza4.eat();
        pizza5.eat();
        pizza6.eat();
        pizza7.eat();
        pizza8.eat();
        pizza9.eat();
    }
}
