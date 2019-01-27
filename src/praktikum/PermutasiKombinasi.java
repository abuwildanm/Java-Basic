package praktikum;
import java.util.*;
public class PermutasiKombinasi{   
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        while(true){
            int i;
            System.out.println("Program Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan anda : ");
            i = x.nextInt();
            switch(i){
                case 1 : permutasi();break;
                case 2 : kombinasi();break;
            }if(i==3)
                break;
        }
    }
    public static void permutasi(){
        Scanner x = new Scanner(System.in);
        int n, r;
        double p;
        System.out.print("Masukkan nilai n : ");
        n = x.nextInt();
        System.out.print("Masukkan nilai r : ");
        r = x.nextInt();
        p = faktorial(n)/(faktorial(n-r));
        
        System.out.println("        n");
        System.out.println("nPr = ------ = " + (int)p);
        System.out.println("      (n-r)!");
        System.out.println("Maka Hasil Kombinasinya adalah : " + (int)p + "\n");
    }
    public static void kombinasi(){
        Scanner x = new Scanner(System.in);
        int n, r;
        double p;
        System.out.print("Masukkan nilai n : ");
        n = x.nextInt();
        System.out.print("Masukkan nilai r : ");
        r = x.nextInt();
        p = faktorial(n)/(faktorial(n-r)*faktorial(r));   
        System.out.println("          n");
        System.out.println("nPr = ----------- = " + (int)p);
        System.out.println("      (n-r)! x r!");
        System.out.println("Maka Hasil Kombinasinya adalah : " + (int)p + "\n");
    }
    public static int faktorial(int n){
        if (n==0)
            return 1;
        return n * faktorial(n-1);
    }
}