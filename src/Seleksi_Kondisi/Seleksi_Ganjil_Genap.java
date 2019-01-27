package Seleksi_Kondisi;

import java.util.Scanner;

public class Seleksi_Ganjil_Genap {

    public static void main(String[] args) {
        int a;
        
        System.out.println(" *** PROGRAM PENENTU BILANGAN *** \n");
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.print(" Masukkan bilangannya = ");
        a = masuk.nextInt();
        
        System.out.println("\n Hasilnya adalah : ");
        if (a%2 == 0)
        {
            System.out.println(" Bilangan Genap");
        }
        else
        {
            System.out.println(" Bilangan Ganjil");
        }
    }
    
}
