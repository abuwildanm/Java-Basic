package Seleksi_Kondisi;

import java.util.Scanner;

public class namepass {

    public static void main(String[] args) {
        String nama, nama1, pass, pass1;
        
        Scanner masuk = new Scanner(System.in);
        
        System.out.print("Input username anda : ");
        nama = masuk.nextLine();
        System.out.print("Input password anda : ");
        pass = masuk.nextLine();
        System.out.print("Input username anda lagi : ");
        nama1 = masuk.nextLine();
        System.out.print("Input password anda lagi : ");
        pass1 = masuk.nextLine();
        
        if (nama1.equals (nama) && pass1.equals (pass))
        {
            System.out.println("Nama  : Abu Wildan Mucholladin");
            System.out.println("Kelas : A Teknik Informatika");
            System.out.println("Nim   : 165150200111002");
        }
        else
        {
            System.out.println("Data tak ditemukan");
        }
    }
    
}
