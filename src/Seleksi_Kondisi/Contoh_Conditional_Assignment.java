package Seleksi_Kondisi;

import java.util.Scanner;

public class Contoh_Conditional_Assignment {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Masukkan nama anda : ");
        String nama = masuk.next();
        
        String cek = (nama.equals("Wildan")) ? "Ganteng" : "Tidak Terdefinisi";
        System.out.println(nama + " " + cek);
    }
    
}
