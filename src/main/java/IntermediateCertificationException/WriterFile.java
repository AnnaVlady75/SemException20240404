package IntermediateCertificationException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
    public static void writer(Object person,String heading){
        try (FileWriter writer = new FileWriter(heading + ".txt")) {
            writer.write(person.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
