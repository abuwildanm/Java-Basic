package Method;

import java.util.Arrays;

public class Keunikan_Method_Parameter_Array {

    public static void main(String[] args) {
        int a = 10, b = 15;
        int[] c = {1, 2, 3};
        
        ubahVar_1(a);
        System.out.println(a);
        a = ubahVar_2(a);
        System.out.println(a);
        System.out.println("");
        
//        System.out.println("Sebelum : " + Arrays.toString(c));
//        ubahVar_3(c);
//        System.out.println("Sesudah : " + Arrays.toString(c));
//        System.out.println("");
//        
//        System.out.println("Sebelum : " + Arrays.toString(c));
//        ubahVar_4(c);
//        System.out.println("Sesudah : " + Arrays.toString(c));
//        System.out.println("");
        
        System.out.println("Sebelum : " + Arrays.toString(c));
        ubahVar_5(c);
        System.out.println("Sesudah : " + Arrays.toString(c));
        System.out.println("");
    }
    
    private static void ubahVar_1(int a) {
        a = 5;
    }
    
    private static int ubahVar_2(int a) {
        a = 12;
        return a; 
    }

    private static void ubahVar_3(int[] c) {
        c[0] = 5;
    }
    
    private static int ubahVar_4(int[] c) {
        c[0] = 12;
        return c[0];
    }
    
    private static int[] ubahVar_5(int[] c) {
        c[0] = 12;
        return c;
    }
}
