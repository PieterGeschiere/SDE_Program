package alleyway;

import main.ConsoleWriter;
public class CheckFunds {
    ConsoleWriter writer = new ConsoleWriter();
    private double cashInPockets = 20.00;
    public double getCashInPockets() {return cashInPockets;}
    public void decreaseCashInPockets(double cashWithdrawn) {cashInPockets -= cashWithdrawn;}
    public boolean haveEnoughCash(double cashToWithdrawal) {
        if(cashToWithdrawal > getCashInPockets()) {
            writer.write("You dont have enough cash");
            writer.write("You have $" + getCashInPockets()+" in your pockets");
            writer.write("");

            return false;
        } else {
            decreaseCashInPockets(cashToWithdrawal);
            writer.write("You still have $" + getCashInPockets() + " in your pockets");
            writer.write("");
            return true;
        }
    }
}
