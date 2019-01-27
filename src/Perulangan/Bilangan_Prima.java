package Perulangan;

import java.util.Scanner;

public class Bilangan_Prima {

    public static void main(String[] args) {
        int i, bil;
        boolean prima = true;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Penentu Bilangan Prima ***\n");
        
        System.out.print("Masukkan bilangan yang anda inginkan : ");
        bil = masuk.nextInt();
        
        if (bil <= 1)
            prima = false;
        
        for (i = 2; i < bil; i++)
        {
            if (bil % i == 0)
            {
                prima = false;
                break;
            }
        }
        
        if (prima == true)
            System.out.println(bil + " adalah bilangan PRIMA");
            
        else
            System.out.println(bil + " adalah bilangan BUKAN PRIMA");
    }
    
}

