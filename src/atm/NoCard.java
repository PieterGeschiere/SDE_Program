package atm;

public class NoCard implements ATMState {
    ATMMachine atmMachine;

    public NoCard(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }

    @Override
    public String getText(){
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~ATM~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("                Welcome to the ATM               ");
        writer.write("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        writer.write("                     type in                     ");
        writer.write("                   Insert card                   ");
        writer.write("                       or                        ");
        writer.write("                      exit                       ");

        String check = cr.readLine();
        if(check.equalsIgnoreCase("insert card")){
            insertCard();
        }
        else{writer.write("Invalid Choice");}
        {return "info";}
    }

    public void insertCard() {
//        writer.write("Please enter your pin");
        atmMachine.setATMState(atmMachine.getYesCardState());
        atmMachine.getText();
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
