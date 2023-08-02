class Answer {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] arr = {1,2,3,4};
        int x = arr[4];
      
}

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 10;
        int b = 0;
        a = a / b;
      
}

    public static void numberFormatException() {
        // Напишите свое решение ниже
        int x = Integer.parseInt("g123");
       
 }
}

public class HW_01 {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
