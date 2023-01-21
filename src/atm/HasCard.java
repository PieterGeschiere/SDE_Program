package atm;

public class HasCard implements ATMState {
    ATMMachine atmMachine;

    public HasCard(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }

    @Override
    public String getText(){
        writer.write("enter pin");
        writer.write("or");
        writer.write("exit");

        int checkInt = sc.nextInt();
        if(checkInt == 1234){
            insertPin(1234);
        }
        else{writer.write("Invalid Choice");}
        {return "info";}
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
           if(pinEntered == 1234) {
               writer.write("You entered the correct PIN");
               atmMachine.correctPinEntered = true;
               atmMachine.setATMState(atmMachine.getHasPin());
               atmMachine.getText();
           } else {
               System.out.println("you entered the wrong pin");
               atmMachine.correctPinEntered = false;
               System.out.println("your card is ejected");
               atmMachine.setATMState(atmMachine.getNoCardState());
           }
    }
}
