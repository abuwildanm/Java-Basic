package praktikum;

import java.util.Scanner;

public class Praktikum_2 {

    public static void main(String[] args) {
        String s = (5>2) ? "Berhasil" : "Gagal";
//        int s = (5>2) ? 5 : 2;
        
        String status;
        String c = "TIF-A";
        String e = "TEKKOM-A";
        String d = "Saya sedang belajar Java";
        String f = "Saya belajar C";
        status = "TIF-A";
        
        if (status.equalsIgnoreCase(c))
        {
            System.out.println(d);
        }
        else if (status.equalsIgnoreCase(e))
        {
            System.out.println(f);
        }
        
        Scanner in = new Scanner(System.in);
        int nilai2 = 0;
        System.out.print("Nilai : ");
        int nilai = in.nextInt();
        
            switch (nilai) {
                case 2 :
                    nilai2 = 2;
                    break;
                case 3 :
                    nilai2 = 3;
                    break;
            }
            System.out.println(nilai2);
    }
    
}
