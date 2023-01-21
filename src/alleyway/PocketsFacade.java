package alleyway;

import main.ConsoleWriter;

public class PocketsFacade {
    private int number;
    private int code;
    ConsoleWriter writer = new ConsoleWriter();
    NumberCheck numberChecker;
    CodeCheck codeChecker;
    CheckFunds fundsChecker;
    GetCash getCash;

    public PocketsFacade(int newNumberChecker, int newSecCode) {
        number = newNumberChecker;
        code = newSecCode;

        getCash = new GetCash();
        numberChecker = new NumberCheck();
        codeChecker = new CodeCheck();
        fundsChecker = new CheckFunds();
    }
    public int getNumber() {return number;}
    public int getCode() {return code;}

    public void withdrawCash(double cashToGet){
        if(numberChecker.accountActive(getNumber()) &&
            codeChecker.isCodeCorrect(getCode()) &&
                fundsChecker.haveEnoughCash(cashToGet)) {
            writer.write("You took out the cash and gave it to the homeless person");
            writer.write("They thanked you kindly");
            writer.write("You left the alleyway feeling a little bit happier");
            System.exit(1);
        } else {
            writer.write("You didn't take out the cash");
            writer.write("And told the homeless person you were also broke");
            writer.write("You left the alleyway");
            System.exit(1);
        }

    }
}
