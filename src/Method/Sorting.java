package Method;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] b = {5,6,1,7,2,3};
        
        sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
    
    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++)
        {   
            for (int j = 0; j < a.length-1; j++)
            {
                //	Tampilkan proses Iterasi
                if(a[j] > a[j+1])
                {
                    //	proses pertukaran bilangan
                    int tukar = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tukar;
		}
            }
        }
        
        return a;
    }
}
