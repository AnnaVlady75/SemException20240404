package Semenars_Exceptions.Sem2;

import java.io.*;

/**
 * Заставьте выполниться следующий код
 */
public class Task4 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String str = strings[1];
            test(0);
            int a = 1 / 0;

            inputStream = new FileInputStream("sdafgdsaf");
        }
//        catch (StackOverflowError error) {//error обрабатывать нельзя!
//            System.err.println("stack overflow error");
//        }
        catch (Throwable e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    private static void test(int count) throws IOException {
        if (count >10) return;
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        count++;
        test(count);
    }

//    private boolean isFloat(String str) {
//        try {
//            Float.parseFloat(str);
//            return true;
//        } catch (NumberFormatException e) {
//            return false;
//        }
}
