package praktikum;

public class Praktikum {

    public static void main(String[] args) {
        float x = 7654.123456789F;
        double y,a=22,b=7;
        y = a/b;
        
        System.out.println("Hello World"); //1
        
        System.out.println("Belajar");
        System.out.println("Pemrograman" + "Java"); //2
        
        System.out.printf("%s%c\n", "Pemrograman Java", '|');
        System.out.printf("%30s%c\n", "Pemrograman Java", '|');
        System.out.printf("%-30s%c\n", "Pemrograman Java", '|');
        System.out.printf("%30.8s%c\n", "Pemrograman Java", '|'); //3
        
        System.out.printf("%-30s%30c\n", "Pemrograman Java", '|');
        System.out.printf("%.2f\n", Math.PI);
        
        System.out.printf("%d %3d %8d\n",1234,-567,8910);
        System.out.printf("%d %3d %+8d\n",1234,-567,8910);
        System.out.printf("%f %15f %15.3f\n",x,x,x); //4
        System.out.printf("%.2f\n" , x);
        System.out.printf("%g %15e %15.3f\n",x,x,x);
        System.out.printf("%.3g\n" , y);
        System.out.printf("%e\n" , y);
        System.out.printf("%E\n" , y);
        System.out.println(y);
        
    }
    
}
