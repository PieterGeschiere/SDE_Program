package alleyway;

public class CodeCheck {
    private int code = 1234;
    public int getSecurityCode() { return code; }
    public boolean isCodeCorrect(int secCodeToCheck){
        if(secCodeToCheck == getSecurityCode()){
            return true;
        } else {
            return false;
        }
    }
}
