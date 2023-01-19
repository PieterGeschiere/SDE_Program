package main;

import java.util.Scanner;

public class Start {
    Scanner sc = new Scanner(System.in);
    ConsoleWriter writer = new ConsoleWriter();
    GameDisplay gameDisplay = new GameDisplay();
    Order order = new Order();
    Info info = new Info();
    String check;


    public void startScreen(){
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
        {info.info();}
//        else if (check.equalsIgnoreCase("ATM"))
//        {atmMachine.ATMMachines();}
        else{writer.write("Invalid Choice");}

    }

}
