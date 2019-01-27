package Method;

import java.util.Scanner;

public class Deret_Fibonacci {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int banyak;
        
        System.out.println("*** Program Penentu Deret Fibonacci ***\n");
        
        System.out.print("Masukkan banyaknya suku : ");
        banyak = masuk.nextInt();

        for (int i = 1; i <= banyak; i++) {
            System.out.print(Fibonacci(i) + ", ");
        }
    }
    
    public static int Fibonacci(int suku){
        if (suku == 1 || suku == 2)
            return 1;
        
        else
            return Fibonacci(suku - 2) + Fibonacci (suku - 1);
    }
}
