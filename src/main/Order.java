package main;

import builder.Game;

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
    GameList gameList = new GameList();
    Game amongUs = gameList.amongUs();
    Game backrooms = gameList.backrooms();
    Game overwatch = gameList.overwatch();
    public int order() {
        while (true) {
            writer.write("");
            writer.write("Which game would you like ");
            String ch = cr.readLine();
            switch (ch) {
                case "among us" -> {// Among Us
                    writer.write("You have Selected " + amongUs.name);
                    writer.write("");
                    writer.write("Enter the desired Quantity : ");
                    quantity = Integer.parseInt(cr.readLine());
                    total = total + quantity * amongUs.price;
                }
                case "backrooms" -> {// Backrooms
                    writer.write("You have Selected " +backrooms.name);
                    writer.write("");
                    writer.write("Enter the desired Quantity : ");
                    quantity = Integer.parseInt(cr.readLine());
                    total = total + quantity * backrooms.price;
                }
                case "overwatch" -> {// Overwatch
                    writer.write("You have Selected " + overwatch.name);
                    writer.write("");
                    writer.write("Enter the desired Quantity : ");
                    quantity = Integer.parseInt(cr.readLine());
                    total = total + quantity * overwatch.price;
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
