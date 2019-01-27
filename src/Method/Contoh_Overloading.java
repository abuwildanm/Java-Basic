package Method;

public class Contoh_Overloading {

    public static void main(String[] args) {
        jumlah(83, 32);
        jumlah(34, 454, 432);
        jumlah(34.43, 34);
        jumlah(28, 33.23);
    }
    
    public static void jumlah (int a, int b) {
        System.out.println("Jumlah 2 angka = " + (a + b));
    } 
    
    //oveloading perbedaan jumlah parameter
    public static void jumlah (int a, int b, int c) {
        System.out.println("Jumlah 3 angka = " + (a + b + c));
    } 
    
    //overloading perbedaan tipe data parameter
    public static void jumlah (double a, int b) {
        System.out.println("Jumlah 2 angka (double + int) = " + (a + b));
    } 
    
    //overloading perbedaan urutan tipe data parameter
    public static void jumlah (int b, double a) {
        System.out.println("Jumlah 2 angka (int + double) = " + (a + b));
    }
}
