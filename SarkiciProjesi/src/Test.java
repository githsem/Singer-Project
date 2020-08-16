
import java.util.Scanner;


public class Test {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);
    public static void islemleri_bastir(){
        System.out.println("\t 0-Islemleri Goruntule");
        System.out.println("\t 1-Sarkicilari Goruntule");
        System.out.println("\t 2-Sarkici Ekle");
        System.out.println("\t 3-Sarkici Guncelle");
        System.out.println("\t 4-Sarkici Sil");
        System.out.println("\t 5-Sarkici Ara");
        System.out.println("\t 6-Uygulamadan Cik");
    }
    
    
    public static void main(String[] args) {
        System.out.println(" Sarkici Uygulamasina Hosgeldiniz...");
        islemleri_bastir();
    }
    
}
