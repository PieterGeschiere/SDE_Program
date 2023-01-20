package main;

public class Main {

    public static void main(String[] args) {
        Start start = new Start();
        Info info = new Info();
        Scene currentScene = start;
        while(true){
            String state = currentScene.getText();
            if (state == "info") {
                currentScene = info;
            }
            if (state == "start") {
                currentScene = start;
            }
        }
    }
}