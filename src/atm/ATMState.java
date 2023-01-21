package atm;

import main.ConsoleReader;
import main.ConsoleWriter;
import main.Scene;

import java.util.Scanner;

public interface ATMState extends Scene{
    ConsoleWriter writer = new ConsoleWriter();
    Scanner sc = new Scanner(System.in);
    ConsoleReader cr = new ConsoleReader();
    String getText();
    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);
}
