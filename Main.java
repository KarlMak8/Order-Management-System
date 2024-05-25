//@author Karl Mak

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean ordering = true;
        Scanner sc = new Scanner(System.in);
        StadiumKitchen kitchen = new StadiumKitchen();

        while (ordering) {
            System.out.println("What restaurant would you like to eat at? (Please select the number):");
            System.out.println("\t 1: Burgers");
            System.out.println("\t 2: Nachos");
            System.out.println("\t 3: Chicken");
            System.out.println("\t 4: Fries");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    kitchen.handleBurgerOrder(sc);
                    ordering = false;
                    break;
                case 2:
                    kitchen.handleNachosOrder(sc);
                    ordering = false;
                    break;
                case 3:
                    kitchen.handleChickenOrder(sc);
                    ordering = false;
                    break;
                case 4:
                    kitchen.handleFriesOrder(sc);
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        kitchen.printOrderDetails();
    }
}
