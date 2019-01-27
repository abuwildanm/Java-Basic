package Method;

import java.util.Scanner;

public class Bilangan_Prima {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int bil;
        
        System.out.println("*** Program Penentu Bilangan Prima Dengan Method ***\n");
        
        System.out.print("Masukkan bilangannya : ");
        bil = masuk.nextInt();
        
        for (int i = 1; i <= 100; i++) {
            if (!prima(i))
                System.out.println(i);
        }
    }
    
    public static boolean prima(int angka) {
        int faktor = 0;
        
        if (angka <= 1)
            System.out.println("Bukan Bilangan Prima");
        
        for (int i = 2; i <= angka; i++) 
        {
            if (angka % i == 0)
                faktor++;
        }
        
        if (faktor > 1)
            return true; // "Bukan Bilangan Prima";
            
        else 
            return false; // "Bilangan Prima";
    }
    
}
