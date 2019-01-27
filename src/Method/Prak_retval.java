package Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Prak_retval {
    
    public static DateFormat tanggal, bulan, tahun;
    public static Date date;
    public static Scanner scanner;
    public static String inputan1, inputan2;
    public static Scanner in;
    
    public static void main(String[] args) {
        tanggal = new SimpleDateFormat("dd");
        bulan = new SimpleDateFormat("mm");
        tahun = new SimpleDateFormat("yyyy");
        date = new Date();
        in = new Scanner (System.in);
        System.out.println("Program Pendataan Mahasiswa");
        System.out.println();
        String nim1, nama1, nim2, nama2, jur1, jur2, tempat1, tempat2;
        System.out.println("Masukan NIM Mahasiswa 1 : ");
        nim1 = in.nextLine();
        System.out.println("Masukan Nama Mahasiswa 1 : ");
        nama1 = in.nextLine();
        System.out.println("Masukan Tempat Lahir Mahasiswa 1 : ");
        tempat1 = in.nextLine();
        System.out.print("Masukkan Tanggal Lahir Mahasiswa 1 (dd/mm/yyyy) : ");
        inputan1 = in.nextLine();
        System.out.println("Masukan Jurusan Mahasiswa 1 : ");
        jur1 = in.nextLine();
        System.out.println("Masukan NIM Mahasiswa 2 : ");
        nim2 = in.nextLine();
        System.out.println("Masukan Nama Mahasiswa 2 : ");
        nama2 = in.nextLine();
        System.out.println("Masukan Tempat Lahir Mahasiswa 2 : ");
        tempat2 = in.nextLine();
        System.out.print("Masukkan Tanggal Lahir Mahasiswa 2 (dd/mm/yyyy) : ");
        inputan2 = in.nextLine();
        System.out.println("Masukan Jurusan Mahasiswa 2 : ");
        jur2 = in.nextLine();
        System.out.println("Data Mahasiswa : ");
        System.out.println(showData1(nim1,nama1,jur1,inputan1));
        System.out.println(showData2(nim2,nama2,jur2,inputan2));
    }
    public static String showData1 (String nim, String nama, String jurusan, String inputan) {
        String status;
        
        int tanggalLahir1 = Integer.parseInt(inputan.substring(0, 2));
        int bulanLahir1 = Integer.parseInt(inputan.substring(3, 5));
        int tahunLahir1 = Integer.parseInt(inputan.substring(6, 10));

        int tanggalHari1 = Integer.parseInt(tanggal.format(date));
        int bulanHari1 = Integer.parseInt(bulan.format(date));
        int tahunHari1 = Integer.parseInt(tahun.format(date));

        int totalTahun1 = tahunHari1 - tahunLahir1;
        
        if (totalTahun1 < 20)
            status = "Teen";
        else
            status = "Adult";
        
        String show = "\nnim : \n"+nim + "\nnama : \n"+ nama + "\nJurusan : \n" + jurusan + "\nStatus : \n" + status;
        
        return show;
    }
    
    public static String showData2 (String nim, String nama, String jurusan, String inputan) {
        String status;
        
        int tanggalLahir2 = Integer.parseInt(inputan2.substring(0, 2));
        int bulanLahir2 = Integer.parseInt(inputan2.substring(3, 5));
        int tahunLahir2 = Integer.parseInt(inputan2.substring(6, 10));

        int tanggalHari2 = Integer.parseInt(tanggal.format(date));
        int bulanHari2 = Integer.parseInt(bulan.format(date));
        int tahunHari2 = Integer.parseInt(tahun.format(date));

        int totalTahun2 = tahunHari2 - tahunLahir2;
        
        if (totalTahun2 < 20)
            status = "Teen";
        else
            status = "Adult";
        
        String show = "\nnim : \n"+nim + "\nnama : \n"+ nama + "\nJurusan : \n" + jurusan + "\nStatus : \n" + status;
        
        return show;
    }
}