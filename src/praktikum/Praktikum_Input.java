package praktikum;

import java.util.Scanner;

public class Praktikum_Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //baris ke-4
        int nilai1, nilai2, hasil;
        String nama, NIM;
        
        System.out.print("masukkan nilai 1 : ");
        nilai1 = input.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nilai2 = input.nextInt();
        System.out.print("Nama :");
        nama = input.next();
        System.out.print("NIM : ");
        NIM = input.next();
        
        hasil = nilai1+nilai2;
        
        System.out.println("maka hasil : "+hasil);
        System.out.println(nama);
        System.out.println(NIM);
    }    
}
