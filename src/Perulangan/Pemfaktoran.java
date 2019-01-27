package Perulangan;

import java.util.Scanner;

public class Pemfaktoran {

    public static void main(String[] args) {
        int i, n, faktor;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Pemfaktoran ***\n");
        
        System.out.print("Input bilangan yang ada inginkan : ");
        n = masuk.nextInt();
        
        System.out.println("\nFaktor-faktornya adalah :");
//        for (i = 1; i <= n; i++)
//        {
//            faktor = n % i;
//            
//            if (faktor == 0)
//                System.out.println(i);
//        }
        
        i = 1;
        
        while (i <= n)
        {
            faktor = n % i;
            
            if (faktor == 0)
                System.out.println(i);
            
            i++;
        }
    }
    
}
