package Tugas;

import java.util.Scanner;

public class Tugas2_No2 {

    public static void main(String[] args) {
        float berat, tinggi, IMT;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Indeks Massa Tubuh (IMT) ***\n");
        
        System.out.print("Input Berat Badan Anda (kg) : ");
        berat = masuk.nextFloat();
        System.out.print("Input Tinggi Badan Anda (m) : ");
        tinggi = masuk.nextFloat();
        
        IMT = (float)berat / (float)(tinggi * tinggi);
        
        System.out.println("=========================================");
        
        if (IMT <= 18.5)
        {
            System.out.printf("%-6s%.2f%30s\n","IMT = ",IMT,"(Anda Termasuk Kurus)");
        }
        else if (IMT > 18.5 && IMT <= 25)
        {
            System.out.printf("%-6s%.2f%30s\n","IMT = ",IMT,"(Anda Termasuk Normal)");
        }
        else if (IMT > 25 && IMT <= 30)
        {
            System.out.printf("%-6s%.2f%30s\n","IMT = ",IMT,"(Anda Termasuk Gemuk)");
        }
        else if (IMT > 30)
        {
            System.out.printf("%-6s%.2f%30s\n","IMT = ",IMT,"(Anda Termasuk Kegemukan)");
        }
        else
        {
            System.out.println("Data tidak ditemukan");
        }
    }
    
}
