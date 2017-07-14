package sk.bsc.main;

public class PayTrack {

    public PayTrack() {
        welcomeMesage();
    }

    public static void main(String[] args) {
        PayTrack payTrack = new PayTrack();
        ConsoleUI consoleUI = new ConsoleUI();
        consoleUI.printOutCurrencies();
        consoleUI.handleUserInput();
    }

    public void welcomeMesage(){
        System.out.println("- - - PAYMENT TRACKER - - -");
        System.out.println("Welcome dear customer!");
    }

}
