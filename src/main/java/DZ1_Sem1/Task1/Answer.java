package DZ1_Sem1.Task1;
/*
    Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
    Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
    Метод divisionByZero - Деление на 0
    Метод numberFormatException - Ошибка преобразования строки в число
    Важно: они не должны принимать никаких аргументов
     */
public class Answer {
    public static void arrayOutOfBoundsException() {
        int[] array = new int[]{1, 2, 3, 4};
        int index = array[10];
    }

    public static void divisionByZero() {
        int a = 1;
        int b = 0;
        int c = a/b;
    }

    public static void numberFormatException() {
        String message = "Test";
        int value = Integer.parseInt(message);
    }
}

//class Answer {
//    public static void arrayOutOfBoundsException() {
//        int[] array = new int[10];
//        System.out.println(array[11]); // Выход за пределы массива
//    }
//
//    public static void divisionByZero() {
//        int a = 1;
//        int b = 0;
//        int c = a / b; // Деление на ноль
//    }
//
//    public static void numberFormatException() {
//        String str = "abc";
//        int num = Integer.parseInt(str); // Ошибка преобразования строки в число
//    }
//}
//
//public class Printer {
//    public static void main(String[] args) {
//        Answer ans = new Answer();
//        try {
//            ans.arrayOutOfBoundsException();
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Выход за пределы массива");
//        }
//
//        try {
//            ans.divisionByZero();
//        } catch (ArithmeticException e) {
//            System.out.println("Деление на ноль");
//        }
//
//        try {
//            ans.numberFormatException();
//        } catch (NumberFormatException e) {
//            System.out.println("Ошибка преобразования строки в число");
//        }
//    }
//}
//
