package Perulangan;

import java.util.Scanner;

public class Piramida_Angka {

    public static void main(String[] args) {
        int i, j, n;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Piramida Angka ***\n");
        
        System.out.print("Masukkan bilangan yang anda inginkan : ");
        n = masuk.nextInt();
        
        for (i = 1; i <= n; i++) //menentukan barisnya
        {
            for (j = n; j != i; j--) //spasi
            {
                System.out.print(" " + " ");
            }
            
            for (j = 1; j <= i; j++) //angka separuh kiri
            {
                System.out.print(j + " ");
            }
            
            for (j = i-1; j >= 1; j--) //angka separuh kanan
            {
                System.out.print(j + " ");
            }
            
            System.out.println("");
                        
        }
    }
    
}
