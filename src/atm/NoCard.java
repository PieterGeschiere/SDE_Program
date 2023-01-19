package atm;

public class NoCard implements ATMState {
    ATMMachine atmMachine;

    public NoCard(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }

    public void insertCard() {
        writer.write("Please enter your pin");
        atmMachine.setATMState(atmMachine.getYesCardState());
    }

    public void ejectCard() {
        writer.write("You didn't enter a card");
    }

    public void requestCash(int cashToWithdraw) {
        writer.write("You have not entered your card");
    }

    public void insertPin(int pinEntered) {
        writer.write("You have not entered your card");
    }
}
