import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
/**
 * @autor Bychkov Vladislav 2 course MMF
 *
 */
import java.util.Arrays;
public class Main {
    /**
     * 2. Sort and output the number in ascending order (descending) of their lengths.
     */
    public static void main(String[] args) {
        Calendar temp = Calendar.getInstance();
        temp.set(2021, 1, 8, 13, 00);
        Date dateOfDelivery = new Date();
        Date dateOfReceiving = temp.getTime();
        System.out.println("Developer surname: Bychkov\n" +
                "date of delivery: " + dateOfReceiving.toString() +
                "\ndate of receipt of the task: " + dateOfDelivery.toString()
        );
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int c = in.nextInt();
        int[] k = new int[c];
        System.out.println("Введите массив");

        for (int i = 0; i < c; ++i) {
            k[i] = in.nextInt();
        }

        boolean f = false;
        System.out.println("Введите 1 для вывода по возрастанию, и 2 для вывода по убыванию ");
        int a = in.nextInt();
        int j;
        int i;
        switch (a) {
            case 1:
                while (!f) {
                    f = true;

                    for (i = 0; i < k.length - 1; ++i) {
                        if (k[i + 1] < k[i]) {
                            f = false;
                            j = k[i];
                            k[i] = k[i + 1];
                            k[i + 1] = j;
                        }
                    }
                }

                System.out.println(Arrays.toString(k));
                break;
            case 2:
                while (!f) {
                    f = true;

                    for (i = 0; i < k.length - 1; ++i) {
                        if (k[i] < k[i + 1]) {
                            f = false;
                            j = k[i];
                            k[i] = k[i + 1];
                            k[i + 1] = j;
                        }
                    }
                }

                System.out.println(Arrays.toString(k));
        }
    }
}
