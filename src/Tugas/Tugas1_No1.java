package Tugas;

import java.util.Scanner;

public class Tugas1_No1 {

    public static void main(String[] args) {
        float bil1, bil2;
        float jumlah, kurang, kali, bagi;
        
        System.out.println("*** Program Aritmatika Dasar *** \n");
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.printf("%-30s%-2c" , "Masukkan operator pertama" , ':');
        bil1 = masuk.nextFloat();
        System.out.printf("%-30s%-2c" , "Masukkan operator kedua" , ':');
        bil2 = masuk.nextFloat();
        
        jumlah = bil1 + bil2;
        kurang = bil1 - bil2;
        kali = bil1 * bil2;
        bagi = bil1 / bil2;
        
        System.out.printf("%-30s%-2c%.2f\n" , "Hasil penjumlahan" , ':', jumlah);
        System.out.printf("%-30s%-2c%.2f\n" , "Hasil pengurangan" , ':', kurang);
        System.out.printf("%-30s%-2c%.2f\n" , "Hasil perkalian" , ':', kali);
        System.out.printf("%-30s%-2c%.2f\n" , "Hasil pembagian" , ':', bagi);
            
    }   
}
