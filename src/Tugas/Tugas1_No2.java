package Tugas;

import java.util.Scanner;

public class Tugas1_No2 {

    public static void main(String[] args) {
        String nama, kelurahan;
        float awal, akhir, biaya, ppj;
        float pakai, tarif, PPJ, total;
        
        System.out.println("*** Program Penghitung Pemakaian Listrik Sederhana *** \n");
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.printf("%-36s%-2c" , "Masukkan nama" , ':');
        nama = masuk.nextLine();
        System.out.printf("%-36s%-2c" , "Masukkan kelurahan" , ':');
        kelurahan = masuk.nextLine();
        System.out.printf("%-36s%-2c" , "Masukkan posisi awal Kwh Meter" , ':');
        awal = masuk.nextFloat();
        System.out.printf("%-36s%-2c" , "Masukkan posisi akhir Kwh Meter" , ':');
        akhir = masuk.nextFloat();
        System.out.printf("%-36s%-2c" , "Masukkan biaya beban saat ini" , ':');
        biaya = masuk.nextFloat();
        System.out.printf("%-36s%-2c" , "Masukkan PPJ (dalam persen)" , ':');
        ppj = masuk.nextFloat();
        
        pakai = akhir - awal;
        tarif = biaya * 1000;
        PPJ = (ppj/100) * tarif;
        total = tarif + PPJ;
        
        System.out.println("\n=================== PLN" + " " + kelurahan + " ========================");
        System.out.println("Nama                    : " + nama);
        System.out.println("Kelurahan               : " + kelurahan);
        System.out.println("Pemakaian bulan ini     : " + pakai + " " + "Kwh Meter");
        System.out.println("Tarif listrik           : Rp" + " " + tarif + ",-");
        System.out.println("PPJ                     : Rp" + " " + PPJ + ",-");
        System.out.println("Total bayar             : Rp" + " " + total + ",-");
        System.out.println("=====================================================");

    }   
}
