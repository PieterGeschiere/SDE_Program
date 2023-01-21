package main;

import alleyway.EnterAlleyway;
import atm.ATMMachine;

import java.util.Scanner;

public class Start implements Scene{
//    ATMMachine atmMachine = new ATMMachine();

    Scanner sc = new Scanner(System.in);
    ConsoleWriter writer = new ConsoleWriter();
    ConsoleReader cr = new ConsoleReader();
    GameDisplay gameDisplay = new GameDisplay();
    EnterAlleyway enterAlleyway = new EnterAlleyway();
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
        writer.write("                    Alleyway                     ");
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
        else if (check.equalsIgnoreCase("ATM"))
        {ATMMachine.getInstance().getText();}
        else if (check.equalsIgnoreCase("Alleyway"))
        {enterAlleyway.EnterAlleyway();}
        else{writer.write("Invalid Choice");}
        return "start";
    }
}
