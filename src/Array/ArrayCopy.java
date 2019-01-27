package Array;

public class ArrayCopy {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7};
        int[] array2 = new int[5];
        System.arraycopy(array1, 4, array2, 1, 3);

        System.out.print("Array1 : ");
        for(int n=0; n<array1.length; n++)
            System.out.print(array1[n] +" ");

        System.out.println();

        System.out.print("Array2 : ");
        for(int n=0; n<array2.length;n++)
            System.out.print(array2[n]+" ");
    }
    
}

//System.arraycopy(nilai, i, nilaibaru, j, n);
//nilai = array asal
//nilaibaru = array tujuan
//i = posisi indeks awal pengopian pada array asal
//j = posisi indeks awal pengopian pada array tujuan 
//n = jumlah elemen yang dikopi