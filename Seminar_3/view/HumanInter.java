package Seminar_3.view;

import java.util.Scanner;

import Seminar_3.controller.ParseHumanLine;
import Seminar_3.controller.WriteFile;
import Seminar_3.model.HumanWithData;

public class HumanInter {

    public void run(String separator, int params) {

        Scanner sc = new Scanner(System.in, "cp866");
        ParseHumanLine parseHumanLine = new ParseHumanLine();
        HumanWithData human = new HumanWithData(null, null, null, null, 0, 'm');

        String temp;
        String r;

        while (true) {

            System.out.println("Введите строку с данными о человеке: ");
            temp = sc.nextLine();
            
            if (parseHumanLine.translateResult(
                    parseHumanLine.checkComplData(parseHumanLine.stringToArrStrings(temp, separator), params))
                    && parseHumanLine.checkTypeOfData(parseHumanLine.stringToArrStrings(temp, separator))) {
                human.setSurnameString(parseHumanLine.stringToArrStrings(temp, separator)[0]);
                human.setNameString(parseHumanLine.stringToArrStrings(temp, separator)[1]);
                human.setPatronymicString(parseHumanLine.stringToArrStrings(temp, separator)[2]);
                human.setDateOfBirth(parseHumanLine.stringToArrStrings(temp, separator)[3]);
                human.setTelephoneNumber(Long.parseLong(parseHumanLine.stringToArrStrings(temp, separator)[4]));
                human.setGender(parseHumanLine.stringToArrStrings(temp, separator)[5].charAt(0));

                WriteFile.WrFile(human);

            } else {

                System.out.println("Повторите ввод!");
            }

            System.out.print("Ввести еще yes/no: ");
            r = sc.nextLine();

            if (r.equals("no")) {
                break;
            }

        }
        sc.close();

    }
}
