package functionalprogram2;

import java.util.Scanner;
public class functionalProgram2 {
    public static void main(String[] args) {
        int numberOfelements;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        numberOfelements = sc.nextInt();
        int[] array = new int[numberOfelements];
        for(int i = 0; i<numberOfelements; i++) {
            Scanner ar = new Scanner(System.in);
            array[i] = ar.nextInt();
        }
        int flag = 0;
        System.out.println("number of triplets are:");
        for(int i = 0; i<numberOfelements-2; i++){
            for(int j = 0; j<numberOfelements-1; j++){
                for(int k = 0; j<numberOfelements; k++){
                    if(array[i] + array[j] + array[k] == 0)
                    {  System.out.println(+array[i]+" " +array[j]+" " +array[k]+ " ");
                        flag = 1;}
                }
            }
        }
        if(flag == 0)
            System.out.println("0");
    }
}
