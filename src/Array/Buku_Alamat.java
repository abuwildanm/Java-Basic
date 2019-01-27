package Array;

public class Buku_Alamat {

    public static void main(String[] args) {
        String[][][] entry = {{{"Florence", "735-1234", "Manila"}, {"Joyce", "983-3333", "Quezon City"}, {"Becca", "456-3322", "Manila"}}};
        
        System.out.println("Nama    : " + entry[0][0][0]);
        System.out.println("Telp    : " + entry[0][0][1]);
        System.out.println("Address : " + entry[0][0][2]);
        System.out.println("");
        System.out.println("Nama    : " + entry[0][1][0]);
        System.out.println("Telp    : " + entry[0][1][1]);
        System.out.println("Address : " + entry[0][1][2]);
        System.out.println("");
        System.out.println("Nama    : " + entry[0][2][0]);
        System.out.println("Telp    : " + entry[0][2][1]);
        System.out.println("Address : " + entry[0][2][2]);
        System.out.println("");
        
        for (int i = 0; i < 1; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                for (int k = 0; k < 3; k++)
                {
                    if (i == 0 && k == 0)
                        System.out.println("Nama : " + entry[0][j][0]);
                    
                    if (i == 0 && k == 1)
                        System.out.println("Telp : " + entry[0][j][1]);
                    
                    if (i == 0 && k == 2)
                        System.out.println("Address : " + entry[0][j][2]);
                    
//                    System.out.println("Nama : " + entry[i][j][k]);
                }
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("");
        
    }
    
}
