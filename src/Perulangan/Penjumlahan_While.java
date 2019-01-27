package Perulangan;

import java.util.Scanner;

public class Penjumlahan_While {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int jumlah = 0;
        
        int angka = masuk.nextInt();
        
        do
        {
            jumlah = jumlah + angka;
            
            if (jumlah < 125)
            {
                System.out.print(angka + " ");
            }
            
            angka++;
        }
        while (jumlah < 125);
        
//        

    }
    
}
