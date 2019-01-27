package Array;

import java.util.Scanner;

public class Nilai_Max_Array {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int[] deret;
        int max;
        
        deret = new int[10];
        
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Masukkan angka ke - " + i + " : ");
            deret[i] = masuk.nextInt();
        }
        
        max = deret[0];
        for (int i = 1; i < deret.length; i++) //untuk max
        {
            if (max < deret[i])
            {
                max = deret[i];
            }
        }
        
        System.out.println("Nilai max : " + max);
    }
    
}
