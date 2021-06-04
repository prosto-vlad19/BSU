package Lab4a;

import java.io.*;
import java.util.*;

class Wheel {
    public enum Type { Winter, Summer }

    private double diameter;
    private String brand;
    private Type type;

    public Wheel(String brand_, double diameter_, Type type_) {
        brand = brand_;
        diameter = diameter_;
        type = type_;
    }

    public String toString() {
        String string = "";

        string += brand + "(" + diameter + "): ";
        if (type == Type.Winter)
            string += "Winter; ";
        else
            string += "Summer; ";

        return string;
    }
    Scanner in = new Scanner(System.in);
   /* n = in.nextInt();*/

    public static Wheel get(Scanner scanner) throws IOException {
        Wheel object = new Wheel("", 0, Type.Winter);

        System.out.print("Введи бренд: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        object.brand = reader.readLine();
        System.out.print("Введи диаметр: ");
        object.diameter = scanner.nextDouble();

        System.out.print("Введи тип (1) - зимние, (2) - летние: ");
        while (true) {
            int value = scanner.nextInt();
            if (value == 1) {
                object.type = Type.Winter;
                break;
            }
            if (value == 2) {
                object.type = Type.Summer;
                break;
            }
            System.out.print("Введено неправильное значение, повтори ввод.");
        }
        return object;
    }

    public double get_diameter() {
        return diameter;
    }
}