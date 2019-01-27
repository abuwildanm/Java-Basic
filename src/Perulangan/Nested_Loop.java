package Perulangan;

public class Nested_Loop {

    public static void main(String[] args) {
        int i, j, k, l, m;
        
        /* Kode I */
//        for (i = 1; i <= 5; i++)
//        {
//            for (j = 1; j <= 4; j++)
//            {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }
        
        /* Kode II */
//        for (i = 1; i <= 4; i++)
//        {
//            for (j = i; j <= i+4; j++)
//            {
//                System.out.print(j);
//            }
//            System.out.println("");
//        }
        
        for (i = 1; i <= 4; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
        
        
    }
    
}
