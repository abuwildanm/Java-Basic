package Method;

public class Kelas_Math {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println("");
        
        //fungsi sinus,cosinus,tangen
        System.out.println("Sinus 30 = "+Math.sin(Math.toRadians(30)));
        System.out.println("Cosinus 30 = "+Math.cos(Math.toRadians(30)));
        System.out.println("Tangen 45 = "+Math.tan(Math.toRadians(45)));
        System.out.println("");
        
        //fungsi eksponensial
        System.out.println("e pangkat 3 = "+ Math.exp(3));
        System.out.println("log 10 base e = "+Math.log(10));
        System.out.println("2 pangkat 3 = "+Math.pow(2,3));
        System.out.println("akar 16 = "+Math.sqrt(16));
        System.out.println("");
        
        //fungsi rounding
        System.out.println("Nilai Mutlak -46.98 = "+Math.abs(-46.98));
        System.out.println("Max = "+Math.max(6.9,8.3));
        System.out.println("Min = "+Math.min(9.45,6.52));
        System.out.println("Pembulatna 5.7 = "+Math.round(5.7));
        System.out.println("Pembulatan Keatas 6.1 = "+Math.ceil(6.1));
        System.out.println("Pembulatan Kebawah 6.5 = "+Math.floor(6.5));
        System.out.println("");
        
        //fungsi random
        System.out.println("Nilai random 1-10 ="+ (int)(Math.random()*10));
    }
    
}
