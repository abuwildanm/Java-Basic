package Method;

import java.util.Scanner;
import java.util.Arrays;

public class Isi_Array {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int[] deret;
        int panjang;
        
        System.out.println("*** Program Penampil Isi Array ***\n");
        
        System.out.print("Masukkan panjang array-nya : ");
        panjang = masuk.nextInt();
        System.out.println("");
        
        deret = new int[panjang];
        
        for (int i = 0; i < deret.length; i++) {
            System.out.print("Masukkan isi array indeks ke - " + i + " : ");
            deret[i] = masuk.nextInt();
        }
        System.out.println("");
        
        Tampilkan(deret);
    }
    
    public static void Tampilkan(int[] deret) {
//        for (int i = 0; i < deret.length; i++) {
//            System.out.println(deret[i]);
//        }
        
        System.out.println("Hasilnya : " + Arrays.toString(deret));
    }
}
