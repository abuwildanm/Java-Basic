package Method;

public class Recursif {

    public static void main(String[] args) {
        tes(5);
    }
    
    public static void tes(int n) {
        if (n > 0) {
            System.out.println(n);
            tes(n-1);
        }
    }
}
