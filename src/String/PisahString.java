package String;

public class PisahString {

    public static void main(String[] args) {
        String kalimat = ("contoh-split-string-dengan-java");
        String[] kata = kalimat.split("-");
        kata = kalimat.split("-");
        System.out.println("-- Hasil Split --");
        for (int i = 0; i < kata.length; i++) {
            System.out.println(kata[i]);
        }
        
        System.out.println(kata[3]);
    }
    
}
