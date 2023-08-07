package Seminar_3.controller;

import java.util.Scanner;

public class ScannerLineToParse {

    public String ScannerHumanLine() {

        String humanString;
        Scanner sc = new Scanner(System.in, "cp866");
        humanString = sc.nextLine();
        sc.close();
        return humanString;
    }
}
