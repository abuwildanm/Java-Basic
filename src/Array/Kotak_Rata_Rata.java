package Array;

import java.util.Scanner;

public class Kotak_Rata_Rata {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        double[][] kotak1 = new double[5][5], kotak2 = new double[5][5];
        
        System.out.println("*** Program Kotak Rata-Rata ***\n");
        
        for (int i = 0; i < kotak1.length; i++)
        {
            for (int j = 0; j < kotak1[i].length; j++)
            {
                System.out.print("Masukkan isi kotak I pada indeks ke (" + i + "," + j + ") : ");
                kotak1[i][j] = masuk.nextDouble();
            }
        }
        System.out.println("");
        
        System.out.println("Kotak I");
        for (int i = 0; i < kotak1.length; i++) 
        {
            for (int j = 0; j < kotak1[i].length; j++) 
            {
                System.out.print(kotak1[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        
        /* Buat Nyimpen Aja */
//        for (int i = 0; i < kotak2.length; i++) 
//        {
//            for (int j = 0; j < kotak2[i].length; j++) 
//            {
//                kotak2[i][j] = kotak1[i][j];
//            }
//            System.out.println("");
//        }
//        System.out.println("");
        
        System.out.println("Kotak II");
        for (int i = 0; i < kotak2.length; i++) 
        {
            for (int j = 0; j < kotak2[i].length; j++) 
            {
                if (i == 0 || i == 4 || j == 0 || j == 4)
                    kotak2[i][j] = kotak1[i][j];
                
//                kotak2[1][1] = (float)((kotak1[0][0] + kotak1[0][1] + kotak1[0][2] + kotak1[1][0] + kotak1[1][1] + kotak1[1][2] + kotak1[2][0] + kotak1[2][1] + kotak1[2][2]) - kotak1[1][1]) / 8;
//                kotak2[1][2] = (float)((kotak1[0][1] + kotak1[0][2] + kotak1[0][3] + kotak1[1][1] + kotak1[1][2] + kotak1[1][3] + kotak1[2][1] + kotak1[2][2] + kotak1[2][3]) - kotak1[1][2]) / 8;
//                kotak2[1][3] = (float)((kotak1[0][2] + kotak1[0][3] + kotak1[0][4] + kotak1[1][2] + kotak1[1][3] + kotak1[1][4] + kotak1[2][2] + kotak1[2][3] + kotak1[2][4]) - kotak1[1][3]) / 8;
//                kotak2[2][1] = (float)((kotak1[1][0] + kotak1[1][1] + kotak1[1][2] + kotak1[2][0] + kotak1[2][1] + kotak1[2][2] + kotak1[3][0] + kotak1[3][1] + kotak1[3][2]) - kotak1[2][1]) / 8;
//                kotak2[2][2] = (float)((kotak1[1][1] + kotak1[1][2] + kotak1[1][3] + kotak1[2][1] + kotak1[2][2] + kotak1[2][3] + kotak1[3][1] + kotak1[3][2] + kotak1[3][3]) - kotak1[2][2]) / 8;
//                kotak2[2][3] = (float)((kotak1[1][2] + kotak1[1][3] + kotak1[1][4] + kotak1[2][2] + kotak1[2][3] + kotak1[2][4] + kotak1[3][2] + kotak1[3][3] + kotak1[3][4]) - kotak1[2][3]) / 8;
//                kotak2[3][1] = (float)((kotak1[2][0] + kotak1[2][1] + kotak1[2][2] + kotak1[3][0] + kotak1[3][1] + kotak1[3][2] + kotak1[4][0] + kotak1[4][1] + kotak1[4][2]) - kotak1[3][1]) / 8;
//                kotak2[3][2] = (float)((kotak1[2][1] + kotak1[2][2] + kotak1[2][3] + kotak1[3][1] + kotak1[3][2] + kotak1[3][3] + kotak1[4][1] + kotak1[4][2] + kotak1[4][3]) - kotak1[3][2]) / 8;
//                kotak2[3][3] = (float)((kotak1[2][2] + kotak1[2][3] + kotak1[2][4] + kotak1[3][2] + kotak1[3][3] + kotak1[3][4] + kotak1[4][2] + kotak1[4][3] + kotak1[4][4]) - kotak1[3][3]) / 8;
                
                if (i == 2 && j == 2)
                    break;

                kotak2[i+1][j+1] = (float)((kotak1[i][j] + kotak1[i][j+1] + kotak1[i][j+2] + kotak1[i+1][j] + kotak1[i+1][j+1] + kotak1[i+1][j+2] + kotak1[i+2][j] + kotak1[i+2][j+1] + kotak1[i+2][j+2]) - kotak1[i+1][j+1]) / 8;
                
//                if (i == 2 && j == 2)
//                    break;
                
                System.out.print(kotak2[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
