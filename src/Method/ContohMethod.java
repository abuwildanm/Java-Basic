package Method;

public class ContohMethod {

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            berhitung();
//        }
//        
//        System.out.println("aaaaaa");
        
        int a = 2; // variabel lokal = variabel yang hanya dikenali di method itu saja
        int b = 4;

        System.out.println("=== ini aplikasi berhitung ===");
        coba(a);
        jumlahkan(4, 7);
        jumlahkan(a, b); // a,b itu parameter atau argumen atau atribut ==> tipe datanya harus sama
    }
    
    public static void jumlahkan(/*int a, int b*/ int apem, int botok){ // a,b itu parameter atau argumen atau atribut ==> tipe datanya harus sama
//        int a = 14;
//        int b = 21;

//        int c = a + b;
        System.out.println(apem);
    }
    
    public static void berhitung(){
        System.out.println("1 2 3 4 ....");
    }
    
    public static void coba(int a){
        if (a == 1)
            System.out.println("a = 1");
        else
            System.out.println("a sembarangan");
    }
}
