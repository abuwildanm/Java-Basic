package Method;

import java.util.Scanner;

public class Faktor {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int bil;
        
        System.out.println("*** Program Pemfaktoran ***\n");
        
        System.out.print("Masukkan bilangannya    : ");
        bil = masuk.nextInt();
        
//        System.out.println(faktor(bil));
        System.out.println("Faktor-faktornya        : ");
        faktor(bil);
    }
    
    public static void faktor(int bil) {
        int i = 1;
        
        while (i <= bil)
        {
            if (bil % i == 0)
                System.out.println(i);
            
            i++;
        }
        
//        System.out.println("Faktor-faktornya        : " + i);
        
//        return i;
    }
    
}
