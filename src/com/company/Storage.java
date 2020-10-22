package com.company;

public class Storage {
    private int milkAmount;

    public int getMilkAmount() {
        return milkAmount;
    }

    public void removeMilk(int milkAmount) {
        this.milkAmount = this.milkAmount - milkAmount;
    }

    public void addMilk(int milkAmount) {
        this.milkAmount = this.milkAmount + milkAmount;
    }
}
