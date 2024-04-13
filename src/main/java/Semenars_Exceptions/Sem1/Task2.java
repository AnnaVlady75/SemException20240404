package Semenars_Exceptions.Sem1;
//Реализуйте метод,
//        принимающий в качестве аргумента целочисленный массив и некоторое значение.
//        Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//        1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//        2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        3. если вместо массива пришел null, метод вернет -3
public class Task2 {
    public static void main(String[] args) {

        System.out.println(getElemIndexArray (new int[]{1,2,9,78,7,15,35},1,2));
    }
    public static int getElemIndexArray(int[] array, int elem, int min){
        if (array == null) {
            System.out.println("Array can not be null");
            return -3;
        }
        if (array.length < min)  throw new IllegalArgumentException("Length can not be less min");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) return i;
        }
        return -2;
        }
}
