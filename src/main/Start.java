package main;

import java.util.Scanner;

public class Start implements Scene{
    Scanner sc = new Scanner(System.in);
    ConsoleWriter writer = new ConsoleWriter();
    GameDisplay gameDisplay = new GameDisplay();
    Order order = new Order();
    String check;


    @Override
    public String getText() {
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("~~~~~~ You are standing in front of a shop ~~~~~~");
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("                      Enter                      ");
        writer.write("                      Leave                      ");
        writer.write("                      Info                       ");
        writer.write("                      ATM                        ");
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("                Enter Your Choice                ");
        writer.write("");
        check = sc.next();

        if(check.equalsIgnoreCase("Enter"))
        {
            gameDisplay.displayGames();
            order.order();
        }
        else if(check.equalsIgnoreCase("Leave"))
        {System.exit(1);}
        else if(check.equalsIgnoreCase("info"))
        {return "info";}
//        else if (check.equalsIgnoreCase("ATM"))
//        {atmMachine.ATMMachines();}
        else{writer.write("Invalid Choice");}
        return "start";
    }
}
