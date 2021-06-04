package Lab9a;

import java.util.Locale;
import java.util.Scanner;

public class Lab9a {
    public static void main(String[] args) {
        String line = "";
        try (Scanner scanner = new Scanner(System.in)) {
            line = scanner.nextLine();
            String line2 = line.replaceAll(".(?!$)", "$0  ");
            System.out.println(line2);
            int[] numbers  = stringToCharNumber(line);
            String output = "";
            for(int i = 0; i < numbers.length; i++){
                if(numbers[i] < 10 && numbers[i] > 0) {
                    output += numbers[i] + "  ";
                } else if(numbers[i] < 33 && numbers[i] > 9){
                    output += numbers[i] + " ";
                }
                else {
                    output += "   ";
                }
            }
            System.out.println(output);
        }
    }

    public static int[] stringToCharNumber(String line) {
        line = line.toLowerCase(Locale.ROOT);
        char[] arr = line.toCharArray();
        int[] number = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != ' ') {
                number[i] = (int) arr[i] - 1071;
            }
        }
        return number;
    }
}
