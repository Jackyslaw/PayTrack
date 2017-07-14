package sk.bsc.main;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by PCJAKM02 on 14. 7. 2017.
 */
public class ConsoleUI {

    public ConsoleUI() {
    }


    private void handleFalseInput(){
        System.out.println("Wrong format of input! Please make sure you type in Format: CCC <amount> , etc. USD -5329");
        checkUserInput();
    }

    public void handleUserInput(){
        System.out.println("Please type in currency and amount (Format: CCC <amount> , etc. USD -5329)");
        checkUserInput();
    }


    private void checkUserInput(){
        String input = readConsole();
        if (!input.matches("^[A-Z]{3}[ ]*[-+]?\\d{1,}[ ]*")){
            handleFalseInput();
        }
        else
            System.out.println("Well");
//            writeToFile(s);
    }


     private String readConsole(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String\n");
        String s = new String();
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    public void printOutCurrencies(){
         Currencies currencies = new Currencies();
         for (String s: currencies.getCurrencies())
             System.out.println(s);
    }

}


//^[A-Z]{3}[ ]*\d{1,}