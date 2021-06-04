package Lab4a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Car {
    private Wheel wheels[];
    private Engine engine;
    private String brand;
    private double consumption;
    private double fuel_level;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.consumption, consumption) == 0 && Double.compare(car.fuel_level, fuel_level) == 0 && Arrays.equals(wheels, car.wheels) && engine.equals(car.engine) && brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(engine, brand, consumption, fuel_level);
        result = 31 * result + Arrays.hashCode(wheels);
        return result;
    }

    public Car(String brand_, double consumption_,
               Engine engine_, Wheel wheels_[], double fuel_level_) {
        brand = brand_;
        consumption = consumption;
        engine = engine_;
        wheels = wheels_;
        fuel_level = fuel_level_;
    }
    public String toString() {
        String string = "";
        string += brand + ", " + engine.toString() + ";" + consumption + "L/100km { "+ "fuel level: " + fuel_level + "}; [";
        for (int i = 0; i < 4; ++i) {
            string += wheels[i].toString() + " ";
        }
        return string + "]";
    }
    public static Car get(Scanner scanner) throws IOException {
        Car object = new Car("", 0, new Engine(0, 0), new Wheel[4], 0);
        System.out.print("Введи марку автомобиля: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        object.brand = reader.readLine();
     /*   object.brand = Common.readNotEmptyString(scanner);*/
        System.out.print("Введи расход топлива на 100км: ");
        object.consumption = scanner.nextDouble();
        System.out.print("Введи текущий уровень топлива:");
        object.fuel_level = scanner.nextDouble();
        System.out.println("Введи колеса:");
        for (int i = 0; i < 4; ++i) {
            System.out.println("колесо #" + i);
            object.wheels[i] = Wheel.get(scanner);
        }
        object.engine = Engine.get(scanner);
        return object;
    }
    public void move() {
        if (fuel_level <= 0) {
            System.out.println("Нет бензина, машина не может двигаться");
            return;
        }
        for (int i = 1; i < 4; ++i) {
            if (wheels[i].get_diameter() != wheels[i - 1].get_diameter()) {
                System.out.println("Колеса разных диаметров, машина не может двигаться");
                return;
            }
        }
        double distance = fuel_level / consumption;
        System.out.println("машина проехала " + distance * 100 + "км.");
        fuel_level = 0;
    }
    public void add_fuel(double value) {
        fuel_level += value;
    }
    public void change_wheel(Scanner scanner) throws Exception{
        System.out.println("Введи номер колеса [0-3]:");
        int number;
        while (true) {
            number = scanner.nextInt();
            if (number >= 0 && number <= 3)
                break;
            System.out.println("Неправильный номер, повтори ввод");
        }
        wheels[number] = Wheel.get(scanner);
    }
}