package Seminar_3;

import Seminar_3.model.HumanWithData;
import Seminar_3.controller.*;

public class Program {
    public static void main(String[] args) {

        final int datacount = 6;
        final String separ = " ";
        
        String f = "Иванов";
        String i = "Иван";
        String o = "Иванович";
        String dr = "10.10.2000";
        long tel = 9265844686L;
        char ge = 'm';

        HumanWithData iiv = new HumanWithData(f, i, o, dr, tel, ge);

        System.out.println(iiv.toString());

        // ScannerHuman sh = new ScannerHuman();
        // sh.run();

        ScannerLineToParse shl = new ScannerLineToParse();

        String test = shl.ScannerHumanLine();

        System.out.println(test);

        ParseHumanLine phl = new ParseHumanLine();
        boolean dataCompl = phl.translateResult(phl.checkComplData(phl.stringToArrStrings(test, separ), datacount));
        phl.checkTypeOfData(phl.stringToArrStrings(test, separ));
        
    }
}
