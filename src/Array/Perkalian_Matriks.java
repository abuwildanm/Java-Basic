package Array;

import java.util.Scanner;

public class Perkalian_Matriks {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int[][] matriks1, matriks2, matriks3;
        int baris1, baris2, kolom1, kolom2;
        
        System.out.println("*** Program Perkalian Matriks Ordo 2x2 dan 3x3 ***\n");
        
        System.out.print("Masukkan Banyaknya Baris Matriks I    : ");
        baris1 = masuk.nextInt();
        System.out.print("Masukkan Banyaknya Kolom Matriks I    : ");
        kolom1 = masuk.nextInt();
        System.out.print("Masukkan Banyaknya Baris Matriks II   : ");
        baris2 = masuk.nextInt();
        System.out.print("Masukkan Banyaknya Kolom Matriks II   : ");
        kolom2 = masuk.nextInt();
        System.out.println("");
        
        matriks1 = new int[baris1][kolom1];
        matriks2 = new int[baris2][kolom2];
        matriks3 = new int[matriks1.length][matriks1[0].length];
        
        for (int i = 0; i < matriks1.length; i++) //input matriks I dari user
        {
            for (int j = 0; j < matriks1[i].length; j++) 
            {
                System.out.print("Masukkan angka Matriks I pada indeks ke (" + i + "," + j + ") : ");
                matriks1[i][j] = masuk.nextInt();
            }
        }
        System.out.println("");
        
        for (int i = 0; i < matriks2.length; i++) //input matriks II dari user
        {
            for (int j = 0; j < matriks2[i].length; j++) 
            {
                System.out.print("Masukkan angka Matriks II pada indeks ke (" + i + "," + j + ") : ");
                matriks2[i][j] = masuk.nextInt();
            }
        }
        System.out.println("");
        
        System.out.println("Matriks I");
        for (int i = 0; i < matriks1.length; i++) //output matriks I ==> ini baris
        {
            for (int j = 0; j < matriks1[i].length; j++) // ini kolom
            {
                System.out.print(matriks1[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Matriks II");
        for (int i = 0; i < matriks2.length; i++) // output matriks II
        {
            for (int j = 0; j < matriks2[i].length; j++) 
            {
                System.out.print(matriks2[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        
        if (baris1 == 2 && kolom1 == 2 && baris2 == 2 && kolom2 == 2)
        {
            System.out.println("Matriks III");
            for (int i = 0; i < matriks3.length; i++) 
            {
                for (int j = 0; j < matriks3[i].length; j++) 
                {
                    matriks3[i][j] = (matriks1[i][0] * matriks2 [0][j]) + (matriks1[i][1] * matriks2[1][j]);

                    System.out.print(matriks3[i][j] + "\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
        if (baris1 == 3 && kolom1 == 3 && baris2 == 3 && kolom2 == 3)
        {
            System.out.println("Matriks III");
            for (int i = 0; i < matriks3.length; i++) 
            {
                for (int j = 0; j < matriks3[i].length; j++) 
                {
                    matriks3[i][j] = (matriks1[i][0] * matriks2 [0][j]) + (matriks1[i][1] * matriks2[1][j]) + (matriks1[i][2] * matriks2[2][j]);

                    System.out.print(matriks3[i][j] + "\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }    
        
//        matriks3[0][0] = (matriks1[0][0] * matriks2 [0][0]) + (matriks1[0][1] * matriks2[1][0]) + (matriks1[0][2] * matriks2[2][0]);
//        matriks3[0][1] = (matriks1[0][0] * matriks2 [0][1]) + (matriks1[0][1] * matriks2[1][1]) + (matriks1[0][2] * matriks2[2][1]);
//        matriks3[0][2] = (matriks1[0][0] * matriks2 [0][2]) + (matriks1[0][1] * matriks2[1][2]) + (matriks1[0][2] * matriks2[2][2]);
//        matriks3[1][0] = (matriks1[1][0] * matriks2 [0][0]) + (matriks1[1][1] * matriks2[1][0]) + (matriks1[1][2] * matriks2[2][0]);
//        matriks3[1][1] = (matriks1[1][0] * matriks2 [0][1]) + (matriks1[1][1] * matriks2[1][1]) + (matriks1[1][2] * matriks2[2][1]);
//        matriks3[1][2] = (matriks1[1][0] * matriks2 [0][2]) + (matriks1[1][1] * matriks2[1][2]) + (matriks1[1][2] * matriks2[2][2]);
//        
//        matriks3[i][j] = (matriks1[i][0] * matriks2 [0][j]) + (matriks1[i][1] * matriks2[1][j]) + (matriks1[i][2] * matriks2[2][j]);
    }
    
}
