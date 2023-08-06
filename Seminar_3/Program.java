package Seminar_3;

import Seminar_3.model.HumanWithData;
import Seminar_3.controller.ScannerHuman;

public class Program {
    public static void main(String[] args) {

        String f = "Иванов";
        String i = "Иван";
        String o = "Иванович";
        String dr = "10.10.2000";
        long tel = 9265844686L;
        char ge = 'm';

        HumanWithData iiv = new HumanWithData(f, i, o, dr, tel, ge);

        System.out.println(iiv.toString());

        ScannerHuman sh = new ScannerHuman();
        sh.run();

    }
}
