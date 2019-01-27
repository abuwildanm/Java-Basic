package Method;

import java.util.Scanner;

public class Pangkat {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Penghitung Pangkat ***\n");
        
        System.out.print("Masukkan bilangan basisnya  : ");
        int bil = masuk.nextInt();
        System.out.print("Masukkan pangkatnya         : ");
        int pang = masuk.nextInt();
        
        System.out.println("Hasilnya : " + pkt(bil,pang));
    }
    
    public static double pkt(int x, int y) {
        if (y == 0)
            return 1;
        
        else
            return x * pkt(x, y-1);
    }
    
    public static void pangkat(int bil, int bilpang) {
        int hasil = 1;
        
        for (int i = 1; i <= bilpang; i++) 
        {
            hasil *= bil;
        }
        
        System.out.println("Hasilnya adalah : " + hasil);
    }
    
    /* Alur Kerja Rekursif
    1. Method main manggil method pkt(2,5)
    2. Karena y == 5, maka masuk kondisi else
    3. Maka : pkt(2,5) = 2 * pkt(2,4)
    4. Berarti sout(pkt(2,5)) = sout(2 * pkt(2,4))
    5. Lalu balik lagi, karena y == 4 maka masuk kondisi else
    6. Maka : pkt(2,4) = 2 * pkt(2,3)
    7. Berarti sout(2 * pkt(2,4)) = sout(2 * 2 * pkt(2,3))
    8. Dan seterusnya sampe y == 0, ketika y == 0 maka masuk kondisi if
    9. Maka : pkt(2,0) = 1 (karena return 1)
    10. Berarti sout(pkt(2,5)) = sout(2 * 2 * 2 * 2 * 2 * pkt(2,0))
    */
    
    //Method rekursif selalu ada if-else
    
}

