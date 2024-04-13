package Semenars_Exceptions.Sem3.Task4_Sem3;

public class SizeException extends IndexOutOfBoundsException {
    public SizeException() {
        super("Массив должен быть 3х3");
    }
}