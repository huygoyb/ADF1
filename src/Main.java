import Controller.OrderController;

import java.awt.*;
import java.util.Scanner;

public class Main {
    private OrderController orderController;
    private Scanner scanner;
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        OrderController orderController = new OrderController();
        int choice = 0;
        
         do{
            System.out.println("----------menu_---------");
            System.out.println("1. Add new order");
            System.out.println("2. Search order by id");
            System.out.println("3. Revenue by time");
            System.out.println("4. Exist");
            System.out.println("________________________");
            System.out.println("Please choice :");
            
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
            
        }while (choice !=0);
    }
}

