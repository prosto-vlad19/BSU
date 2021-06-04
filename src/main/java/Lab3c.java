import java.util.Scanner;
public class Lab3c {
    private int NRe, NIm, DRe, DIm;

    public Lab3c() {
    };

    public Lab3c(int NRe, int NIm, int DRe, int DIm) {
        this.NRe = NRe;
        this.NIm = NIm;
        this.DRe = DRe;
        this.DIm = DIm;
    };

    public int getNRe() {
        return NRe;
    }

    public int getNIm() {
        return NIm;
    }

    public int getDRe() {
        return DRe;
    }

    public int getDIm() {
        return DIm;
    }

    public void setNRe(int NRe) {
        this.NRe = NRe;
    }

    public void setNIm(int NIm) {
        this.NIm = NIm;
    }

    public void setDRe(int DRe) {
        this.DRe = DRe;
    }

    public void setDIm(int DIm) {
        this.DIm = DIm;
    }

    public void setTun(int NRe, int NIm, int DRe, int DIm) {
        this.NRe = NRe;
        this.NIm = NIm;
        this.DRe = DRe;
        this.DIm = DIm;
    }



    @Override
    public String toString() {
        return "(" + NRe +
                " + " + NIm +
                "i, " + DRe +
                " + " + DIm +
                "i)";
    }

    public void add(Lab3c a) {
        if (a != null) {
            int n0 = NRe;
          /*  NRe = NRe*DRe + NIm*DIm;
            NIm = NIm*DRe - n0*DIm ;
            DRe = DRe*DRe + DIm*DIm;
            DIm = 0;*/
            int NRe0 = a.NRe/**a.DRe + a.NIm*a.DIm*/;
            int NIm0 = a.NIm/**a.DRe - a.NRe*a.DIm*/ ;
            int DRe0 = a.DRe/**a.DRe + a.DIm*a.DIm*/;
            int DIm0 = a.DIm;
            NRe = NRe*DRe0 + NRe0*DRe;
            NIm = NIm*DIm0 + NIm0*DIm;
            DRe*=DRe0;
            DIm*=DIm0;

        }
    }

    int Nod(int m, int n) {
        int nod = 1;
        for (int i = 1; i <= m; i++)
            if (m%i == 0 && n%i == 0) nod = i;
        return nod;
    }

    public void reduce() {
        int n = Nod (NRe, DRe);
        int m = Nod (NIm, DIm);
        NRe/=n;
        DRe/=n;
        NIm/=m;
        DIm/=m;
    }

    public static void transform (Lab3c[] a, int num) {
        if (num %2 == 1)
            for (int i = 0; i < num; i+=2)
            {a[i].add(a[i+1]); a[i].reduce();}
        else for (int i = 0; i < num-1; i+=2)
        { a[i].add(a[i+1]); a[i].reduce();}
    }

    public static void main(String[ ] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number of fractions: "); int n = in.nextInt();
        Lab3c F[] = new Lab3c[100];
        for (int i = 0; i < n; i++)
        {F[i] = new Lab3c();
            System.out.print("==============================\n");
            System.out.print("Input the information about the fraction.\n");
            System.out.print("==============================\n");
            System.out.print("Numerator Real Part: "); int NRe = in.nextInt();
            System.out.print("Numerator Imaginary Part: "); int NIm = in.nextInt();
            System.out.print("Denominator Real Part: "); int DRe = in.nextInt();
            System.out.print("Denominator Imaginary Part: "); int DIm = in.nextInt();
            if(DRe == 0 & DIm == 0) {
                System.out.print("Cannot divide by zero");
                System.exit(0);
            }

            F[i].setTun(NRe, NIm, DRe, DIm);
        }
        System.out.println("Initial array of fractions: ");
        for (int i = 0; i < n; i++) System.out.print(F[i].toString());
        System.out.println("\nTransformed array: ");
        transform (F, n);
        for (int i = 0; i < n; i++) System.out.print(F[i].toString());
    }
}