package praktikum;
import java.util.*;
public class Fibonacci{
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan jumlah suku : ");
        int u = x.nextInt();
        for(int i = 1; i <= u; i++){
            System.out.print(fib(i) + " ");}
    }
    
    public static int fib(int u){
        if(u == 1){
            return 0;
        }else if(u == 2){
            return 1;
        }else
            return fib(u-2) + fib(u-1);
    }
    
}