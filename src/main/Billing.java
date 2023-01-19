package main;

public class Billing {
    ConsoleWriter writer = new ConsoleWriter();
    public void generateBill(int total)
    {
        writer.write("");
        writer.write("***************** Thank you for ordering *******************");
        writer.write("****************Your Bill is : $" +total+ "*****************");
    }
}
