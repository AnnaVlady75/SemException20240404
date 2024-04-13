package Semenars_Exceptions.Sem2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Запишите в файл следующие строки:
 *
 * Анна=4
 * Елена=5
 * Марина=6
 * Владимир=?
 * Полина=?
 * Константин=?
 * Иван=4
 *
 * Реализуйте метод, который считывает данные из файла и сохраняет в
 * двумерный массив (либо HashMap,
 * если студенты с ним знакомы). В отдельном методе нужно будет пройти по
 * структуре данных,
 * если сохранено значение ?, заменить его на соответствующее число.
 * Если на каком-то месте
 * встречается символ, отличный от числа или ?, бросить подходящее исключение.
 * Записать в тот же файл данные с замененными символами ?.
 */
public class Task3 {
    private static final List<String> strings = List.of
            ("Анна=4", "Елена=5", "Марина=6", "Полина=?",
                    "Владимир=?", "Константин=?", "Иван=4");
    //для проверки, заменить какое-то из значений на null

    public static void main(String[] args) {
        String path = "task3.txt";
        System.out.println(write(path, strings));
//        System.out.println(analyze(path));
        rewrite(path);
    }
                                    //путь к файлу
    private static boolean write(String path, List<String> strings) {
        FileWriter fw = null;
        try {
//            fw = new FileWriter(path, true);// будет дозапись
            fw = new FileWriter(path);// файл будет перезаписываться
            for (String string : strings) {
                fw.write(string + "\n");
            }
            fw.flush();//чтобы в малбуфер записалось
        } catch (IOException e) {
            return false;
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return true;
    }

    private static Map<String, Integer> analyze(String path) {
        Map<String, Integer> result = new HashMap<>(7);// словарь
        BufferedReader br = null;// может читать по строчкам
        try {
            br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {// пока не споткнусь о пустую строку
                String[] arr = line.split("="); // ["Анна", "4"] // ключ для мапы
                String key = arr[0];
                String temp = arr[1];
                int val; //значение
                if (temp.equals("?")) val = key.length();// длина ключа
                else val = Integer.parseInt(temp);
                result.put(key, val);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return result;
    }

    private static void rewrite(String path) {
        Map<String, Integer> map = analyze(path);
        List<String> data = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            data.add(entry.toString());
        }
        write(path, data);// путь и список
    }
}
