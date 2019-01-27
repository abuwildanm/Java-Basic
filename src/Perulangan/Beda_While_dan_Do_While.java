package Perulangan;

public class Beda_While_dan_Do_While {

    public static void main(String[] args) {
        int i = 10;
        
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }
        
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
        
        // pada do-while setidaknya kodenya akan dieksekusi minimal satu kali sebelum menguji syaratnya
        // pada do-while akan melakukan kodenya dulu, baru menguji persyaratannya
    }
    
}
