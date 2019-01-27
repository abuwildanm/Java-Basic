package Tugas;

import java.util.Scanner;

public class Tugas5_No2 {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int bil;
        
        System.out.println("*** Program Penampil Bilangan Prima ***\n");
        
        System.out.print("Masukkan bilangan prima : ");
        bil = masuk.nextInt();

        BacaPrima(bil);
        TampilkanPrima(100);
    }
    
    public static boolean CekPrima(int angka) {
        int faktor = 0; // Untuk membantu penghitungan
        for (int i = 2; i <= angka; i++) {
            if(angka % i == 0) {
                faktor++; // Perbaharui nilai counter
            }
        }
        
        if(angka > 0 && faktor == 1)
            return true;
        
        return false;
    }
    
    public static void BacaPrima(int angka) {
        if(CekPrima(angka))
            System.out.println("Bilangan " + angka + " termasuk bilangan prima");
        
        else
            System.out.println("Bilangan " + angka + " termasuk bukan bilangan prima");
    }
    
    public static void TampilkanPrima(int batas) {
        System.out.print("Program menentukan bilangan prima 1 - 100\n");
        for (int i = 1; i <= batas; i++) {
            if(CekPrima(i))
                System.out.print(i + " ");
        }
        System.out.println("");
    }
}
