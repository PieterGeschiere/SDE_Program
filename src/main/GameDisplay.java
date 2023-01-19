package main;

public class GameDisplay {
    ConsoleWriter writer = new ConsoleWriter();
    public void displayGames(){
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("~~~~~~~~~~~~~~ Welcome to our shop ~~~~~~~~~~~~~~");
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("                    AmongUs                    $9");
        writer.write("                   Backrooms                   $7");
        writer.write("                   Overwatch                  $40");
        writer.write("                     Exit                        ");
    }
}
