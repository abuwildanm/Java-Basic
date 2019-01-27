package Array;

import java.util.Scanner;

public class Contoh_Array {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        //deklarasi variabel biasa
        int jumlah = 0;
        
        //deklarasi array
        int[] deret;
        
        //instansiasi array
        deret = new int[6]; //indexnya berarti dari 0 sampai 5
        
        //pengisian index
        deret[0] = 4;
        deret[5] = 12;
        deret[5] = 34;
        deret[2] = -5;
        
        System.out.println(deret[5]);
        System.out.println(deret[1]);
//        System.out.println(deret[6]); //ini error karena index nya udah keluar
        System.out.println(deret);
        System.out.println("");
        
        for (int i = 0; i < 6; i++) {
            System.out.println(deret[i]);
            
        }
        System.out.println("");
        
        //deklarasi array
        String[] nama;
        
        //instansiasi array
        nama = new String[6]; //indexnya berarti dari 0 sampai 5
        
        //pengisian index
        nama[0] = "Giga";
        nama[5] = "Byte";
        nama[2] = "90";
        
        System.out.println(nama[5]);
        System.out.println(nama[1]);
//        System.out.println(deret[6]); //ini error karena index nya udah keluar
        System.out.println(nama);
        System.out.println("");
        
        for (int i = 0; i < 6; i++) {
            System.out.println(nama[i]);
            
        }
        System.out.println("");
        
        //inisialisasi array
        int[] deret1 = {3, 6, 12, -6, 30, 78};
        
        System.out.println(deret1.length);
        
        for (int i = 0; i < deret1.length; i++) {
            jumlah += deret1[i];
            
        }
        
        double rata = (double)jumlah/deret1.length;
        
        System.out.println(rata);
        
        int[] deret2;
        
        System.out.print("Masukkan panjang array yang diinginkan : ");
        int panjang = masuk.nextInt();
        
        for (int i = 0; i < panjang; i++) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            deret[i] = masuk.nextInt();
            
        }
    }
    
}
