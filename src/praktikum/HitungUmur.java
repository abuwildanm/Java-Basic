package praktikum;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HitungUmur {
    
    private static DateFormat tanggal, bulan, tahun;
    private static Date date;
    private static Scanner scanner;
    private static String inputan;

    public static void main(String[] args) {
        tanggal = new SimpleDateFormat("dd");
        bulan = new SimpleDateFormat("mm");
        tahun = new SimpleDateFormat("yyyy");
        date = new Date();
        scanner = new Scanner(System.in);

        System.out.print("Masukkan Tanggal Lahir anda : ");
        inputan = scanner.nextLine();

        int tanggalLahir = Integer.parseInt(inputan.substring(0, 2)); //mengambil data pada indeks 0 sampai data sebelum indeks 2 dari variabel inputan dan disimpan pada variabel baru, yaitu tanggalLahir
        int bulanLahir = Integer.parseInt(inputan.substring(3, 5));
        int tahunLahir = Integer.parseInt(inputan.substring(6, 10));

        int tanggalHari = Integer.parseInt(tanggal.format(date));
        int bulanHari = Integer.parseInt(bulan.format(date));
        int tahunHari = Integer.parseInt(tahun.format(date));

        int totalTahun = tahunHari - tahunLahir;

        System.out.println("Umur Anda adalah : " + totalTahun);
    }
    
}
