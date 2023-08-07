package Seminar_3.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ParseHumanLine {

    public String[] stringToArrStrings(String humanString, String separator) {
        return humanString.split(separator);
    }

    public int checkComplData(String[] dataArrayString, int params) {

        if (dataArrayString.length > params) {
            return -1;
        } else if (dataArrayString.length < params) {
            return -2;
        }

        for (String string : dataArrayString) {
            if (string == "") {
                System.out.println(string);
                return -3;
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

    public void checkTypeOfData(String[] dataArrayString) {

        String[] types = new String[dataArrayString.length];

        for (int i = 0; i < types.length; i++) {
            types[i] = dataArrayString[i].getClass().getSimpleName();
            System.out.println(types[i]);
        }

        if (!isAlpha(dataArrayString[0])) {
            System.out.println("Фамиия содержит не только буквы!");
        }
        if (!isAlpha(dataArrayString[1])) {
            System.out.println("Имя содержит не только буквы!");
        }
        if (!isAlpha(dataArrayString[2])) {
            System.out.println("Отчество содержит не только буквы!");
        }
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        try {
            df.parse(dataArrayString[3]);
            Long.parseLong(dataArrayString[4]);
        } catch (ParseException e) {
            System.out.println("Не правильный формат даты рождения!");
        } catch (NumberFormatException e) {
            System.out.println("В номере телефона не только цифры!");
        }
        if (dataArrayString[5].charAt(0) != 'm' || dataArrayString[5].charAt(0) != 'f') {
            System.out.println("Пол может быть только m или f !");
        }
        
        // dataArrayString[5];
    }

    public static boolean isAlpha(String s) {
        if (s == null) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                return false;
            }
        }
        return true;
    }
}
