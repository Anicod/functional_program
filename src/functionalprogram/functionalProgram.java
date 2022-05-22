package functionalprogram;

import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class functionalProgram {

    static final int INPUT_INTEGER = 0;
    static final int INPUT_DOUBLE = 1;
    static final int INPUT_BOOLEAN = 2;

    public static void main(String[] args) {
        Random check = new Random();
        int choice = check.nextInt(3);
        switch (choice) {
            case 0:
                int m, n;
                Scanner sc = new Scanner(System.in);
                System.out.println("enter row and coulmn integer array:");
                m = sc.nextInt();
                n = sc.nextInt();
                int[][] array1 = new int[m][n];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        Scanner input = new Scanner(System.in);
                        array1[i][j] = input.nextInt();
                        System.out.println(" ");
                    }
                    System.out.println("");
                }

                PrintWriter writer = new PrintWriter(System.out);

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        writer.print(+array1[i][j] + " ");
                        System.out.println(" ");
                    }
                    writer.flush();
                }
                break;
            case 1:
                int p, q;
                Scanner ar = new Scanner(System.in);
                System.out.println("enter row and coulmn of double array:");
                p = ar.nextInt();
                q = ar.nextInt();
                double[][] array2 = new double[p][q];
                for (int i = 0; i < p; i++) {
                    for (int j = 0; j < q; j++) {
                        Scanner input1 = new Scanner(System.in);
                        array2[i][j] = input1.nextFloat();
                        System.out.println(" ");
                    }
                    System.out.println("");
                }
                PrintWriter writer1 = new PrintWriter(System.out);

                for (int i = 0; i < p; i++) {
                    for (int j = 0; j < q; j++) {
                        writer1.print(+array2[i][j] + " ");
                        System.out.println(" ");
                    }
                    writer1.flush();
                }
                break;

            default:
                int r, s;
                Scanner ar1 = new Scanner(System.in);
                System.out.println("enter row and coulmn boolian array:");
                r = ar1.nextInt();
                s = ar1.nextInt();
                boolean[][] array3 = new boolean[r][s];
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < s; j++) {
                        Scanner input3 = new Scanner(System.in);
                        array3[i][j] = input3.nextBoolean();
                        System.out.println(" ");

                    }
                    System.out.println("");
                }
                PrintWriter writer2 = new PrintWriter(System.out);

                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < s; j++) {
                        writer2.print(array3[i][j]);
                        System.out.println(" ");
                    }
                    writer2.flush();
                }
                break;


        }

    }
}




