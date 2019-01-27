package Method;
import java.util.Scanner;
public class Prak_void {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pilih = 3;
        do {
            System.out.println("Program Menghitung Sederhana ");
            System.out.println("Pilih salah satu :");
            System.out.println("1. Volume Prisma Segitiga");
            System.out.println("2. Volume Balok");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = in.nextInt();
            switch(pilih){
                case 1 : volPrismaSegitiga();break;
                case 2 : volBalok();break;
            }
        } while(pilih != 3);
        
//        SegitigaSiku();
        SegitigaSembarang();
    }
    private static void volPrismaSegitiga(){
        Scanner in = new Scanner(System.in);
        float alas, tinggiSegitiga, luas, tinggiPrisma, volume;
        System.out.print("Masukkan nilai panjang alas :");
        alas = in.nextFloat();
        System.out.print("Masukkan nilai tinggi segitiga :");
        tinggiSegitiga = in.nextFloat();
        luas = (alas * tinggiSegitiga)/2;
        System.out.print("Masukkan nilai tinggi prisma :");
        tinggiPrisma = in.nextFloat();
        volume = (luas * tinggiPrisma);
        System.out.println("Volume Prisma Segitiga :" + volume);
    }
    public static void volBalok(){
        Scanner in = new Scanner(System.in);
        float panjang, lebar, tinggi, volume;
        System.out.print("Masukkan panjang balok : ");
        panjang = in.nextFloat();
        System.out.print("Masukkan lebar balok : ");
        lebar = in.nextFloat();
        System.out.print("Masukkan tinggi balok : ");
        tinggi = in.nextFloat();
        volume = panjang * lebar * tinggi;
        System.out.println("Volume balok : " + volume);
    }
    public static void SegitigaSiku(){
        Scanner in = new Scanner(System.in);
        double alas, tinggi, hipotenusa, luas, keliling;
        System.out.print("Masukkan alas segitiga siku-siku      : ");
        alas = in.nextFloat();
        System.out.print("Masukkan tinggi segitiga siku-siku    : ");
        tinggi = in.nextFloat();
        hipotenusa = Math.sqrt((alas*alas) + (tinggi*tinggi));
        keliling = alas + tinggi + hipotenusa;
        luas = alas * tinggi / 2;
        System.out.printf("%-15s%c%.2f\n", "Sisi miring", ':', hipotenusa);
        System.out.printf("%-15s%c%.2f\n", "Keliling", ':', keliling);
        System.out.printf("%-15s%c%.2f\n", "Luas", ':', luas);
    }
    public static void SegitigaSembarang(){
        Scanner in = new Scanner(System.in);
        double a, b, c, s, luas, keliling;
        System.out.print("Masukkan panjang sisi a : ");
        a = in.nextFloat();
        System.out.print("Masukkan panjang sisi b : ");
        b = in.nextFloat();
        System.out.print("Masukkan panjang sisi c : ");
        c = in.nextFloat();
        keliling = a + b + c;
        s = keliling / 2;
        luas = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%-15s%c%.2f\n", "Keliling", ':', keliling);
        System.out.printf("%-15s%c%.2f\n", "Luas", ':', luas);
    }
}