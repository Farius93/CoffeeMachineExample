package com.company;

public class CoffeeMachine implements Refillable {

    Storage storage = new Storage();


    @Override
    public void refill(int amount) {
        storage.addMilk(amount);
    }

    public int getMilkAmount() {
        return storage.getMilkAmount();
    }

    void makeCoffee(Storage storage) {
        storage.removeMilk(Recipes.MILK_FOR_COFFEE.getAmount());
        System.out.printf("Zrobilem kawkw z %s, jednostka: %s", Recipes.MILK_FOR_COFFEE.getAmount(), Recipes.MILK_FOR_COFFEE.getJednostka());
    }
}
