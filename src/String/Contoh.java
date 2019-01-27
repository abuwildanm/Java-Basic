package String;

public class Contoh {
    
    public static void main(String[] args) {
        char[] huruf = {'l', 'e', 'm', 'p', 'e', 'r'};
        String kue = new String(huruf);

        System.out.println(kue);
        
        String coba[] = {"Double Weekend", "Single Weekend", "Suite Weekend"};
        
        for (int i = 0; i < coba.length; i++) {
            System.out.println(coba[i].substring(0, 6).trim());
        }
        
        System.out.println(coba[2].substring(0, 6).trim().equalsIgnoreCase("Suite"));
        
        for (int i = 0; i < coba.length; i++) {
            
            String kata[] = coba[i].split(" ");
            System.out.println(kata[i]);
        }
    }
}
