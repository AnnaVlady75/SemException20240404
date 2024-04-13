package IntermediateCertificationException;

public class Person {
    String lastName;
    private String firstName;
    private String patronymic;
    private String birthDate;
    private long phoneNumber;
    private char gender;

    public Person(String lastName, String firstName, String patronymic,
                  String birthDate, long phoneNumber,
                  char gender){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
    @Override
    public String toString(){
        return String.format("{%s}{%s}{%s}{%s}{%s}{%s}\n", lastName, firstName, patronymic, birthDate, phoneNumber,
        gender);
    }
}
