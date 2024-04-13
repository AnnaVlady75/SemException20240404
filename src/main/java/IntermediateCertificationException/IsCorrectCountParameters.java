package IntermediateCertificationException;

public class IsCorrectCountParameters extends Exception{
    public IsCorrectCountParameters(String message) {
        super(message +"Data Format is not correct");
    }
}
