package main;

import builder.Director;
import builder.Game;
import builder.GameBuilder;

public class GameDisplay {
    ConsoleWriter writer = new ConsoleWriter();
    GameList gameList = new GameList();
    Game amongUs = gameList.amongUs();
    Game backrooms = gameList.backrooms();
    Game overwatch = gameList.overwatch();
    public void displayGames(){
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("~~~~~~~~~~~~~~ Welcome to our shop ~~~~~~~~~~~~~~");
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("                   "+ amongUs.name +"                   $"+ amongUs.price);
        writer.write("                   "+ backrooms.name +"                  $"+ backrooms.price);
        writer.write("                   "+ overwatch.name +"                  $"+ overwatch.price);
        writer.write("                     Exit                        ");
    }
}
