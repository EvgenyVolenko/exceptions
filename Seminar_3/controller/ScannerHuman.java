package Seminar_3.controller;

import java.util.Scanner;

import Seminar_3.model.HumanWithData;

public class ScannerHuman {

    public void run() {

        Scanner scanner = new Scanner(System.in, "cp866");
        System.out.println("Данные о человеке: ");

        String f = null;
        String i = null;
        String o = null;
        String dr = null;
        long tel = 0;
        char ge = 'm';
        String r = "no";

        HumanWithData humanWithData = new HumanWithData(f, i, o, dr, tel, ge);

        while (true) {

            System.out.print("Введите Фамилию: ");
            humanWithData.setSurnameString(scanner.next());
            System.out.print("Введите Имя: ");
            humanWithData.setNameString(scanner.next());
            System.out.print("Введите Отчество: ");
            humanWithData.setPatronymicString(scanner.next());
            System.out.print("Введите День рождения: ");
            humanWithData.setDateOfBirth(scanner.next());
            System.out.print("Введите телефон: ");
            humanWithData.setTelephoneNumber(scanner.nextLong());
            System.out.print("Введите пол m/f: ");
            ge = scanner.next().charAt(0);
            humanWithData.setGender(ge);

            System.out.println(humanWithData.toString());

            System.out.print("Ввести еще yes/no: ");
            r = scanner.next();

            if (r.equals("no")) {
                break;
            }

        }
        scanner.close();
    }
}
