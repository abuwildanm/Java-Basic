package Method;

public class Virus_Array {

    public static void main(String[] args) {
//        int[][] virus = {{100, 110, 110, 100, 150, 210},
//                         {150, 180,  10,  10, 180, 200},
//                         {150,  20,  25,  30, 190, 210},
//                         {250,  20,  25,  35,   5, 200},
//                         {140,  10,  10,   5, 175, 180},
//                         {180, 200, 210, 190, 220, 215}
//                        };
        
        int[] virus = {100, 200, 300, 15, 16, 18, 17, 300, 190};
        
        tandai(4, virus);
        
        for (int i = 0; i < virus.length; i++) {
            System.out.print(virus[i] + " ");
        }
        System.out.println("");
        
//        for (int i = 0; i < virus.length; i++) { // ==> ini kodenya kalo kita pake for
//            if (virus[i] < 100)
//                System.out.print(0 + " ");
//            
//            else
//                System.out.print(virus[i] + " ");
//        }
    }
    
    public static void tandai(int titik, int[] array) {
        if (array[titik] < 100) {
            array[titik] = 0;
            
            if (titik < 4)
                tandai(titik - 1, array);
            
            else
                tandai(titik + 1, array);
        }
        
        else
            System.out.println(array[titik]);
    }
}
