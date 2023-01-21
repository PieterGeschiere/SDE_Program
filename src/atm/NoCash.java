package atm;

public class NoCash implements ATMState {
    ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMachine){
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

        String check = sc.next();
        if(check.equalsIgnoreCase("insert card")){
            insertCard();
        }
        else{writer.write("Invalid Choice");}
        {return "info";}
    }

    public void insertCard() {
        System.out.println("We don't have any money");
        System.out.println("Your card is ejected");
    }

    public void ejectCard() {
        System.out.println("We don't have any money");
        System.out.println("There is no card to eject");
    }

    public void requestCash(int cashToWithdraw) {
        System.out.println("We don't have any money");
    }

    public void insertPin(int pinEntered) {
        System.out.println("We don't have any money");
    }
}
