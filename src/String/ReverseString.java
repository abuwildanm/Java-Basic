package String;

public class ReverseString {

    public static void main(String[] args) {
        String coba = "sayang";
        String reverse = "";
        for (int i = coba.length() - 1; i >= 0; i--) {
            reverse = reverse + coba.charAt(i);
        }
        System.out.println(reverse);
    }
    
}
