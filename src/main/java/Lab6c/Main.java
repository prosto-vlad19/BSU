package Lab6c;

/* 1. Прочитать текст Java-программы  и
          все слова public в объявлении атрибутов и методов класса заменить на слово private. */
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Task1
        Task streamTask1 = new Task();
        try {
            streamTask1.task1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}