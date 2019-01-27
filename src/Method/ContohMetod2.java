package Method;

public class ContohMetod2 {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        
        double perhitungan = pangkat(a,b) / 5;
        
        System.out.println(pangkat(a,b));
        System.out.println(perhitungan);
    }
    
    public static double pangkat(int angka, int pkt){ //void = tidak ada nilainya, maka tidak boleh ada return
        double hasil = 1;
        
        for (int i = 1; i <= pkt; i++) {
            hasil = hasil * angka;
        }
        
        return hasil;
    }
    
}
