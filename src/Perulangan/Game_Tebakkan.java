package Perulangan;

import java.util.Scanner;

public class Game_Tebakkan {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int kunci = (int)(Math.random() * 100);
        int angka, percobaan = 0;
        
        System.out.println("*** Game Tebakkan Angka ***\n");
        
        do
        {
            System.out.print("Masukkan tebakkan angka anda : ");
            angka = masuk.nextInt();
            
            percobaan++;
            
            if (angka > kunci)
                System.out.println("Terlalu besar");
        
            else if (angka < kunci)
                System.out.println("Terlalu kecil");
        
            else
                System.out.println("Anda benar, dengan " + percobaan + " langkah");
        }
        while (angka != kunci);
        
    }
    
}
