package Seleksi_Kondisi;

import java.util.Scanner;

public class constAss {

    public static void main(String[] args) {
        String s = "filkom" , nama, nim;
        
        Scanner masuk = new Scanner(System.in);
        
        String val = (s == "filkom") ? "Brawijaya" : "null";
        System.out.println(s + " " + val);
        
        System.out.print("Masukkan nama anda    : ");
        nama = masuk.nextLine();
        System.out.print("Masukkan NIM anda     : ");
        nim = masuk.nextLine();
        System.out.println("");
        
        String ceknama = (nama.equals("Abu Wildan Mucholladin")) ? "Nama anda adalah    : " + nama : "Input nama salah !";
        System.out.println(ceknama);
        String ceknim = (nim.equals("165150200111002")) ? "NIM anda adalah     : " + nim : "Input nim salah !";
        System.out.println(ceknim);
    }
    
}
