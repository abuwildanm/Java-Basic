package Perulangan;

public class Contoh_While {

    public static void main(String[] args) {
        /*while (true / false)
        {
            kode;
        }*/
        
        // kode di dalam while harus menyebabkan while itu suatu ketika bernilai false
        // jika kode di dalam while selalu bernilai true, maka akan terjadi infinite loop
        // do while = pengulangan dijalankan minimal satu kali
        // while = pengulangan dijalankan jika kondisinya true saja
        
        int i = 1;
        
//        while (i < 15)
//        {
//            System.out.print(i + " ");
//            i++;
//        }
        
        do
        {
            System.out.print(i + " ");
            i++;
        }
        while (i < 1);
    }
    
}
