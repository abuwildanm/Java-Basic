package Method;

import java.util.Scanner;

public class Konversi_Suhu {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int pilihan, suhu;
        
        System.out.println("*** Program Konversi Suhu ***\n");
        
        System.out.println("================= Menu Utama ====================");
        System.out.println("1. Celcius ==> Fahrenheit");
        System.out.println("2. Celcius ==> Reamur");
        System.out.println("3. Celcius ==> Kelvin");
        System.out.println("0. Keluar");
        System.out.println("=================================================");
        System.out.print("   MASUKKAN PILIHAN ANDA : ");
        pilihan = masuk.nextInt();
        System.out.println("\n-------------------------------------------------");
        System.out.print("Masukkan suhunya    : ");
        suhu = masuk.nextInt();
        
        System.out.println("Hasilnya            : " + Konversi(pilihan,suhu));
//        Konversi(pilihan,suhu);
    }
    
    public static double Konversi(int pilihan, int suhu){
        double hasil = 0;
        
        switch (pilihan)
        {
            case 1 : hasil = (float)(9/5 * suhu) + 32; break;
            case 2 : hasil = (float) 4/5 * suhu; break;
            case 3 : hasil = suhu + 273; break;
            case 0 : System.exit(0); break;
            default : System.out.println("PILIHAN ANDA SALAH !"); break;
            
        }
        
        return hasil;
    }
    
}
