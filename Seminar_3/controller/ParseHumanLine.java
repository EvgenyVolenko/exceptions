package Seminar_3.controller;

public class ParseHumanLine {

    public int checkComplData(String humanString, int params, String separator) {

        String[] dataArrayString = humanString.split(separator);

        if (dataArrayString.length > params) {
            return - 1;
        } else if (dataArrayString.length < params) {
            return - 2;
        }

        for (String string : dataArrayString) {
            if (string == "") {
                System.out.println(string);
                return - 3;
            }
        }

        return 1;
    }

    public boolean translateResult(int result) {

        if (result == -1) {
            System.out.printf("Ошибка %d - Вы ввели БОЛЬШЕ параметров, чем нужно!", result);
            return false;
        } else if (result == -2) {
            System.out.printf("Ошибка %d - Вы ввели МЕНЬШЕ параметров, чем нужно!", result);
            return false;
        } else if (result == -3) {
            System.out.printf("Ошибка %d - Допущен ввод пустых данных", result);
            return false;
        } else {
            System.out.println("Вы ввели все параметры!");
            return true;
        }
    }
}
