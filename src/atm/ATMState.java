package atm;

import main.ConsoleWriter;

public interface ATMState {
    ConsoleWriter writer = new ConsoleWriter();
    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);
}
