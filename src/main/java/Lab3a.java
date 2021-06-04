
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Lab3a implements Comparator<Lab3a> {

    private String surname;
    private String name;
    private String patronymic;
    private String adress;
    private int BankAccountNumber;
    private int CreditCardNumber;

    /*  private int marx[] = new int[20];*/
    public Lab3a() throws IOException {
        surname = "";
        name = "";
        patronymic = "";
        adress = "";
        BankAccountNumber = 0;
        CreditCardNumber = 0;

        /*  marx[0] = 0;*/
    }

    ;

    public void setSurname(String s) {
        surname = s;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String n) {
        name = n;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setPatronymic(String p) {
        patronymic = p;
    }

    public void getPatronymic() {
        System.out.println(patronymic);
    }

    public void setAdress(String a) {
        adress = a;
    }

    public void getAdress() {
        System.out.println(adress);
    }

  /*  public void setNumberofSubjects(int num1) { num = num1; }
    public void getNumberofSubjects() { System.out.println(num); }*/

/*    public void setMarks(int[] m) {for (int i = 0; i < num; i++) marx[i] =m[i]; }
    public void getMarks() {for (int i = 0; i < num; i++) System.out.printf("%d ", marx[i]); }*/

    public void setBankAccountNumber(int num1) {
        BankAccountNumber = num1;
    }

    public void getBankAccountNumber() {
        System.out.println(BankAccountNumber);
    }

    public void setCreditCardNumber(int num2) {
        BankAccountNumber = num2;
    }

    int getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setTun(String s, String n, String p, String a, int num1, int num2/*, int[] m */) {
        surname = s;
        name = n;
        patronymic = p;
        adress = a;
        BankAccountNumber = num1;
        CreditCardNumber = num2;
        /* for (int i = 0; i < num; i++) marx[i] =m[i];*/

    }

    /*    @Override*/


    /*public String toString() {
        StringBuilder s = new StringBuilder("\nAbiturient : " + surname + name + patronymic +";" + adress + "\n");
        for (int i = 0; i < BankAccountNumber; i++) {

            s.append(marx[i]+ " ");
        }
        s.append("\n");

        return s.toString();
    }*/

    public void getTun() {
        System.out.print("\n==============================\n");
        System.out.println(surname);
        System.out.println(name);
        System.out.println(patronymic);
        System.out.println(adress);
        /*  for (int i = 0; i < BankAccountNumber; i++) System.out.printf("%d ", marx[i]);*/
        System.out.println(BankAccountNumber);
        System.out.println(CreditCardNumber);
        System.out.print("\n==============================\n");
    }

    ;

    /*    public int sumofpoints() { int sum = 0; for (int i = 0; i <= 2; i++)  sum += marx[i];   return sum; };*/

    /*public static void listgreatersum(Lab3a spis[], int k, int m) {

        for (int i = 0; i < k; i++) {
            if (spis[i].sumofpoints()>=m) {
                System.out.print("==============================\n");
                spis[i].getSurname();
                spis[i].getName();
                spis[i].getPatronymic();
                spis[i].getAdress();
                System.out.print("\n==============================\n");
            }
        }

    };*/

    public void copy(Lab3a a) {
        surname = a.surname;
        name = a.name;
        adress = a.adress;
        BankAccountNumber = a.BankAccountNumber;
        CreditCardNumber = a.CreditCardNumber;
        /* for(int i = 0; i < BankAccountNumber; i++) marx[i] = a.marx[i];*/
    }

    public static void sort(Lab3a A[]) {
        Comparator<Lab3a> comparator = Comparator.comparing(o -> o.getSurname());
        Arrays.sort(A, comparator);
        for (Lab3a iter : A) {
            System.out.println(iter.toString() );
        }
    }
    public static void listRange(Lab3a spis[], int kk1, int kk2) throws IOException {
       /* int[] s1 = new int[spis.length];*/
        for (int i = 0; i < spis.length; i++)

        {
            if ((spis[i].getCreditCardNumber()<=kk2)&&(spis[i].getCreditCardNumber()>=kk1))
            {
                System.out.println(spis[i]);
            }
        }

    }
   /* public static void listRange(Lab3a spis[], int kk1, int kk2) throws IOException {
        int[] s1 = new int[spis.length];
        int counter = 0;
        for (int i = 0; i < spis.length; i++) {
            s1[i] = spis[i].CreditCardNumber;
            if ((s1[i] <= kk2) && (s1[i] >= kk1)) {
                counter++;
                *//*s2[i]=spis[i].surname;*//*
            }
        }
        String[] s2 = new String[counter];
        int counter2 = 0;
        for (int i = 0; i < spis.length; i++) {
            s1[i] = spis[i].CreditCardNumber;
            if ((s1[i] <= kk2) && (s1[i] >= kk1)) {
                s2[counter2] = spis[i].surname;
                counter2++;
            }
        }
        System.out.println(Arrays.toString(s2));
    }*/
/*    public static void listthebest(Lab3a spis[], int k, int N, int passingpoint) throws IOException {


        for (int i = 0; i < k; i++)
            for (int j = i; j < k; j++)
                if(spis[i].sumofpoints() < spis[j].sumofpoints()) {Lab3a a1 = new Lab3a();
                    a1.copy(spis[i]);
                    spis[i].copy(spis[j]);
                    spis[j].copy(a1);
                }
        System.out.printf("%d best applicants: \n", N);
        for(int i = 0; i <N; i++)
            spis[i].getTun();
        System.out.printf("Students with semi-passing point: \n");
        for (int i = 0; i < k; i++) if((spis[i].sumofpoints()>=passingpoint-2)&&(spis[i].sumofpoints()<passingpoint)) spis[i].getTun();

    };*/

   /* public static void listtheworst(Lab3a spis[], int k, int negative) {
        for (int i = 0; i < k; i++) if(spis[i].sumofpoints()<=negative) spis[i].getTun();
    }*/


    public static void main(String[] args) throws IOException {
       /* int negative = 27;
        int passingpoint = 119;*/
        int n, num1, BankAccountNumber, CreditCardNumber; //n-число клиентов,num1-число экзаменов
        /*       num1=2;*/
        /* System.out.print("Exams in 2 subjects. Semi-passing point: 119, negative point: 27.\n");*/
        String surname, name, patronymic, adress;
        /*   int marx[]= new int[20];*/
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of applicants: ");
        n = in.nextInt();
        Lab3a A[] = new Lab3a[n];
        for (int i = 0; i < n; i++) {
            A[i] = new Lab3a();
            System.out.print("==============================\n");
            System.out.print("Input the information about the applicant.\n");
            System.out.print("==============================\n");
            System.out.print("Surname: ");
            surname = in.next();
            System.out.print("Name: ");
            name = in.next();
            System.out.print("Patronymic: ");
            patronymic = in.next();
            System.out.print("Adress: ");
            adress = in.next();
            System.out.print("Bank account number: ");
            BankAccountNumber = in.nextInt();
            System.out.print("Credit Card Number: ");
            CreditCardNumber = in.nextInt();
            A[i].setTun(surname, name, patronymic, adress, BankAccountNumber, CreditCardNumber);
        }
        int m = 0;
        while (m == 0) {
            int num;
            System.out.println("..........Choose an option: ...........");
            System.out.println("1) List of a list of customers in alphabetical order;");
            System.out.println("2) List of customers  who have a credit card number at a given interval.");
            /* System.out.println("3) Best applicants and semi-passing applicants");*/
            System.out.println("3) Exit");
            num = in.nextInt();
            switch (num) {
                case 1: {
                    sort(A);
                    break;
                }
                case 2: {
                    int kk1, kk2;
                    System.out.print("Enter the left and right ends of the range ");
                    kk1 = in.nextInt();
                    kk2 = in.nextInt();
                    listRange(A, kk1, kk2);
                    break;
                }
               /* case 3: {
                    int m2;
                    System.out.print("Set the number of best applicants: "); m2 = in.nextInt();
                    listthebest(A, n, m2, passingpoint);
                    break;
                }*/
                case 3: {
                    System.exit(0);
                    break;
                }

            }
        }


        in.close();
    }

    @Override
    public int compare(Lab3a o1, Lab3a o2) {
        return 0;
    }

    @Override
    public String toString() {
        return "Lab3a{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", adress='" + adress + '\'' +
                ", BankAccountNumber=" + BankAccountNumber +
                ", CreditCardNumber=" + CreditCardNumber +
                '}';

    }

}

/*
private static void sort(ArrayList<Lab3a>)
*/
