package Seleksi_Kondisi;

import java.util.Scanner;

public class nama_password {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Masukkan Nama             : ");
        String name1 = x.nextLine();
        System.out.print("Masukkan Password         : ");
        String pass1 = x.nextLine();
        System.out.print("Masukkan Nama Lagi        : ");
        String name2 = x.nextLine();
        System.out.print("Masukkan Password Lagi    : ");
        String pass2 = x.nextLine();

        String cek = (name1.equals(name2) && pass1.equals(pass2)) ? "Nama        : " + name1 + "\nPassword    :" + pass1 : "Data tak ditemukan !";
        System.out.println(cek);
    }
}
