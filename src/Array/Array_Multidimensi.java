package Array;

public class Array_Multidimensi {

    public static void main(String[] args) {
        int[][]A = new int[3][4];
        
        A[0][0] = 30;
        A[0][1] = 30;
        A[0][2] = 30;
        A[0][3] = 30;
        A[1][0] = 30;
        A[1][1] = 30;
        A[1][2] = 30;
        A[1][3] = 30;
        A[2][0] = 30;
        A[2][1] = 30;
        A[2][2] = 30;
        A[2][3] = 30;
        
        System.out.println(A.length);
        System.out.println(A[0].length);
        
        int[][]B = { {1,2,3,4} , {5,6,7,8} , {9,9,9,0} }; //panjang dalam juga boleh sama
        int[][]C = { {1,2,3,4} , {5,6} , {9,9,9,0} }; //panjang dalam boleh beda-beda
        
        System.out.println("");
        
        for (int i = 0; i < B.length; i++)
        {
            for (int j = 0; j < B[i].length; j++) 
            {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < B[0].length; i++)
        {
            for (int j = 0; j < B.length; j++)
            {
                System.out.print(B[j][i] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        int[][] D = { {1,2,3,4} , {15,16,17,18} , {9,9,9,0} };
        int[][] E = { {11,12,13,14} , {5,6,7,8} , {0,0,0,9} };
        int[][] F = new int[3][4];
        
        System.out.println("*** Program Penambahan Matriks ***\n");
        
        for (int i = 0; i < D.length; i++) //baris
        {
            for (int j = 0; j < D[i].length; j++) //kolom
            {
                System.out.print(D[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < E.length; i++)
        {
            for (int j = 0; j < E[i].length; j++) 
            {
                System.out.print(E[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < F.length; i++)
        {
            for (int j = 0; j < F[i].length; j++) 
            {
                F[i][j] = D[i][j] + E[i][j];
                
                System.out.print(F[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
