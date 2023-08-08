package Seminar_3;

import Seminar_3.model.HumanWithData;
import Seminar_3.view.HumanInter;
import Seminar_3.controller.*;

public class Program {
    public static void main(String[] args) {

        String separator = " ";
        int params = 6;

        String f = "Eванов";
        String i = "Иван";
        String o = "Иванович";
        String dr = "10.10.2000";
        long tel = 9265844686L;
        char ge = 'm';

        HumanWithData iiv = new HumanWithData(f, i, o, dr, tel, ge);

        WriteFile.WrFile(iiv);

        HumanInter humanInter = new HumanInter();
        humanInter.run(separator, params);
    }
}
