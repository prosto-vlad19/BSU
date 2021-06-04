package Lab6c;
import java.io.*;

public class Task {
    public static final String PUBLIC = "public";
    public static final String PRIVATE = "private";

    public void task1() throws IOException {
        File file = new File("D:\\УЧЕБА\\proga\\src\\main\\java\\Lab6c\\JavaExample.java");
        File resultFile = new File("D:\\УЧЕБА\\proga\\src\\main\\java\\Lab6c\\JavaExample2.txt");


        if (file.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resultFile))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.append(line.replace(PUBLIC, PRIVATE)).append(System.lineSeparator());
                }
            }
        }
    }
}
