package main;

import java.util.Scanner;

public class GameOrder {
    ConsoleWriter writer = new ConsoleWriter();

    int amongus = 9;
    int backrooms = 7;
    int overwatch = 40;
    int ch;
    int quantity;
    static int total;
    String again;

    Scanner sc = new Scanner(System.in);

    public void displayGames(){
        writer.write("~~~~~~~~~~~~~~ Welcome to our shop ~~~~~~~~~~~~~~");
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("          1. Among us                          $9");
        writer.write("          2. Backrooms                         $7");
        writer.write("          3. Overwatch                        $40");
        writer.write("          4. Exit                                ");
    }

    public void generateBill()
    {
        writer.write("");
        writer.write("***************** Thank you for ordering ******************");
        writer.write("****************Your Bill is : " +total+"*****************");
    }


    public void order() {
        while (true) {
            writer.write("Enter Your Choice ");
            ch = sc.nextInt();
            switch (ch) {
                case 1 -> {// Among Us
                    writer.write("You have Selected Among us");
                    writer.write("");
                    writer.write("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * amongus;
                }
                case 2 -> {// Backrooms
                    writer.write("You have Selected Backrooms");
                    writer.write("");
                    writer.write("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * backrooms;
                }
                case 3 -> {// Overwatch
                    writer.write("You have Selected Overwatch");
                    writer.write("");
                    writer.write("Enter the desired Quantity : ");
                    quantity = sc.nextInt();
                    total = total + quantity * overwatch;
                }
                case 4 ->// exit
                        System.exit(1);
                default -> {
                }

            }
            writer.write("");
            writer.write("Do you wish to order anything else (Y/N) : ");
            again = sc.next();
            if(again.equalsIgnoreCase("Y"))
            {order();}
            else if(again.equalsIgnoreCase("N"))
            {generateBill();
                System.exit(1);}
            else{System.out.println("Invalid Choice");}
        }
    }
}
