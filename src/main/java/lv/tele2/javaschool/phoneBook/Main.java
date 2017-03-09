package lv.tele2.javaschool.phoneBook;

import asg.cliche.ShellFactory;
import asg.cliche.example.HelloWorld;

import java.io.IOException;

/**
 * Created by andrkuli on 07.03.2017.
 */

//1. add more numbers to one record

public class Main {
    public static void main(String[] args) {
        try {
            ShellFactory.createConsoleShell("WTF?", null, new PhoneBook())
                    .commandLoop();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

