package Perulangan;

import java.util.Scanner;

public class Faktorial {

    public static void main(String[] args) {
        int i, n;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Penentu Faktorial Bilangan ***\n");
        
        System.out.print("Masukkan bilangan yang anda inginkan : ");
        n = masuk.nextInt();
        
        int total = n;
        
        if (n < 0)
            System.out.println("Invalid");
        
        if (n == 0 || n == 1)
            System.out.println("1");
        
        for (i = 1; i < n; i++)
        {
            total *= n-i;  
        }
        
        System.out.println("Faktorial " + n + " adalah " + total);
    }
    
}
