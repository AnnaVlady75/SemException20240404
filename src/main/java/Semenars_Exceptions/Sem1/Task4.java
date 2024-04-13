package Semenars_Exceptions.Sem1;

import java.util.ArrayList;

//Реализуйте метод checkArray(Integer[] arr),
//        принимающий в качестве аргумента целочисленный одномерный массив.
//        Метод должен пройтись по каждому элементу и
//        проверить что он не равен null. Реализуйте следующую логику:
//        1. Если в какой-то ячейке встретился null,
//        то необходимо “оповестить” об этом пользователя
//        2. Если null’ы встретились в нескольких ячейках,
//        то идеально было бы все их “подсветить”
public class Task4 {
    public static void main(String[] args) {

        checkArray(new Integer[]{12,45,3,2,6,null,76,null,54});
    }
    public static void checkArray(Integer[] arr){
        ArrayList<Integer> errors = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==null){
                errors.add(i);
            }
        }
        if (!errors.isEmpty()){
            System.out.println("Массив содержит null в ячейке"+" "+ errors);
        }
        else {
            System.out.println("Массив не содержит null в ячейках");
        }
    }
}

