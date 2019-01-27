package Method;

import java.util.Scanner;
import java.util.Arrays;

public class Urut_Array {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int[] deret;
        int banyak;
        
        System.out.println("*** Program Pengurut Array ***\n");
        
        System.out.print("Masukkan banyaknya angka : ");
        banyak = masuk.nextInt();
        System.out.println("");
        
        deret = new int[banyak];
        
        for (int i = 0; i < deret.length; i++) {
            System.out.print("Masukkan isi indeks ke - " + i + " : ");
            deret[i] = masuk.nextInt();
        }
        
        System.out.println("Bilangan sebelum di sorting Bubble Sort : " + Arrays.toString(deret));
        
        Sort(deret);
    }
    
    public static void Sort(int[] deret) {
        System.out.println("\nProses Bubble Sort Secara Ascending");
        System.out.println("=====================================");
        for (int i = 0; i < deret.length; i++)
        {
            System.out.println("Iterasi " + i);
            
            for (int j = 0; j < deret.length-1; j++)
            {
                //	Tampilkan proses Iterasi
                if(deret[j] > deret[j+1])
                {
                    //	proses pertukaran bilangan
                    int tukar = deret[j];
                    deret[j] = deret[j+1];
                    deret[j+1] = tukar;
		}
                
                //	Tampilkan proses pertukaran tiap iterasi
		System.out.println(Arrays.toString(deret));
            }
            System.out.println("");
        }
        
        //	Tampilkan hasil akhir
	System.out.println("Hasil akhir setelah di sorting : " + Arrays.toString(deret));
    }
}
