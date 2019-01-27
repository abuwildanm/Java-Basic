package Perulangan;

import java.util.Scanner;

public class Tabel_Perkalian {

    public static void main(String[] args) {
        int i, j, n;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Tabel Perkalian ***\n");
        
        System.out.print("Masukkan bilangan yang anda inginkan : ");
        n = masuk.nextInt();
        
        System.out.println("");
        
        for (i = 0; i <= n; i++)
        {
            System.out.print(i + "\t");
        }
        
        System.out.println("");
        
        for (i = 1; i <= n; i++)
        {
            System.out.print(i + "\t");
            
            for (j = 1; j <= n; j++)
            {
                System.out.print(i * j + "\t");
            }
            System.out.println("");
        }
    }
    
}
