package Tugas;

import java.util.Scanner;

public class Tugas3_No3 {

    public static void main(String[] args) {
        int i, pilihan;
        double p, l, t, v, r, a, ts;
        String pilih;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Penghitung Volume ***\n");
        
        while (true)
        {
            System.out.println("================ Menu ====================");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
            System.out.println("==========================================");
            System.out.print("   MASUKKAN PILIHAN ANDA : ");
            pilihan = masuk.nextInt();
            System.out.println("\n------------------------------------------");
        
            if (pilihan == 0)
                break;
            
            switch (pilihan)
            {
                case 1:
                    System.out.print("Input Panjangnya  : ");
                    p = masuk.nextDouble();
                    System.out.print("Input Lebarnya    : ");
                    l = masuk.nextDouble();
                    System.out.print("Input Tingginya   : ");
                    t = masuk.nextDouble();

                    v = p * l * t;

                    System.out.println("Volume Balok      : " + v);
                    System.out.println("------------------------------------------\n");
                    
                    System.out.print("Apakah anda ingin menghitung volume benda lain? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;

                case 2:
                    System.out.print("Input Jari-jarinya : ");
                    r = masuk.nextDouble();

                    v = (float)4/3 * Math.PI * r * r * r;

                    System.out.println("Volume Bola        : " + v);
                    System.out.println("------------------------------------------\n");
                    
                    System.out.print("Apakah anda ingin menghitung volume benda lain? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;

                case 3:
                    System.out.print("Input Jari-jarinya    : ");
                    r = masuk.nextDouble();
                    System.out.print("Input Tingginya       : ");
                    t = masuk.nextDouble();

                    v = (float)1/3 * Math.PI * r * r * t;

                    System.out.println("Volume Kerucut        : " + v);
                    System.out.println("------------------------------------------\n");
                    
                    System.out.print("Apakah anda ingin menghitung volume benda lain? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;

                case 4:
                    System.out.print("Input Jari-jarinya    : ");
                    r = masuk.nextDouble();
                    System.out.print("Input Tingginya       : ");
                    t = masuk.nextDouble();

                    v = Math.PI * r * r * t;

                    System.out.println("Volume Silinder       : " + v);
                    System.out.println("------------------------------------------\n");
                    
                    System.out.print("Apakah anda ingin menghitung volume benda lain? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;

                case 5:
                    System.out.print("Input Alas Segitiganya    : ");
                    a = masuk.nextDouble();
                    System.out.print("Input Tinggi Segitiganya  : ");
                    ts = masuk.nextDouble();
                    System.out.print("Input Tinggi Limasnya     : ");
                    t = masuk.nextDouble();

                    v = (float)1/2 * a * ts * t;

                    System.out.println("Volume Limas Segitiga     : " + v);
                    System.out.println("------------------------------------------\n");
                    
                    System.out.print("Apakah anda ingin menghitung volume benda lain? (Y/N) : ");
                    pilih = masuk.next();
                    System.out.println("");
                    
                    
                    if (pilih.equals("N") || pilih.equals("n"))
                        System.exit(0);
                    
                    break;

                default:
                    System.out.println("PILIHAN ANDA SALAH !");
                    System.out.println("------------------------------------------\n");
                    break;
            }
        }
    }
    
}
