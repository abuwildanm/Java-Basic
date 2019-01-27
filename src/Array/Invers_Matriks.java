package Array;

import java.util.Scanner;

public class Invers_Matriks {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int[][] matriks = new int[2][2];
        double[][] invers = new double[2][2];
        int tukar;
        
        System.out.println("*** Program Invers Matriks Ordo 2x2 ***\n");
        
        for (int i = 0; i < matriks.length; i++) 
        {
            for (int j = 0; j < matriks[i].length; j++) 
            {
                System.out.print("Masukkan isi matriks pada indeks ke (" + i + "," + j + ") : ");
                matriks[i][j] = masuk.nextInt();
            }
        }
        System.out.println("");
        
        System.out.println("Sebelum diinvers");
        for (int i = 0; i < matriks.length; i++) 
        {
            for (int j = 0; j < matriks[i].length; j++) 
            {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        
        /* Proses Invers (pembalikan isi matriks) */
        tukar = matriks[0][0];
        matriks[0][0] = matriks[1][1];
        matriks[1][1] = tukar;
        matriks[0][1] *= -1;
        matriks[1][0] *= -1;
        
//        for (int i = 0; i < matriks.length; i++) 
//        {
//            for (int j = 0; j < matriks[i].length; j++) 
//            {
//                System.out.print(matriks[i][j] + "\t");
//            }
//            System.out.println("");
//        }
//        System.out.println("");
        
        System.out.println("Setelah diinvers");
        for (int i = 0; i < matriks.length; i++) 
        {
            for (int j = 0; j < matriks[i].length; j++) 
            {
                invers[i][j] = (float)matriks[i][j] / ((matriks[1][1] * matriks[0][0]) - (matriks[0][1] * matriks[1][0]));
                
                System.out.print(invers[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
