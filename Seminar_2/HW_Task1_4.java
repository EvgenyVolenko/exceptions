// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class HW_Task1_4 {
    public static void main(String[] args) {

        System.out.println("Вы ввели - " + getFloat());
    }

    public static float getFloat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        String digitString;
        float digit;

        while (true) {
            digitString = scanner.nextLine();
            try {
                digitString.charAt(0);
                digit = Float.parseFloat(digitString);
                break;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.print("Пустые строки вводить нельзя. Повторите ввод: ");
            } catch (NumberFormatException e) {
                System.out.print("Вы ввели не число. Повторите ввод: ");
            }
        }
        scanner.close();
        return digit;
    }
}