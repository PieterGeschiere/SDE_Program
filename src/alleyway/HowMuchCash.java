package alleyway;

import main.ConsoleReader;
import main.ConsoleWriter;
import java.util.Scanner;

public class HowMuchCash {
    ConsoleReader cr = new ConsoleReader();
    ConsoleWriter writer = new ConsoleWriter();
    Scanner sc = new Scanner(System.in);
    PocketsFacade accesPockets = new PocketsFacade(12345, 1234);
    public void HowMuchCash(){
        writer.write("How much cash do you want to give?");
        writer.write("Choose the amount");

        Boolean checkInt = sc.hasNextInt();

        if(checkInt) {
            accesPockets.withdrawCash(sc.nextInt());
        } else {
            writer.write("You check your pockets but didn't find any money");
            writer.write("You only found " + sc.next());
            System.exit(1);
        }
    }
}
