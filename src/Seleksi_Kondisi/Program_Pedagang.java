package Seleksi_Kondisi;

import java.util.Scanner;

public class Program_Pedagang {

    public static void main(String[] args) {
        int barang, kedelai, bulan;
        double untung, berat;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Analisis Keuntungan Penjualan ***\n");
        
        System.out.println("Apakah yang ingin anda jual?\n(1)Tempe\n(2)Durian\n");
        
        System.out.print("Jawab (dengan mengetik angkanya) : ");
        barang = masuk.nextInt();
        
        if (barang == 1)
        {
            System.out.println("\n==============================================================");
            System.out.print("Input harga kedelai per kg          : Rp ");
            kedelai = masuk.nextInt();
            
            if (kedelai < 0)
            {
                System.out.println("Invalid");
            }
            else if (kedelai < 5000)
            {
                untung = 5000 - (0.6 * kedelai);
                
                System.out.println("Keuntungan 1 kotak tempenya adalah  : Rp " + untung);
            }
            else if (kedelai >= 5000 && kedelai < 10000)
            {
                untung = 5000 - (0.4 * kedelai);
                
                System.out.println("Keuntungan 1 kotak tempenya adalah  : Rp " + untung);
            }
            else
            {
                System.out.println("Anda merugi !");
            }
        }    
            
        else if (barang == 2)
        {
            System.out.println("\n==================================================================");
            System.out.println("Diantara bulan apakah anda berjualan?\n(1)Maret - September\n(2)Oktober - Februari\n");
            
            System.out.print("Input bulan ketika anda berjualan (dengan mengetik angkanya)  : ");
            bulan = masuk.nextInt();
            System.out.print("Input berat durian yang ingin anda jual (dalam kg)            : ");
            berat = masuk.nextDouble();
            
            if (bulan == 1)
            {
                untung = berat * 4000;
                System.out.println("\n==================================================================");
                System.out.println("Keuntungan anda dengan durian seberat " + berat + " kg" + " adalah " + untung);
            }
            else if (bulan == 2)
            {
                untung = berat * 3000;
                System.out.println("\n==================================================================");
                System.out.println("Keuntungan anda dengan durian seberat " + berat + " kg" + " adalah " + untung);
            }
            else
            {
                System.out.println("Invalid");
            }                        
        }
        
        else
        {
            System.out.println("Invalid");
        }
    }
    
}
