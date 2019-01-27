package Perulangan;

import java.util.Scanner;

public class Kombinasi_Angka {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int banyak, acak, angka;
        int[] deret;
        
        System.out.println("*** Program Kombinasi Angka ***\n");
        
        System.out.print("Masukkan banyaknya angka : ");
        banyak = masuk.nextInt();
        
        deret = new int[banyak];
        
        acak = (int)(Math.random() * 10); //kemungkinan kemunculan angka 0 - 9
        
        angka = deret[0];
        
        for (int i = 0; i < banyak; i++) 
        {   
            deret[i] = acak;
            System.out.println(deret[i]);
            
            if (angka == deret[i])
            {
                System.out.println(angka);
                angka = acak - 1;
            }
            
            else
                System.out.println(deret[i]);
        }
    }
    
}
