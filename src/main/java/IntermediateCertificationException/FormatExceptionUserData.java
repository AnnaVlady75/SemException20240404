package IntermediateCertificationException;

public class FormatExceptionUserData {
    public static void IsNumberParametersCorrect(String[]arr) {
        while (arr.length != 6) {
            throw new NotCorrectNumParameters("Введено неверное количество параметров");
        }
    }
    public static void IsFormatDateCorrect(String data){
        if (!data.matches("\\d{2}\\.\\d{2}\\.\\d{4}")){
            throw new NotCorrectFormatUserDate("Введен неверный формат даты рождения");
        }
    }
    public static void IsGenderFormatCorrect(String gender){
        if (!gender.equals("f") && !gender.equals("m")){
            throw new NotCorrectGenderFormat("Введен неверный формат пола");
        }
    }
}

