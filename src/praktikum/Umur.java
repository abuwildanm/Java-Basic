package praktikum;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Umur {
    private int th_start; 
    private int bln_start; 
    private int tgl_start;    
    private int tgl_end; 
    private int th_end;
    private int bln_end;
    private int th_hasil=0;
    private int bln_hasil=0;
    private int tgl_hasil=0;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    
    public Umur(Calendar start, Calendar end){
        String split_start[] = sdf.format(start.getTime()).split("-");
        th_start = Integer.valueOf(split_start[2]);
        bln_start = Integer.valueOf(split_start[1]);
        tgl_start = Integer.valueOf(split_start[0]);
        
        String split_end[] = sdf.format(end.getTime()).split("-");
        tgl_end = Integer.valueOf(split_end[0]);
        bln_end = Integer.valueOf(split_end[1]);
        th_end = Integer.valueOf(split_end[2]);        
    }
    
    public void hitung_umur(){
        if ((tgl_end > tgl_start) && (bln_end > (bln_start - 1))){
            tgl_hasil = tgl_start + 30 - tgl_end;
            bln_hasil = (bln_start - 1) + 12 - bln_end;
            th_hasil = (th_start - 1) - th_end;
        }
        else if ((tgl_end > tgl_start) && (bln_end <= (bln_start - 1))){
            tgl_hasil = tgl_start + 30 - tgl_end;
            bln_hasil = bln_start - 1 - bln_end;
            th_hasil = th_start - th_end;
        }
        else if ((tgl_end <= tgl_start) && (bln_end > bln_start)){
            tgl_hasil = tgl_start - tgl_end;
            bln_hasil = bln_start + 12 - bln_end;
            th_hasil = (th_start - 1) - th_end;
        }
        else {
            tgl_hasil = tgl_start - tgl_end;
            bln_hasil = bln_start - bln_end;
            th_hasil = th_start - th_end;
        }
    }
    
    public int getUmur(){
        return th_hasil;
    }
    
    @Override
    public String toString(){
        String detail = "";
        if(th_hasil>0)
            detail+=th_hasil+" tahun ";
        if(bln_hasil>0)
            detail+=bln_hasil+" bulan ";
        if(tgl_hasil>0)
            detail+=tgl_hasil+" hari";
        if(detail.equals(""))
            detail = "-";
        return detail;
    }
    
    public int getTahun(){
        return th_hasil;
    }
    
    public int getBulan(){
        return bln_hasil;
    }
    
    public int getTanggal(){
        return tgl_hasil;
    }
    
    public int getTahunSkrg(){
        return th_start;
    }
    
    public static void main(String[]args){
        Calendar start = Calendar.getInstance();
        start.set(2016+1900, 11, 15);//set tahun awal
        
        Calendar end = Calendar.getInstance();
        end.set(1992+1900, 12, 26);//set tahun akhir
        
        Umur umur = new Umur(start, end);
        umur.hitung_umur();
        System.out.println(umur.toString());
    }
}
