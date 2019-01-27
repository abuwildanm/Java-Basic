package Array;

import java.util.Scanner;

public class Pengurutan_Array {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
//        int[] bilangan = {5, 12, 3, 19, 1, 47};
        int[] bilangan;
        int panjang, tukar;
        
        System.out.println("*** Program Pengurut Array Dengan Metode Bubble Sort ***\n");
        
        System.out.print("Masukkan panjang arraynya : ");
        panjang = masuk.nextInt();
        System.out.println("");
        
        bilangan = new int[panjang];
        
        for (int i = 0; i < bilangan.length; i++)
        {
            System.out.print("Masukkan elemen array ke - " + i + " : ");
            bilangan[i] = masuk.nextInt();
        }
        System.out.println("");
        
        //	Tampilkan bilangan
        System.out.println("Bilangan sebelum di sorting Bubble Sort : ");
        for (int i = 0; i < bilangan.length; i++) 
        {
            System.out.print(bilangan[i] + " ");
        }
        System.out.println("");
        
        //	Proses Bubble Sort
        System.out.println("\nProses Bubble Sort Secara Ascending");
        System.out.println("=====================================");
        for (int i = 0; i < bilangan.length; i++)
        {
            System.out.println("Iterasi " + i);
            
            for (int j = 0; j < bilangan.length-1; j++)
            {
                //	Tampilkan proses Iterasi
                if(bilangan[j] > bilangan[j+1])
                {
                    //	proses pertukaran bilangan
                    tukar = bilangan[j];
                    bilangan[j] = bilangan[j+1];
                    bilangan[j+1] = tukar;
		}
                
                for (int k = 0; k < bilangan.length; k++) 
                {
                    //	Tampilkan proses pertukaran tiap iterasi
                    System.out.print(bilangan[k] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
        //	Tampilkan hasil akhir
        System.out.println("Hasil akhir setelah di sorting : ");
        for (int i = 0; i < bilangan.length; i++) 
        {
            System.out.print(bilangan[i] + " ");
        }
        System.out.println("");
    }
    
}
