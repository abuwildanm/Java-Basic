package Method;

public class MethodArray {

    public static void main(String[] args) {
        int[] a = {5, 6};
        int[] b = {21, 22};
        
//        a = b;
        
        a[0] = b[0];
        a[1] = b[1];
        
        b[0] = 100;
        
        tes(a);
        System.out.println(a[0]);
    }
    
    public static void tes(int[] a) { //parameter by reference // kalo biasa paramater by value
        a[0] = 200;
    }
}
