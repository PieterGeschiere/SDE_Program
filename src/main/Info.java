package main;

import java.util.Scanner;
public class Info implements Scene {
    String check;
    Scanner sc = new Scanner(System.in);
    ConsoleWriter writer = new ConsoleWriter();
    GameDisplay gameDisplay = new GameDisplay();
    Order order = new Order();

    @Override
    public String getText() {
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~Info~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("       This is a store where you buy games       ");
        writer.write("                   It is called:                 ");
        writer.write("                  ###CaveBlade###                ");
        writer.write("      The sign says it is run by Pieter & Jay    ");
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("");
        writer.write("           Do you want to go inside Y/N          ");

        check = sc.next();
        if(check.equalsIgnoreCase("Y"))
        {
            gameDisplay.displayGames();
            order.order();
        }
        else if(check.equalsIgnoreCase("N"))
        {return "start";}
        else{writer.write("Invalid Choice");}
        return "info";
    }
}
