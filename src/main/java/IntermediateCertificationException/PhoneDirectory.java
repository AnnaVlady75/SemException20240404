package IntermediateCertificationException;

//Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом:
//        Фамилия Имя Отчество дата _ рождения номер _ телефона пол
//        Форматы данных:
//        фамилия, имя, отчество - строки
//        дата _ рождения - строка формата dd.mm.yyyy
//        номер _ телефона - целое беззнаковое число без форматирования
//        пол - символ латиницей f или m.
//        Приложение должно проверить введенные данные по количеству. Если количество не совпадает,
//        вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.
//        Приложение должно распарсить полученную строку и выделить из них требуемые значения. Если форматы данных не совпадают,
//        нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои.
//        Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
//
//        Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии,
//        в него в одну строку должны записаться полученные данные, вида
//<Фамилия> <Имя> <Отчество> <дата _ рождения> <номер _ телефона> <пол>
//
//Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
//        Не забудьте закрыть соединение с файлом.
//        При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
//        пользователь должен увидеть стектрейс ошибки.
public class PhoneDirectory {
    public static void main(String[] args) {
        String[] data = InputUserData.input().split(" ");
        try {
            FormatExceptionUserData.IsNumberParametersCorrect(data);
            String lastName = data[0];
            String firstName = data[1];
            String patronymic = data[2];

            FormatExceptionUserData.IsFormatDateCorrect(data[3]);
            String birthDate = data[3];

            long phoneNumber = Long.parseLong(data[4]);

            FormatExceptionUserData.IsGenderFormatCorrect(data[5]);
            char gender = data[5].charAt(0);

            Person person = new Person(lastName,firstName,patronymic,
                    birthDate,phoneNumber,gender);
            String heading = person.lastName;
            WriterFile.writer(person,heading);

        }catch (NotCorrectNumParameters e){
            System.err.println(e);
        }catch (NotCorrectFormatUserDate e ){
            System.err.println(e);
        }catch (NumberFormatException e){
            System.err.println(e + "Ошибка: Невозможно преобразовать в число");
        }catch (NotCorrectGenderFormat e){
            System.err.println(e);
        }
    }

}
