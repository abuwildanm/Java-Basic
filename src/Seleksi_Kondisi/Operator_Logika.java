package Seleksi_Kondisi;

public class Operator_Logika {

    public static void main(String[] args) {
        boolean logika;
        
        System.out.println("*** Program Cek Nilai Kebenaran Operator Logika ***\n");
        
        logika = true ^ true;
        System.out.println(logika);
        logika = true ^ false;
        System.out.println(logika);
        logika = false ^ true;
        System.out.println(logika);
        logika = false ^ false;
        System.out.println(logika);
    }
    
}
