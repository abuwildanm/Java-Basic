package Seleksi_Kondisi;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
          String jalurmasuk;
        
          Scanner masuk = new Scanner(System.in);
          System.out.print("Bagaimana jalur masuk anda : ");
          jalurmasuk = masuk.next();
        
          switch (jalurmasuk){
              case "undangan" :
                System.out.println("SNMPTN");
                break;
              case "reguler" :
                System.out.println("SBMPTN");
                break;
              case "test" :
                System.out.println("SPMK");
                break;
              default :
                System.out.println("Ilegal");
                break;
        }
    }
    
}
