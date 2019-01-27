package Method;

import java.util.Scanner;
import java.util.Arrays;

public class Merge_Array {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int[] deret1, deret2;
        int panjang1, panjang2;
        
        System.out.println("*** Progam Menggabungkan Array ***\n");
        
        System.out.print("Masukkan panjang array I  : ");
        panjang1 = masuk.nextInt();
        System.out.print("Masukkan panjang array II : ");
        panjang2 = masuk.nextInt();
        System.out.println("");
        
        deret1 = new int[panjang1];
        deret2 = new int[panjang2];
        
        for (int i = 0; i < deret1.length; i++) {
            System.out.print("Masukkan isi array I pada indeks ke - " + i + " : ");
            deret1[i] = masuk.nextInt();
        }
        System.out.println("");
        
        for (int i = 0; i < deret2.length; i++) {
            System.out.print("Masukkan isi array II pada indeks ke - " + i + " : ");
            deret2[i] = masuk.nextInt();
        }
        System.out.println("");
        
        System.out.println("Hasil gabungannya : " + Arrays.toString(Gabung(deret1, deret2)));
    }
    
    public static int[] Gabung(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length + array2.length];
        
        for (int i = 0; i < array1.length; i++)
            array3[i] = array1[i];
        
        for (int i = array1.length; i < array3.length; i++)
            array3[i] = array2[i - array1.length];
        
        return array3;
    }
}
