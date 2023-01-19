package main;

import java.util.Scanner;

public class Start {
    ConsoleWriter writer = new ConsoleWriter();
    GameDisplay gameDisplay = new GameDisplay();
    Order order = new Order();

    String ch;
    int quantity;
    static int total;
    String check;

    Scanner sc = new Scanner(System.in);

    public void startScreen(){

        writer.write("~~~~~~~~~~~~~~~~You walk past a shop~~~~~~~~~~~~~");
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("                 Enter                           ");
        writer.write("                 Leave                           ");
        writer.write("                 Settings                        ");
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("                 Enter Your Choice               ");
        writer.write("");
        check = sc.next();

        if(check.equalsIgnoreCase("Enter"))
        {
            gameDisplay.displayGames();
            order.order();
        }
        else if(check.equalsIgnoreCase("Leave"))
        {System.exit(1);}
        else if(check.equalsIgnoreCase("Settings"))
        {System.exit(1);}
        else{writer.write("Invalid Choice");}

    }
//    public void displayGames(){
//        writer.write("~~~~~~~~~~~~~~ Welcome to our shop ~~~~~~~~~~~~~~");
//        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//        writer.write("                AmongUs                        $9");
//        writer.write("                Backrooms                      $7");
//        writer.write("                Overwatch                     $40");
//        writer.write("                Exit                             ");
//    }

//    public void generateBill()
//    {
//        writer.write("");
//        writer.write("***************** Thank you for ordering *******************");
//        writer.write("****************Your Bill is : $" +total+ "*****************");
//    }


//    public void order() {
//        while (true) {
//            writer.write("Enter Your Choice ");
//            String ch = sc.next().toLowerCase();
//            switch (ch) {
//                case "amongus" -> {// Among Us
//                    writer.write("You have Selected AmongUs");
//                    writer.write("");
//                    writer.write("Enter the desired Quantity : ");
//                    quantity = sc.nextInt();
//                    total = total + quantity * amongus;
//                }
//                case "backrooms" -> {// Backrooms
//                    writer.write("You have Selected Backrooms");
//                    writer.write("");
//                    writer.write("Enter the desired Quantity : ");
//                    quantity = sc.nextInt();
//                    total = total + quantity * backrooms;
//                }
//                case "overwatch" -> {// Overwatch
//                    writer.write("You have Selected Overwatch");
//                    writer.write("");
//                    writer.write("Enter the desired Quantity : ");
//                    quantity = sc.nextInt();
//                    total = total + quantity * overwatch;
//                }
//                case "exit" ->// exit
//                        System.exit(1);
//                default -> {
//                    writer.write("Invalid Choice");
//                }
//
//            }
//            writer.write("");
//            writer.write("Do you wish to order anything else (Y/N) : ");
//            again = sc.next();
//            if(again.equalsIgnoreCase("Y"))
//            {order();}
//            else if(again.equalsIgnoreCase("N"))
//            {generateBill();
//                System.exit(1);}
//            else{writer.write("Invalid Choice");}
//        }
//    }
}
