package IntermediateCertificationException;

import java.util.Scanner;

public class InputUserData {
    public static String input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите: Фамилия Имя Отчество" +
                " датарождения номертелефона пол");
        return scanner.nextLine();
    }

}
