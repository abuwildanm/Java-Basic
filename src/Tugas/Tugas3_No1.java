package Tugas;

import java.util.Scanner;

public class Tugas3_No1 {

    public static void main(String[] args) {
        int i, j, k, n;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Segitiga Bintang ***\n");
        
        System.out.print("Masukkan bilangan yang anda inginkan : ");
        n = masuk.nextInt();
        
        for (i = 1; i <= n; i++)
        {
            for (j = n; j != i; j--)
            {
                System.out.print(" " + " ");
            }
            
            for (k = 1; k <= i; k++)
            {
                System.out.print("*" + " ");
            }
            
            System.out.println("");
        }
    }
    
}
