package view;

import Controller.OrderController;

import java.util.Scanner;

public class viewMenu {
    private OrderController orderController;
    private Scanner scanner;

    public  void viewMenu(){
        while (true) {
            System.out.println("----------menu_---------");
            System.out.println("1. Add new order");
            System.out.println("2. Search order by id");
            System.out.println("3. Revenue by time");
            System.out.println("4. Exist");
            System.out.println("________________________");
            System.out.println("Please choice :");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    orderController.add();
                    break;
                case 2:
                    orderController.search();
                    break;
                case 3:
                case 4:
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Invalid choice. Please choice between 1-4.");
                    break;
            }
            if (choice == 0 );
            break;
        }
        scanner.nextLine();
    }
}
