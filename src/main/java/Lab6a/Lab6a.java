package Lab6a;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String inputFilePath = "input6a.txt";
        String outputFilePath = "output6a.txt";
        if(args.length == 2){
            inputFilePath = args[0];
            outputFilePath = args[1];
        }
        String line = "";
        try(FileReader fileReader = new FileReader(inputFilePath);
            Scanner scanner = new Scanner(fileReader)) {
            while (scanner.hasNext()){
                line += scanner.nextLine() + '\n';
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Scanner scanner = new Scanner(System.in);
             FileWriter fileWriter = new FileWriter(outputFilePath);
        ){
            System.out.println(line);
            System.out.println("Введите заменяемую строку");
            String substringWillReplaced = "";
            substringWillReplaced = scanner.nextLine();
            System.out.println("введите заменяющую строку ");
            String newSubstring = "";
            newSubstring = scanner.nextLine();
            line = line.replaceAll(substringWillReplaced, newSubstring);
            fileWriter.write(line);
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
