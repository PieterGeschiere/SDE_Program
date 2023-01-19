package atm;

public class HasCard implements ATMState {
    ATMMachine atmMachine;

    public HasCard(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }

    public void insertCard() {
        writer.write("You can only insert one card at a time");
    }

    public void ejectCard() {
        writer.write("Your card is ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    public void requestCash(int cashToWithdraw) {
        writer.write("You have not entered your PIN");
    }

    public void insertPin(int pinEntered) {
        if(pinEntered == 1234){
            writer.write("You entered the correct PIN");
            atmMachine.correctPinEntered = true;
            atmMachine.setATMState(atmMachine.getHasPin());
        } else {
            writer.write("You entered the wrong PIN");
            atmMachine.correctPinEntered = false;
            writer.write("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }
    }
}
