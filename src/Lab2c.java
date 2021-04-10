import java.util.Scanner;
import javax.swing.*;

public class Lab2c {
    static void show(int[][] matr,int n)
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(matr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static int inint(String text)
    {
        int a=Integer.parseInt(JOptionPane.showInputDialog(text));
        return a;
    }
    public static void main(String[] Args)
    {
        Scanner in=new Scanner(System.in);

        System.out.println("введите размер матрицы:");
        int n = in.nextInt();
        int[][] matr=new int[n][n];

        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matr[i][j]= (int)(2*n*Math.random())-n;
            }
        }

        System.out.println();
        show(matr,n);
        System.out.println("введите 1- чтобы сделать сдвиг на к позиций вправо,2-влево,3-вверх,4 вниз");
        int a = in.nextInt();
        System.out.println("введите к");
        int k = in.nextInt();
        switch (a){
            case 1: {
                int per = 0;
                for (int l = 0; l < k; l++) {
                    for (int i = 0; i < n; i++) {
                        for (int j = n-2; j >-1 ; j--) {

                            per = matr[i][j];
                            matr[i][j] = matr[i][j+1];
                            matr[i][j+1] = per;
                        }
                    }
                }
                show(matr, n);
                break;
            }
            case 2: {
                int per = 0;
                for (int l = 0; l < k; l++) {
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n-1 ; j++) {

                            per = matr[i][j];
                            matr[i][j] = matr[i][j+1];
                            matr[i][j+1] = per;
                        }
                    }
                }
                show(matr, n);
                break;
            }
        case 3: {
            int per = 0;
            for (int l = 0; l < k; l++) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n - 1; j++) {

                        per = matr[j][i];
                        matr[j][i] = matr[j + 1][i];
                        matr[j + 1][i] = per;

                    }
                }
            }
            show(matr, n);
            break;
        }
            case 4: {
                int per = 0;
                for (int l = 0; l < k; l++) {
                    for (int i = 0; i < n; i++) {
                        for (int j = n-2; j >-1 ; j--) {

                            per = matr[j][i];
                            matr[j][i] = matr[j + 1][i];
                            matr[j + 1][i] = per;

                        }
                    }
                }
                show(matr, n);
                break;
            }
    }



    }
}