package Array;

import java.util.Scanner;

public class Statistika_Dasar {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int banyak, jumlah_data = 0, max, min, jumlah_kuadrat = 0, kuadrat_jumlah_data;
        double rata, varian, deviasi;
        int[] deret, kuadrat;
        
        System.out.println("*** Program Statistika Dasar ***\n");
        
        System.out.print("Masukkan Banyaknya Angka : ");
        banyak = masuk.nextInt();
        System.out.println("-----------------------------");
        
        deret = new int[banyak];
        kuadrat = new int[banyak];
        
//        max = min = deret[0];
//        min = deret[0];
        
        for (int i = 0; i < banyak; i++) //untuk rata2
        {
            System.out.print("Masukkan angka ke - " + i + " : ");
            deret[i] = masuk.nextInt();
            
            jumlah_data = jumlah_data + deret[i];
            kuadrat[i] = deret [i] * deret[i];
            jumlah_kuadrat = jumlah_kuadrat + kuadrat[i];
            
//            if (max < deret[i])
//            {
//                max = deret[i];
//            }
//            
//            if (min > deret[i])
//            {
//                min = deret[i];
//            }
        }
        
        max = deret[0];
        for (int i = 0; i < banyak; i++) //untuk max
        {
            if (max < deret[i])
            {
                max = deret[i];
            }
        }
        
        min = deret[0];
        for (int i = 0; i < banyak; i++) //untuk min aja
        {
            if (min > deret[i])
            {
                min = deret[i];
            }
        }
        
        
        
        /* Perhitungan Rumus */
        rata = (float) jumlah_data / banyak;
        kuadrat_jumlah_data = jumlah_data * jumlah_data;
        varian = ((float)banyak * jumlah_kuadrat - kuadrat_jumlah_data) / (banyak * (banyak - 1));
        deviasi = Math.sqrt(varian);
        
        System.out.println("-----------------------------");
        System.out.println("Nilai Maksimumnya   : " + max);
        System.out.println("Nilai Minimumnya    : " + min);
        System.out.println("Rata-ratanya        : " + rata);
        System.out.println("Standar Deviasinya  : " + deviasi);
    }
    
}
