package Lessons.Les3;

import java.io.IOException;
import java.util.Date;
//Создание собственного исключения
public class SavedException extends IOException {
    private Date startDate;
    public SavedException(String message, Date startDate, Exception e) {
        super("exception with message: " + message, e);
        this.startDate = startDate;
    }
    public Date getStartDate(){
        return startDate;
    }
}