package Tugas;

import java.util.Scanner;

public class Tugas2_No1 {

    public static void main(String[] args) {
        int p, l, r, a, t, pilihan;
        double L, K, hipotenusa;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Penghitung Luas dan Keliling Bangun Datar ***\n");
        
        System.out.println("================== Menu Utama ========================\n");
        
        System.out.println("Apakah yang ingin anda cari?");
        System.out.println("(1)Menghitung Luas dan Keliling Persegi Panjang");
        System.out.println("(2)Menghitung Luas dan Keliling Lingkaran");
        System.out.println("(3)Menghitung Luas dan Keliling Segitiga Siku-siku");
        
        System.out.print("\nInput pilihan anda dengan angka diatas : ");
        pilihan = masuk.nextInt();
        
        System.out.println("======================================================");
        
        switch (pilihan)
        {
            case 1 :
                System.out.printf("%-25s%-2c" , "Input panjangnya" , ':');
                p = masuk.nextInt();
                System.out.printf("%-25s%-2c" , "Input lebarnya" , ':');
                l = masuk.nextInt();
                
                L = p * l;
                K = 2 * (p + l);
                
                System.out.println("\nHasilnya adalah");
                System.out.printf("%-25s%-2c%.2f\n" , "Luas" , ':' , L);
                System.out.printf("%-25s%-2c%.2f\n" , "Keliling" , ':' , K);
                break;
                
            case 2 :
                System.out.printf("%-25s%-2c" , "Input jari-jarinya" , ':');
                r = masuk.nextInt();
                
                L = (Math.PI) * r * r;
                K = 2 * (Math.PI) * r;
                
                System.out.println("\nHasilnya adalah");
                System.out.printf("%-25s%-2c%.2f\n" , "Luas" , ':' , L);
                System.out.printf("%-25s%-2c%.2f\n" , "Keliling" , ':' , K);
                break;
                
            case 3 :
                System.out.printf("%-25s%-2c" , "Input alasnya" , ':');
                a = masuk.nextInt();
                System.out.printf("%-25s%-2c" , "Input tingginya" , ':');
                t = masuk.nextInt();
                System.out.printf("%-25s%-2c" , "Input sisi miringnya" , ':');
                hipotenusa = masuk.nextInt();
                
                L = (a * t) / 2;
                K = a + t + hipotenusa;
                
                System.out.println("\nHasilnya adalah");
                System.out.printf("%-25s%-2c%.2f\n" , "Luas" , ':' , L);
                System.out.printf("%-25s%-2c%.2f\n" , "Keliling" , ':' , K);
                break;
                
            default :
                System.out.println("Data tak ditemukan, program dihentikan...");
                break;
        }
                
    }
    
}
