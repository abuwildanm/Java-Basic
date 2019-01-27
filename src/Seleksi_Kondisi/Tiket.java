package Seleksi_Kondisi;

import java.util.Scanner;

public class Tiket {

    public static void main(String[] args) {
        int uang, tiket1, tiket2, tiket3, tiket4, kembalian1, kembalian2, kembalian3, kembalian4;
        final int vvip = 250000;
        final int vip = 100000;
        final int tribun = 50000;
        final int festival = 20000;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Penentuan Tiket ***\n");
        
        System.out.print("Input uang yang anda punya : Rp ");
        uang = masuk.nextInt();
        
        if (uang >= 250000)
        {
            tiket1 = uang / vvip;
            kembalian1 = uang % vvip;
            
            if (kembalian1 >= 100000)
            {
                tiket2 = kembalian1 / vip;
                kembalian2 = kembalian1 % vip;
                
                if (kembalian2 >= 50000)
                {
                    tiket3 = kembalian2 /tribun;
                    kembalian3 = kembalian2 % tribun;
                    
                    if (kembalian3 >= 20000)
                    {
                        tiket4 = kembalian3 / festival;
                        kembalian4 = kembalian3 % festival;
                        
                        System.out.println("Anda mendapatkan");
                        System.out.println("Tiket     : " + tiket1 + " VVIP, " + tiket2 + " VIP, " + tiket3 + " Tribun, " + tiket4 + " Festival");
                        System.out.println("Kembalian : Rp " + kembalian4);
                    }
                    
                    System.out.println("Anda mendapatkan");
                    System.out.println("Tiket     : " + tiket1 + " VVIP, " + tiket2 + " VIP, " + tiket3 + " Tribun");
                    System.out.println("Kembalian : Rp " + kembalian3);
                }
                
                System.out.println("Anda mendapatkan");
                System.out.println("Tiket     : " + tiket1 + " VVIP, " + tiket2 + " VIP");
                System.out.println("Kembalian : Rp " + kembalian2);
            }
            
            System.out.println("Anda mendapatkan");
            System.out.println("Tiket     : " + tiket1 + " VVIP");
            System.out.println("Kembalian : Rp " + kembalian1);
        }
        else if (uang >= 100000 && uang < 250000)
        {
            
        }
    }
    
}
