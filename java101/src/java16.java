
import java.util.Scanner;

public class java16 {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner scan = new Scanner(System.in);

        System.out.println(" Matematik Notunuz :");
        mat = scan.nextInt();

        System.out.println(" Fizik Notunuz :");
        fizik = scan.nextInt();

        System.out.println(" Kimya Notunuz :");
        kimya = scan.nextInt();

        System.out.println(" Türkçe Notunuz :");
        turkce = scan.nextInt();

        System.out.println(" Tarih Notunuz :");
        tarih = scan.nextInt();

        System.out.println(" Müzik Notunuz :");
        muzik = scan.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

        double sonuc = (toplam / 6);

        System.out.println(" Ortalamanız  :" + sonuc);

        System.out.println(sonuc >= 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");

    }
}
