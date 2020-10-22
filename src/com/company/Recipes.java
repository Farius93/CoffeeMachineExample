package com.company;

public enum Recipes {
    MILK_FOR_COFFEE(100, "mililitry"),
    MILK_FOR_CAPPUCINO(150, "mililitry"),
    MILK_FOR_LATTE(300, "mililitry");

    int amount;
    String jednostka;

    Recipes(int amount, String jednostka) {
        this.amount = amount;
        this.jednostka = jednostka;
    }

    public int getAmount() {
        return amount;
    }

    public String getJednostka() {
        return jednostka;
    }
}
