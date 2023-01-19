package main;

import java.util.Scanner;


public class Order {
    ConsoleWriter writer = new ConsoleWriter();
    Billing billing = new Billing();
    Scanner sc = new Scanner(System.in);
    String again;
    int quantity;
    int total;
    int amongus = 9;
    int backrooms = 7;
    int overwatch = 40;
    public int order() {
        while (true) {
            writer.write("Which game would you like ");
            String ch = sc.next().toLowerCase();
            switch (ch) {
                case "amongus" -> {// Among Us
                    writer.write("You have Selected AmongUs");
                    writer.write("");
                    writer.write("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * amongus;
                }
                case "backrooms" -> {// Backrooms
                    writer.write("You have Selected Backrooms");
                    writer.write("");
                    writer.write("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * backrooms;
                }
                case "overwatch" -> {// Overwatch
                    writer.write("You have Selected Overwatch");
                    writer.write("");
                    writer.write("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * overwatch;
                }
                case "exit" ->// exit
                        System.exit(1);
                default -> {
                    writer.write("Invalid Choice");
                    order();
                }

            }
            writer.write("");
            writer.write("Do you wish to order anything else (Y/N) : ");
            again = sc.next();
            if(again.equalsIgnoreCase("Y"))
            {order();}
            else if(again.equalsIgnoreCase("N"))
            {billing.generateBill(total);}
            else{writer.write("Invalid Choice");}
        }
    }
}
