package atm;

public class HasPin implements ATMState{
    ATMMachine atmMachine;

    public HasPin(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }

    @Override
    public String getText(){
        writer.write("request cash");
        writer.write("or");
        writer.write("exit");

        String check = cr.readLine();
        if(check.equalsIgnoreCase("request cash")){
            requestCash(2000);
        }
        else{writer.write("Invalid Choice");}
        {return "info";}
    }

    public void insertCard() {
        System.out.println("You already entered a card");
    }

    public void ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    public void requestCash(int cashToWithdraw) {
        if(cashToWithdraw > atmMachine.cashInMachine){
            System.out.println("You don't have that much cash available");
            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
            atmMachine.getText();
        } else {
            System.out.println(cashToWithdraw + " is provided by the machine");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);
            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
            if(atmMachine.cashInMachine <= 0){
                atmMachine.setATMState(atmMachine.getNoCashState());
            }
        }
    }

    public void insertPin(int pinEntered) {
        System.out.println("You already entered a PIN");
    }
}
