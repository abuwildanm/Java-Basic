package Tugas;

import java.util.Scanner;

public class Tugas5_No1 {

    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        
        int pilihan, n, r;
        
        System.out.println("*** Program Penghitung Kombinasi dan Permutasi ***\n");
        
        while(true)
        {
            System.out.println("=================== Menu Utama ====================");
            System.out.println("1. MENGHITUNG PERMUTASI");
            System.out.println("2. MENGHITUNG KOMBINASI");
            System.out.println("3. KELUAR");
            System.out.println("===================================================");
            System.out.print("   MASUKKAN PILIHAN ANDA : ");
            pilihan = masuk.nextInt();
            System.out.println("\n---------------------------------------------------");
            
            if (pilihan == 3)
                break;
            
            if (pilihan != 1 && pilihan != 2 && pilihan != 3) {
                System.out.println("PILIHAN ANDA SALAH !");
                break;
            }
            
            System.out.print("Masukkan nilai n : ");
            n = masuk.nextInt();
            System.out.print("Masukkan nilai r : ");
            r = masuk.nextInt();
            System.out.println("");
            
            switch (pilihan) {
                case 1 : Permutasi(n, r); break;
                case 2 : Kombinasi(n, r); break;
            }
        }
    }
    
    public static int Faktorial(int bil) {
        if (bil == 0 || bil == 1)
            return 1;
        else
            return (bil * Faktorial(bil-1));
    }
    
    public static void Permutasi(int n, int r) {
//        int hasil1 = n; // hasil1 = n!
//        int hasil3 = n-r; // hasil3 = (n-r)!
//        int total;
//        
//        for (int i = 1; i < n; i++) 
//            hasil1 = hasil1 * (n-i);
//        
//        for (int i = 1; i < n-r; i++)
//            hasil3 = hasil3 * (n-r-i);
//        
//        total = hasil1 / hasil3;

        int total = Faktorial(n) / Faktorial(n-r);
        
        System.out.println("        n!");
        System.out.println("nPr = ------ = " + total);
        System.out.println("      (n-r)!");
        System.out.println("\nHasil Permutasinya adalah : " + total);
        System.out.println("---------------------------------------------------\n");
    }
    
    public static void Kombinasi(int n, int r) {
//        int hasil1 = n; // hasil1 = n! 
//        int hasil2 = r; // hasil2 = r!
//        int hasil3 = n-r; // hasil3 = (n-r)!
//        int total;
//        
//        for (int i = 1; i < n; i++)
//            hasil1 = hasil1 * (n-i);
//        
//        for (int i = 1; i < r; i++)
//            hasil2 = hasil2 * (r-i);
//        
//        for (int i = 1; i < n-r; i++)
//            hasil3 = hasil3 * (n-r-i);
//        
//        total = hasil1 / (hasil2 * hasil3);
        
        int total = Faktorial(n) / (Faktorial(r) * Faktorial(n-r));
        
        System.out.println("          n!");
        System.out.println("nPr = ----------- = " + total);
        System.out.println("      r! x (n-r)!");
        System.out.println("\nHasil Kombinasinya adalah : " + total);
        System.out.println("---------------------------------------------------\n");
    }
}
