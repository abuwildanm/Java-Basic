package Tugas;

import java.util.Scanner;

public class Tugas2_No3 {

    public static void main(String[] args) {
        int jamkerja, upah, lembur, denda, total;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Upah Pegawai ***\n");
        
        System.out.print("Input jam kerja pegawai per minggu : ");
        jamkerja = masuk.nextInt();
        
        if (jamkerja < 0)
        {
            System.out.println("Data tidak ditemukan");
        }
        else if (jamkerja > 60)
        {
            upah = 5000 * 60;
            lembur = 6000 * (jamkerja - 60);
            total = upah + lembur;
            
            System.out.printf("%-7s%-2c%-4s%d\n","Upah",'=',"Rp.",upah);
            System.out.printf("%-7s%-2c%-4s%d\n","Lembur",'=',"Rp.",lembur);
            System.out.printf("%-7s%-2c%-5s\n","Denda",'=',"Rp. 0");
            System.out.println("----------------------");
            System.out.printf("%-7s%-2c%-4s%d\n","Total",'=',"Rp.",total);
        }
        else if (jamkerja >= 50 && jamkerja <= 60)
        {
            upah = 5000 * jamkerja;
            total = upah;
            
            System.out.printf("%-7s%-2c%-4s%d\n","Upah",'=',"Rp.",upah);
            System.out.printf("%-7s%-2c%-5s\n","Lembur",'=',"Rp. 0");
            System.out.printf("%-7s%-2c%-5s\n","Denda",'=',"Rp. 0");
            System.out.println("----------------------");
            System.out.printf("%-7s%-2c%-4s%d\n","Total",'=',"Rp.",total);
        }
        else
        {
            upah = 5000 * jamkerja;
            denda = 1000 * (50 - jamkerja);
            total = upah - denda;
            
            System.out.printf("%-7s%-2c%-4s%d\n","Upah",'=',"Rp.",upah);
            System.out.printf("%-7s%-2c%-5s\n","Lembur",'=',"Rp. 0");
            System.out.printf("%-7s%-2c%-4s%d\n","Denda",'=',"Rp.",denda);
            System.out.println("----------------------");
            System.out.printf("%-7s%-2c%-4s%d\n","Total",'=',"Rp.",total);
        }
    }
    
}
