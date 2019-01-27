package Seleksi_Kondisi;

import java.util.Scanner;

public class Koordinat_Kartesius {

    public static void main(String[] args) {
        int x, y, x1, y1;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("*** Program Koordinat Kartesius ***");
        
        System.out.print("Masukkan koordinat x : ");
        x = masuk.nextInt();
        System.out.print("Masukkan koordinat y : ");
        y = masuk.nextInt();
        
        if (x == 0 && y == 0)
        {
            System.out.println("Titik anda berada di pusat koordinat kartesius");
        }
        else if (x == 0 && y != 0)
        {
            System.out.println("Titik anda berada di sumbu y dengan koordinat (0," + y + ")");
        }
        else if (x != 0 && y == 0)
        {
            System.out.println("Titik anda berada di sumbu x dengan koordinat (" + x + ",0)");
        }
        else
        {
            if (x > 0 && y > 0)
            {
                System.out.println("Titik anda berada pada kuadran I dengan koordinat (" + x + "," + y + ")");
                
                x1 = x * (-1);
                System.out.println("Titik anda berada pada kuadran II dengan koordinat (" + x1 + "," + y + ")");
            }
            else if (x < 0 && y < 0)
            {
                System.out.println("Titik anda berada pada kuadran III dengan koordinat (" + x + "," + y + ")");
                
                y1 = y * (-1);
                System.out.println("Titik anda berada pada kuadran II dengan koordinat (" + x + "," + y1 + ")");
            }
            else if (x > 0 && y < 0)
            {
                System.out.println("Titik anda berada pada kuadran IV dengan koordinat (" + x + "," + y + ")");
                
                x1 = x * (-1);
                y1 = y * (-1);
                System.out.println("Titik anda berada pada kuadran II dengan koordinat (" + x1 + "," + y1 + ")");
            }
            else
            {
                System.out.println("Titik anda berada pada kuadran II dengan koordinat (" + x + "," + y + ")");
            }
        }
    }
    
}
