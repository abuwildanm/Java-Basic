package String;

public class PosisiKarakter {

    public static void main(String[] args) {
        String str1 = "Ilmu Komputer Matematika dan Ilmu Pengetahuan Alam Universitas Gadjah Mada";
        System.out.println(str1.indexOf("Komputer"));
        System.out.println(str1.indexOf("Komputer",10));
        System.out.println(str1.lastIndexOf("Matematika"));
        System.out.println(str1.lastIndexOf("Matematika",10));
        System.out.println(str1.lastIndexOf("Matematika",20));
        System.out.println(str1.indexOf(97));
        System.out.println(str1.indexOf(97,7));
        System.out.println(str1.lastIndexOf(97));
        System.out.println(str1.lastIndexOf(97,7));
    }
    
}
