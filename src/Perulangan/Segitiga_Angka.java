package Perulangan;

import java.util.Scanner;

public class Segitiga_Angka {

    public static void main(String[] args) {
        int i, j, ujung;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Segitiga Angka ***\n");
        
        System.out.print("Masukkan bilangan yang anda inginkan : ");
        ujung = masuk.nextInt();
        
        for (i = 1; i <= ujung; i++) //bagian atas
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        
        for (i = ujung-1; i >= 1; i--) //bagian bawah
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        
//        for (i = 1; i < ujung; i++) //bagian bawah boleh pake ini
//        {
//            for (j = 1; j <= ujung-i; j++)
//            {
//                System.out.print(j + "");
//            }
//            System.out.println("");
//        }
    }
    
}
