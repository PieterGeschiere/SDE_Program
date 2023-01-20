package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Order {
    ConsoleWriter writer = new ConsoleWriter();
    Billing billing = new Billing();
    ConsoleReader cr = new ConsoleReader();
    String again;
    int quantity;
    int total;
    int amongus = 9;
    int backrooms = 7;
    int overwatch = 40;
    public int order() {
        while (true) {
            writer.write("Which game would you like ");
            String ch = cr.readLine();
            writer.write(ch);
            switch (ch) {
                case "among us" -> {// Among Us
                    writer.write("You have Selected Among Us");
                    writer.write("");
                    writer.write("Enter the desired Quantity : ");
                    quantity = Integer.parseInt(cr.readLine());
                    total = total + quantity * amongus;
                }
                case "backrooms" -> {// Backrooms
                    writer.write("You have Selected Backrooms");
                    writer.write("");
                    writer.write("Enter the desired Quantity : ");
                    quantity = Integer.parseInt(cr.readLine());
                    total = total + quantity * backrooms;
                }
                case "overwatch" -> {// Overwatch
                    writer.write("You have Selected Overwatch");
                    writer.write("");
                    writer.write("Enter the desired Quantity : ");
                    quantity = Integer.parseInt(cr.readLine());
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
            again = cr.readLine();
            if(again.equalsIgnoreCase("Y"))
            {order();}
            else if(again.equalsIgnoreCase("N"))
            {billing.generateBill(total);}
            else{writer.write("Invalid Choice");}
        }
    }
}
