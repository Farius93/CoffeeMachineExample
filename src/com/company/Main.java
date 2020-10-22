package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();

        if ("refill".equals(action)) {
            String refillAmount = scanner.nextLine();
            coffeeMachine.refill(Integer.parseInt(refillAmount));

            System.out.printf("Mamy tyle mleka: %s", coffeeMachine.getMilkAmount());
        }
    }
}
