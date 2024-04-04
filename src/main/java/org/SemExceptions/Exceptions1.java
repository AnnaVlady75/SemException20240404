package org.SemExceptions;
//Реализуйте метод,
//принимающий в качестве аргументов целочисленный массив
//и некоторый допустимый минимум.
//Если длина массива меньше некоторого заданного минимума,
//метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
public class Exceptions1 {
    public static void main(String[] args) {
        System.out.println(getArrayLength(new int[]{1,2,9,78,7,15,35},1));

    }



    public static int getArrayLength(int[] array, int min){
        if (array.length < min){
            return  -1;
        }
        return array.length;

    }

}
