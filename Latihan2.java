
public class Latihan2 {

    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        int c = 528;
        int d = 70;
        int e = 256;
        int f = 3;
        int g = 128;
        int h = 5;
        int i = 600;
        int j = 4;
        int k = 423;
        int l = 2;
        int hasil;
        
        hasil = a & b;
        System.out.println("Hasil dari a & b = " + hasil );
        System.out.println("---------------------");
        
        hasil = c | d;
        System.out.println("Hasil dari c | d = " + hasil);
        System.out.print("----------------------");
        
        hasil = e >> f;
        System.out.println("Hasil dari e >> f = " + hasil);
        System.out.print("---------------------");
        
        hasil = g << h;
        System.out.println("Hasil dari g << h = " + hasil);
        System.out.println("-------------------");
        
        hasil = i >> j;
        System.out.println("Hasil dari i >> j = " + hasil);
        System.out.println("-------------------");
        
        hasil = k << l;
        System.out.println("Hasil datri k << l = " + hasil);
        System.out.println("-------------------");
    }
    
}
