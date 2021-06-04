package task_7;

import java.util.Scanner;

public class Payment {
    public static Scanner ob = new Scanner(System.in);
    public info[] info = new info[10];
    public String name;
    public int num;

    public Payment() {
        System.out.print("Введите название магазина:");
        setname(ob.next());
        System.out.print("Введите кол-во товаров: ");
        num = ob.nextInt();
        info[] sessions = new info[10];
        for (int i = 0; i < num; i++)
            info[i] = new info();
    }

    public Payment(int num){

    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }


    public class info {
        int num, kol;
        String tov;

        public info() {
            System.out.print("Товар №:");
            setNumberOfSession(ob.nextInt());
            System.out.print("Название: ");
            setTovar(ob.next());
            System.out.print("кол-во товара(шт.):");
            setNumberOfExaminations(ob.nextInt());

        }

        public int getNumberOfSession() {
            return num;
        }

        public void setNumberOfSession(int number) {
            this.num = number;
        }
        public int getTovar() {
            return kol;
        }

        public void setTovar(String tov) {
            this.tov = tov;
        }
        public String getNumberOfExaminations() {
            return tov;
        }

        public void setNumberOfExaminations(int zachet) {
            this.kol = zachet;
        }
        @Override
        public String toString() {
            StringBuilder s = new StringBuilder(" товар № " + num +" "+tov+ "в кол-ве "+kol+" (шт.)") ;
            s.append("\n");
            return s.toString();
        }


    }

    public static class Pokupka {

        public static void Title() {
            System.out.println("Покупка");
        }


    }

    void Deansignature() {
//anonim
        Payment D = new Payment(0) {
            @Override
            public String toString() {
                String s = "Bychkov_Vladislav";
                return s;

            }
        };
        System.out.println(D.toString());
    }

    static public void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        Payment ct = new Payment();
        Payment.Pokupka.Title();

        System.out.print("В магазине " + ct.getname()+" необходимо купить:\n ");
        for (int i = 0; i < ct.num; i++)
            System.out.print(ct.info[i].toString());
        ct.Deansignature();
    }
}
