package Array;

import java.util.Scanner;

public class Cari_Indeks {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int[] angka = {2, 5, 7, -3, 5, 6, 1};
        int cari;
        
        System.out.println("*** Program Untuk Mencari Indeks Elemen Array ***\n");
        
        System.out.print("Daftar angka yang ada : { ");
        for (int i = 0; i < angka.length; i++) 
        {
            System.out.print(angka[i] + ", ");
        }
        System.out.println("}\n");
        
        System.out.print("Masukkan angka yang ingin dicari : ");
        cari = masuk.nextInt();
        
        for (int i = 0; i < angka.length; i++)
        {
            if (cari == angka[i])
            {
                System.out.println("\nAngka anda berada pada indeks ke : " + i);
                System.exit(0);
            }
            
            else
            {
                System.out.println("\nTidak Ditemukan");
                System.exit(0);
            }
        }
        
//        if (cari == 2)
//            System.out.println(angka[0]);
//        
//        if (cari == 5)
//            System.out.println(angka[1] + angka[4]);
//        
//        if (cari == 7)
//            System.out.println(angka[2]);
//        
//        if (cari == -3)
//            System.out.println(angka[3]);
//        
//        if (cari == 6)
//            System.out.println(angka[5]);
//        
//        if (cari == 1)
//            System.out.println(angka[6]);
    }
    
}
