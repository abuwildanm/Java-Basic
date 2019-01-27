package Array;

import java.util.Scanner;

public class Merge_Array {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int[] array1, array2, array3;
        int panjang1, panjang2;
        
        System.out.println("*** Program Menggabungkan 2 Buah Array ***\n");
        
        System.out.print("Masukkan panjang array pertama    : ");
        panjang1 = masuk.nextInt();
        System.out.print("Masukkan panjang array kedua      : ");
        panjang2 = masuk.nextInt();
        System.out.println("");
        
        array1 = new int[panjang1];
        array2 = new int[panjang2];
        array3 = new int[panjang1 + panjang2];
        
        for (int i = 0; i < array1.length; i++) //input array pertama
        {
            System.out.print("Masukkan elemen angka array pertama ke - " + i + " : ");
            array1[i] = masuk.nextInt();
            
//            System.out.println(array1[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < array2.length; i++) //input array kedua
        {
            System.out.print("Masukkan elemen angka array kedua ke - " + i + " : ");
            array2[i] = masuk.nextInt();
            
//            System.out.println(array2[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < array1.length; i++) //input array pertama ke array ketiga
        {
            array3[i] = array1[i];
            
            System.out.println("Elemen angka array ketiga ke - " + i + " : " + array3[i]);
        }
        
        for (int i = array1.length; i < array3.length; i++) //input array kedua ke array ketiga
        {
            array3[i] = array2[i - array1.length];
            
            System.out.println("Elemen angka array ketiga ke - " + i + " : " + array3[i]);
        }
    }
    
}
