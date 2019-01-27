package Method;

import java.util.Scanner;

public class Nilai_Max_Min {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int bil1, bil2, bil3;
        
        System.out.println("*** Program Mencari Nilai Max dan Min ***\n");
        
        System.out.print("Masukkan bilangan pertama   : ");
        bil1 = masuk.nextInt();
        System.out.print("Masukkan bilangan kedua     : ");
        bil2 = masuk.nextInt();
        System.out.print("Masukkan bilangan ketiga    : ");
        bil3 = masuk.nextInt();
        
        System.out.println("Nilai Minimumnya    : " + minimum(bil1, bil2, bil3));
        System.out.println("Nilai Maksimumnya   : " + maximum(bil1, bil2, bil3));
    }
    
    public static int minimum (int bil1, int bil2, int bil3) {
        int min;
        
        if (bil1 < bil2 && bil1 < bil3)
            min = bil1;

        else if (bil2 < bil1 && bil2 < bil3)
            min = bil2;

        else
            min = bil3;
        
        return min;
    }
    
    public static int maximum (int bil1, int bil2, int bil3) {
        int max;
        
        if (bil1 > bil2 && bil1 > bil3)
            max = bil1;

        else if (bil2 > bil1 && bil2 > bil3)
            max = bil2;

        else
            max = bil3;
        
        return max;
    }
    
}
