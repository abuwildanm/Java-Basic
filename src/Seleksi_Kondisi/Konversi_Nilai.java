package Seleksi_Kondisi;

import java.util.Scanner;

public class Konversi_Nilai {

    public static void main(String[] args) {
        float nilai;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan nilai anda : ");
        nilai = masuk.nextInt();
        
        if (nilai > 80 && nilai <= 100)
        {
            System.out.println("A");
        }
        else if (nilai > 75 && nilai <= 80)
        {
            System.out.println("B+");
        }
        else if (nilai > 70 && nilai <= 75)
        {
            System.out.println("B");
        }
        else if (nilai > 65 && nilai <= 70)
        {
            System.out.println("C+");
        }
        else if (nilai > 60 && nilai <= 65)
        {
            System.out.println("C");
        }
        else if (nilai > 55 && nilai <= 60)
        {
            System.out.println("D+");
        }
        else if (nilai > 50 && nilai <= 55)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("E");
        }
        
        
    }
    
}
