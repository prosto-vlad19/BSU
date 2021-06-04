package Lab8a;

import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String phrase1 = scanner.nextLine();
        phrase1 = (phrase1.toLowerCase()).trim();
        long a1 = stringToCharNumber(phrase1);

        String phrase2 = scanner.nextLine();
        phrase2 = (phrase2.toLowerCase()).trim();
        long a2 = stringToCharNumber(phrase2);
        if(a1 == a2){
            System.out.println("являются анаграммами");
        } else {
            System.out.println("не являются анаграммами");

        }
    }

    public static long stringToCharNumber(String line) {
        line = line.toLowerCase(Locale.ROOT);
        char[] arr = line.toCharArray();
        int[] number = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                number[i] = (int) arr[i];
            }
        }
        long ans = 1;
        for (int i = 0; i < number.length; i++) {
            ans *= number[i];
        }
        return ans;
    }
}