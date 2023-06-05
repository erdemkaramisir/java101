package donguler;
import java.util.Scanner;

public class Java38 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi;
        int tekrar;

        int faktoriyel = 1;
        long kombinasyon = 1;
        long rKombinasyon = 1;
        long fKombinasyon = 1;

        System.out.print(" Kombinasyonu hesaplanacak küme sayısını giriniz :");

        sayi = scanner.nextInt();

        System.out.print(" Kümenin farklı grup sayısını giriniz :");

        tekrar = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {
            faktoriyel = faktoriyel * i;

        }

        for (int i = 1; i <= tekrar; i++) {
            rKombinasyon = rKombinasyon * i;
        }

        for (int i = 1; i <= (sayi - tekrar); i++) {
            fKombinasyon = fKombinasyon * i;
        }

        kombinasyon = faktoriyel / (rKombinasyon * (fKombinasyon));

        System.out.print(" Sonuç :" + kombinasyon);
    }
}
