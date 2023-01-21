package main;

import builder.Director;
import builder.Game;
import builder.GameBuilder;

public class GameList {
    GameBuilder builder = new GameBuilder();
    Director director = new Director();

    public Game amongUs(){
        director.buildAmongUs(builder);
        Game game = builder.build();
        return game;
    }

    public Game backrooms(){
        director.buildBackrooms(builder);
        Game game1 = builder.build();
        return game1;
    }

    public Game overwatch(){
        director.buildOverwatch(builder);
        Game game2 = builder.build();
        return game2;
    }
}
