package main;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        GameOrder fo = new GameOrder();

        fo.displayGames();

        fo.order();
        //lets compile and test

    }
}