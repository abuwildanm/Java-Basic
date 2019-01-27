package Tugas;

import java.util.Scanner;
import java.util.Arrays;

public class Tugas4_No1 {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int[] data = new int[0];
        int pilihan, jumlah = 0, max, min, banyak;
        double rata;
        String pilih;
        
        System.out.println("*** Program Statistika Dasar ***\n");
        
        while (true)
        {
            System.out.println("================= Menu Utama ====================");
            System.out.println("1. INPUT DATA" + "\t\t5. MAX");
            System.out.println("2. LIHAT DATA" + "\t\t6. MIN");
            System.out.println("3. AVERAGE" + "\t\t7. KELUAR");
            System.out.println("4. SUM");
            System.out.println("=================================================");
            System.out.print("   MASUKKAN PILIHAN ANDA : ");
            pilihan = masuk.nextInt();
            System.out.println("\n-------------------------------------------------");
            
            if (pilihan == 7)
                break;
            
            switch (pilihan)
            {
                case 1 :
                    System.out.print("Masukkan banyaknya data : ");
                    banyak = masuk.nextInt();
                    System.out.println("");
                    
                    data = new int[banyak];
                    
                    for (int i = 0; i < data.length; i++)
                    {
                        System.out.print("Input data ke - " + (i+1) + " : ");
                        data[i] = masuk.nextInt();
                    }
                    
                    System.out.println("\n***********************************************");
                    System.out.println("*             Input Data Berhasil !           *");
                    System.out.println("***********************************************\n");
                    
                    System.out.print("Apakah anda ingin kembali ke Menu Utama? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;
                    
                case 2 :
                    System.out.println("Data : " + Arrays.toString(data));
                    
                    System.out.print("\nApakah anda ingin kembali ke Menu Utama? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;
                    
                case 3 :
                    for (int i = 0; i < data.length; i++)
                    {
                        jumlah += data[i];
                    }
                    
                    rata = (float) jumlah / data.length;
                    System.out.println("Rata-ratanya : " + rata);
                    
                    System.out.print("\nApakah anda ingin kembali ke Menu Utama? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;
                    
                case 4 :
                    for (int i = 0; i < data.length; i++)
                    {
                        jumlah += data[i];
                    }
                    
                    System.out.println("Jumlah datanya : " + jumlah);
                    
                    System.out.print("\nApakah anda ingin kembali ke Menu Utama? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;
                    
                case 5 :
                    max = data[0];
                    for (int i = 1; i < data.length; i++)
                    {
                        if (data[i] > max)
                            max = data[i];
                    }
                    
                    System.out.println("Nilai Maksimumnya : " + max);
                    
                    System.out.print("\nApakah anda ingin kembali ke Menu Utama? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;
                    
                case 6 :
                    min = data[0];
                    for (int i = 1; i < data.length; i++)
                    {
                        if (data[i] < min)
                            min = data[i];
                    }
                    
                    System.out.println("Nilai Minimumnya : " + min);
                    
                    System.out.print("\nApakah anda ingin kembali ke Menu Utama? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;
                    
                default :
                    System.out.println("PILIHAN ANDA SALAH !");
                    System.out.println("------------------------------------------------\n");
                    break;
            }
        }
    }
    
}
