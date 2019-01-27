package Tugas;

import java.util.Scanner;

public class Tugas4_No2 {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        String[][] data = {{"Jenis", "Harga", "Diskon", "AC", "Colokan"},
                            {"Ekonomi", "50000", "2%", "Tidak ada", "Tidak ada"},
                            {"Bisnis", "100000", "5%", "Ada", "Tidak ada"},
                            {"Eksekutif", "200000", "7%", "Ada", "Tidak ada"},
                            {"Pariwisata", "300000", "10%", "Ada", "Ada"}};
        String pilih, jenis = null;
        int[] harga = new int[4];
        int pilihan, kursi = 0;
        double total = 0;
        
        System.out.println(data[1][0]);
        
        System.out.println("*** Program Pemesanan Tiket Kereta Api ***\n");
        
        for (int i = 1; i < data.length; i++) //konversi harga
        {
            for (int j = 1; j < data.length-3; j++) 
            {
                harga[i-1] = Integer.parseInt(data[i][j]);
            }
        }
        
        while (true)
        {
            System.out.println("============================ Menu Utama ==============================");
            System.out.println("1. MELIHAT DAFTAR KERETA API");
            System.out.println("2. MELIHAT DAFTAR KERETA API YANG ADA AC");
            System.out.println("3. MELIHAT DAFTAR KERETA API YANG ADA COLOKAN");
            System.out.println("4. MEMESAN TIKET KERETA API");
            System.out.println("5. MELIHAT PESANAN TIKET");
            System.out.println("======================================================================");
            System.out.print("   MASUKKAN PILIHAN ANDA : ");
            pilihan = masuk.nextInt();
            System.out.println("\n----------------------------------------------------------------------");
            
            switch (pilihan)
            {
                case 1 :
                    for (int i = 0; i < data.length; i++) 
                    {
                        for (int j = 0; j <data[i].length; j++)
                        {
                            System.out.printf("%-15s",data[i][j]);
                        }
                        System.out.println("");
                    }
                    System.out.println("----------------------------------------------------------------------\n");
                    
                    System.out.print("Apakah anda ingin kembali ke Menu Utama? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;
                    
                case 2 :
                    for (int i = 0; i < data.length; i++) 
                    {
                        for (int j = 0; j <data[i].length; j++)
                        {   
                            if (i == 1)
                                continue;
                            
                            System.out.printf("%-15s",data[i][j]);
                        }
                        System.out.println("");
                    }
                    System.out.println("----------------------------------------------------------------------\n");
                    
                    System.out.print("Apakah anda ingin kembali ke Menu Utama? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;
                    
                case 3 :
                    for (int i = 0; i < data.length; i++) 
                    {
                        for (int j = 0; j <data[i].length; j++)
                        {   
                            if (i == 1 || i == 2 || i == 3)
                                continue;
                            
                            System.out.printf("%-15s",data[i][j]);
                        }
                        System.out.println("");
                    }
                    System.out.println("----------------------------------------------------------------------\n");
                    
                    System.out.print("Apakah anda ingin kembali ke Menu Utama? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;
                    
                case 4 :
                    System.out.print("Apakah jenis kereta yang ingin anda pilih?    : ");
                    jenis = masuk.next();
                    
                    if (jenis.equals("Ekonomi") || jenis.equals("ekonomi"))
                    {
                        System.out.print("Berapa kursi yang ingin anda pesan?           : ");
                        kursi = masuk.nextInt();
                        
                        total = (harga[0] - (harga[0] * 0.02)) * kursi;
                    }
                    
                    else if (jenis.equals("Bisnis") || jenis.equals("bisnis"))
                    {
                        System.out.print("Berapa kursi yang ingin anda pesan?           : ");
                        kursi = masuk.nextInt();
                        
                        total = (harga[1] - (harga[1] * 0.05)) * kursi;
                    }
                    
                    else if (jenis.equals("Eksekutif") || jenis.equals("eksekutif"))
                    {
                        System.out.print("Berapa kursi yang ingin anda pesan?           : ");
                        kursi = masuk.nextInt();
                        
                        total = (harga[2] - (harga[2] * 0.07)) * kursi;
                    }
                    
                    else if (jenis.equals("Pariwisata") || jenis.equals("pariwisata"))
                    {
                        System.out.print("Berapa kursi yang ingin anda pesan?           : ");
                        kursi = masuk.nextInt();
                        
                        total = (harga[3] - (harga[3] * 0.1)) * kursi;
                    }
                    
                    System.out.print("\nApakah anda ingin kembali ke Menu Utama? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;
                    
                case 5 :
                    System.out.println("\n------------------------------------------------");
                    System.out.println("           PT. Kereta Api Indonesia             ");
                    System.out.println("------------------------------------------------");
                    System.out.println("Nama            : Abu Wildan Mucholladin");
                    System.out.println("Jenis kereta    : " + jenis);
                    System.out.println("Banyaknya kursi : " + kursi);
                    System.out.println("Total bayar     : " + total);
                    System.out.println("------------------------------------------------\n");
                    
                    System.out.print("Apakah anda ingin kembali ke Menu Utama? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;
                    
                default :
                    System.exit(0);
                    
            }
        }
    }
    
}
