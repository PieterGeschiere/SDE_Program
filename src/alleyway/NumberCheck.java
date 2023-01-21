package alleyway;

public class NumberCheck {
    private int number = 12345;
    public int getAccountNumber() {return number;}

    public boolean accountActive(int acctNumToCheck){
        if (acctNumToCheck == getAccountNumber()) {
            return true;
        } else {
            return false;
        }
    }
}
