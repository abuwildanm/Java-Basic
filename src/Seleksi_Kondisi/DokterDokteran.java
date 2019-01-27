package Seleksi_Kondisi;

import java.util.Scanner;

public class DokterDokteran {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int sakitapa;
        
        System.out.println("*** Program Dokter - Dokteran *** \n");
        
        System.out.println("Sakitnya apa?\n(1)Kepala\n(2)Perut\n(3)Kaki/tangan\n(4)Hati\n");
        System.out.print("Input yang anda rasakan (dengan angka diatas) : ");
        sakitapa = masuk.nextInt();
        
        if (sakitapa == 1)
        {
            System.out.println("\nSakitnya sebelah mana?\n(1)Sebagian\n(2)Semuanya\n");
            System.out.print("Input yang anda rasakan (dengan angka diatas) : ");
            int sebelahmana;
            sebelahmana = masuk.nextInt();
            
            if (sebelahmana == 1)
            {
                System.out.println("\nTatapkan tembok");
            }
            else if (sebelahmana == 2)
            {
                System.out.println("\nSakitnya gimana?\n(1)Senut-senut\n(2)Cekot-cekot\n(3)Muter-muter\n");
                int bagaimana;
                System.out.print("Input yang anda rasakan (dengan angka diatas) : ");
                bagaimana = masuk.nextInt();
                
                if (bagaimana == 1)
                {
                    System.out.println("\nMakan uang");
                }
                else if (bagaimana == 2)
                {
                    System.out.println("\nMakan krupuk");
                }
                else if (bagaimana == 3)
                {
                    System.out.println("\nPuter balik");
                }
                else
                {
                    System.out.println("\nPilihan tidak ada");
                }
            }
            else
            {
                System.out.println("\nPilihan tidak ada");
            }
        }
        else if (sakitapa == 2)
        {
            System.out.println("\nSakitnya gimana?\n(1)Mules\n(2)Perih\n");
            int bagaimana;
            System.out.print("Input yang anda rasakan (dengan angka diatas) : ");
            bagaimana = masuk.nextInt();
            
            if (bagaimana == 1)
            {
                System.out.println("\nCari WC");
            }
            else if (bagaimana == 2)
            {
                System.out.println("\nMinum Obat Maag");
            }
            else
            {
                System.out.println("\nPilihan tidak ada");
            }
        }
        else if (sakitapa == 3)
        {
            System.out.println("\nAmputasi");
        }
        else if (sakitapa == 4)
        {
            System.out.println("\nBerdoa");
        }
        else
        {
            System.out.println("\nPilihan tidak ada");
        }
    }
    
}
