package org.SemExceptions;
//Реализуйте метод, принимающий в качестве аргумента
//        целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива.
//        При этом накладываем на метод 2 ограничения:
//        метод может работать только с квадратными массивами
//        (кол-во строк = кол-ву столбцов),
//        и в каждой ячейке может лежать только значение 0 или 1.
//        Если нарушается одно из условий, метод должен бросить RuntimeException
//        с сообщением об ошибке.
public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {0, 1, 1},
                {0, 3, 0},
                {1, 1, 1},
        };
        System.out.println(sumOfArrayElems(arr));
    }
    public static int sumOfArrayElems(int[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) throw new RuntimeException("Массив должен быть квадратным");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0 && array[i][j] != 1){
                    throw new RuntimeException("Массив должен содержать только 0 и 1");
                }
                sum+= array[i][j];
                System.out.println(sum);

            }
        }
        return  sum;
    }

}
