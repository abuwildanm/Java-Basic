package Tugas;

public class Tugas3_No2 {

    public static void main(String[] args) {
        int i, j, n;
        
        System.out.println("*** Program Pola Nama ***\n");
        
        for (i = 1; i < 6; i++)
        {
            for (j = 1; j < 6; j++)
            {
//                System.out.print(j);
                
                if (j == 1 || j == 5 || (i == 4 && j == 2) || (i == 4 && j == 4) || (i == 3 && j == 3))
                    System.out.print("W ");
                
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (i = 1; i < 6; i++)
        {
            for (j = 1; j < 6; j++)
            {
//                System.out.print(j);
                
                if (i == 1 || i == 5 || j == 3)
                    System.out.print("I ");
                
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (i = 1; i < 6; i++)
        {
            for (j = 1; j < 6; j++)
            {
//                System.out.print(j);
                
                if (j == 1 ||  i == 5)
                    System.out.print("L ");
                
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (i = 1; i < 6; i++)
        {
            for (j = 1; j < 6; j++)
            {
//                System.out.print(j);
                
                if ((i == 1 && j == 5) || (i == 5 && j == 5))
                    System.out.print("  ");
                
                else if (j == 1 || j == 5 || (i == 1 && j != 5) || (i == 5 && j != 5))
                    System.out.print("D ");
                
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (i = 1; i < 8; i++)
        {
            for (j = 1; j < 6; j++)
            {
//                System.out.print(j);
                
                if ((i == 1 && j == 1) || (i == 1 && j == 5) || (i == 2 && j == 1) || (i == 2 && j == 5))
                    System.out.print("  ");
                
                else if ((i == 1 && j == 3) || (i == 2 && j == 2) || (i == 2 && j == 4) ||  j == 1 || j == 5 || i == 4)
                    System.out.print("A ");
                
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (i = 1; i < 6; i++)
        {
            for (j = 1; j < 6; j++)
            {
//                System.out.print(j);
                
                if (j == 1 || j == 5 || (i == 2 && j == 2) || (i == 3 && j == 3) || (i == 4 && j == 4))
                    System.out.print("N ");
                
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        
        System.out.println("");
    }
    
}
