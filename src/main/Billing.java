package main;

import java.util.Scanner;

public class Billing {
    ConsoleWriter writer = new ConsoleWriter();
    String check;
    Scanner sc = new Scanner(System.in);
    GameDisplay gameDisplay = new GameDisplay();

    public void leaveStore() {
        writer.write("              Do you want leave the store Y/N               ");

        check = sc.next();
        if(check.equalsIgnoreCase("Y"))
        {System.exit(1);}
        else if(check.equalsIgnoreCase("N"))
        {
            writer.write("Enjoy staying here!");
            gameDisplay.displayGames();
        }
        else
        {
            writer.write("Invalid Choice");
            leaveStore();
        }
    }
    public void generateBill(int total)
    {

        writer.write("");
        writer.write("************************************************************");
        writer.write("***************** Thank you for ordering *******************");
        writer.write("                  Your Bill is : $" +total+"                 ");
        writer.write("************************************************************");
        writer.write("");
        leaveStore();

    }
}

