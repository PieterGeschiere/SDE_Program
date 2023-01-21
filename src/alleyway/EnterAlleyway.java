package alleyway;

import main.ConsoleReader;
import main.ConsoleWriter;

public class EnterAlleyway {
    ConsoleWriter writer = new ConsoleWriter();
    ConsoleReader cr = new ConsoleReader();
    HowMuchCash howMuchCash = new HowMuchCash();

    public void EnterAlleyway(){
        writer.write("you entered the alleyway");
        writer.write("There is a homeless person here");
        writer.write("Do you wanna spare some change");
        writer.write("Y/N");

        String check = cr.readLine();
        if(check.equalsIgnoreCase("Y"))
        {howMuchCash.HowMuchCash();}
        else if(check.equalsIgnoreCase("N"))
        {
            writer.write("You left the alleyway");
            System.exit(1);
        }
        else
        {
            writer.write("Invalid Choice");
            writer.write("");
            EnterAlleyway();
        }
    }
}
