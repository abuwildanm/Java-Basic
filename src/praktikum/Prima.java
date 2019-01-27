package praktikum;

public class Prima {

    public static void main(String[] args) {
        Prima prima = new Prima();
        
        prima.bacaPrima(7);
        System.out.println("");
        prima.tampilPrima(100);
        prima.tampilPrimaSebanyak(12);
    }
    
    public boolean cekPrima(int angka){
        int counter = 0; // Untuk membantu penghitungan
        for (int i = 2; i < angka; i++) {
            if(angka % i == 0){
                counter++; // Perbaharui nilai counter
            }
        }
        
        if(angka > 0 && counter == 0){
            return true;
        }
        return false;
    }
    
    public void bacaPrima(int angka){
        Prima prima = new Prima();
        if(prima.cekPrima(angka)){
            System.out.println(angka + " adalah angka prima");
        }else{
            System.out.println(angka + " bukan angka prima");
        }
    }
    
    public void tampilPrima(int batas){
        Prima prima = new Prima();
        int counter = 1;
        System.out.print("Angka prima sampai angka " + batas + " : 2");
        for (int i = 3; i <= batas; i++) {
            if(prima.cekPrima(i)){
                System.out.print(" , " + i);
                counter++;
            }
        }
        System.out.println("\nTotal angka prima adalah "+ counter);
    }
    
    public void tampilPrimaSebanyak(int batas){
        Prima prima = new Prima();
        int counter = 0;
        int angka = 3;
        
        System.out.print("Angka prima sebanyak " + batas + " : 2");
        while(true){
            if(prima.cekPrima(angka)){
                counter++;
                System.out.print(" , " + angka);
                
            }
            
            if(counter == batas){
                break;
            }
            
            
            angka++;
        }
    }
}
