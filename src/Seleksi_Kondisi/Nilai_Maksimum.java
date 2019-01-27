package Seleksi_Kondisi;

import java.util.Scanner;

public class Nilai_Maksimum {

    public static void main(String[] args) {
        int a,b,c;
        
        System.out.println(" *** PROGRAM PENENTU BILANGAN TERBESAR *** \n");
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.print(" Masukkan bilangan pertama = ");
        a = masuk.nextInt();
        System.out.print(" Masukkan bilangan kedua   = ");
        b = masuk.nextInt();
        System.out.print(" Masukkan bilangan ketiga  = ");
        c = masuk.nextInt();
        
        System.out.println("\n Hasilnya adalah :");
        if (a > b && a > c)        
            System.out.println(" Bilangan terbesarnya = " + a);
        
        else if (b > a && b > c)        
            System.out.println(" Bilangan terbesarnya = " + b);
        
        else        
            System.out.println(" Bilangan terbesarnya = " + c);
            
    }
    
}
