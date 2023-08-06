package Seminar_3.controller;

import java.util.Scanner;

import Seminar_3.model.HumanWithData;

public class ScannerHuman {

    public void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Данные о человеке: ");
        
        String f = null;
        String i = null;
        String o = null;
        String dr = null;
        long tel = 0;
        char ge = 'm';

        HumanWithData humanWithData = new HumanWithData(f, i, o, dr, tel, ge);

        while (true) {
            if (ge == 'e') {
                break;
            }

            System.out.print("Введите Фамилию ");
            f = scanner.nextLine();
            System.out.print("Введите Имя ");
            i = scanner.nextLine();
            System.out.print("Введите Отчество ");
            o = scanner.nextLine();
            System.out.print("Введите День рождения ");
            dr = scanner.nextLine();
            System.out.print("Введите телефон ");
            tel = scanner.nextLong();
            System.out.print("Введите пол (m/f, e для выхода) ");
            ge = scanner.next().charAt(0);

            humanWithData = new HumanWithData(f, i, o, dr, tel, ge);

            System.out.println(humanWithData.toString());

        }
        scanner.close();
    }
}
