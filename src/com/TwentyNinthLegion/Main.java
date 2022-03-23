package com.TwentyNinthLegion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

     class coffeeMachine {
        static int water = 400;
        static int milk = 540;
        static int coffeeBeans = 120;
        static int cups = 9;
        static int money = 550;

        static int esWater = 250;
        static int esCoffeeBeans = 16;
        static int esMoney = 4;
        static int laWater = 350;
        static int laMilk = 75;
        static int laCoffeeBeans = 20;
        static int laMoney = 7;
        static int caWater = 200;
        static int caMilk = 100;
        static int caCoffeeBeans = 12;
        static int caMoney = 6;

        static int buyChoice = 0;
        static int fillWater = 0;
        static int fillMilk = 0;
        static int fillCoffeeBeans = 0;
        static int fillCups = 0;

        static String choice;

        static boolean yeahThatsTrue = true;

        public static void methodMan() {
            Scanner scanner = new Scanner(System.in);

            while (yeahThatsTrue) {

                System.out.println("Write action (buy, fill, take, remaining, exit):");
                choice = scanner.next();

                switch (choice) {
                    case "buy":
                        try {

                            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                            buyChoice = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            scanner.nextLine();
                            break;
                        }
                        break;
                    case "fill":
                        try {
                            System.out.println("Write how many ml of water you want to add:");
                            fillWater = scanner.nextInt();
                            System.out.println("Write how many ml of milk you want to add:");
                            fillMilk = scanner.nextInt();
                            System.out.println("Write how many grams of coffee beans you want to add:");
                            fillCoffeeBeans = scanner.nextInt();
                            System.out.println("Write how many disposable cups of coffee you want to add:");
                            fillCups = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            scanner.nextLine();
                            break;
                        }
                        water += fillWater;
                        milk += fillMilk;
                        coffeeBeans += fillCoffeeBeans;
                        cups += fillCups;
                        break;
                    case "take":
                        System.out.printf("I gave you $%d%n", money);
                        money = 0;
                        break;
                    case "remaining":
                        System.out.printf("The coffee machine has:%n%d ml of water%n%d ml of milk%n%d g of coffee beans%n%d disposable cups%n$%d of money%n", water, milk, coffeeBeans, cups, money);
                        break;
                    case "exit":
                        yeahThatsTrue = false;
                        break;
                    default:
                        break;
                }

                switch (buyChoice) {
                    case 1:
                        if (esWater > water) {
                            System.out.println("Sorry not enough water!");
                        } else if (esCoffeeBeans > coffeeBeans) {
                            System.out.println("Sorry not enough coffee beans!");
                        } else if (cups == 0) {
                            System.out.println("Sorry not enough cups!");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= esWater;
                            coffeeBeans -= esCoffeeBeans;
                            money += esMoney;
                            cups--;
                        }
                        break;
                    case 2:
                        if (laWater > water) {
                            System.out.println("Sorry not enough water!");
                        } else if (laMilk > milk) {
                            System.out.println("Sorry not enough milk!");
                        } else if (laCoffeeBeans > coffeeBeans) {
                            System.out.println("Sorry not enough coffee beans!");
                        } else if (cups == 0) {
                            System.out.println("Sorry not enough cups!");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= laWater;
                            milk -= laMilk;
                            coffeeBeans -= laCoffeeBeans;
                            money += laMoney;
                            cups--;
                        }
                        break;
                    case 3:
                        if (caWater > water) {
                            System.out.println("Sorry not enough water!");
                        } else if (caMilk > milk) {
                            System.out.println("Sorry not enough milk!");
                        } else if (caCoffeeBeans > coffeeBeans) {
                            System.out.println("Sorry not enough coffee beans!");
                        } else if (cups == 0) {
                            System.out.println("Sorry not enough cups!");
                        } else {
                            System.out.println("I have enough resources, making you a coffee!");
                            water -= caWater;
                            milk -= caMilk;
                            coffeeBeans -= caCoffeeBeans;
                            money += caMoney;
                            cups--;
                        }
                    default:
                        break;
                }
                buyChoice = 0;
            }

        }

    }

    public static void main(String[] args) {
        coffeeMachine.methodMan();
    }
}


