package Semenars_Exceptions.Sem3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Перепишите код, воспользовавшись механизмом try-with-resources
 */
public class Task1_Sem3 {
    public void rwLine(Path pathRead, Path pathWrite) throws IOException {
        try(BufferedReader in = Files.newBufferedReader(pathRead);
        BufferedWriter out = Files.newBufferedWriter(pathWrite)) {
            out.write(in.readLine());
        }
    }
}
