package donguler;

import java.util.Scanner;

public class Java45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmas çizmek için bir sayı girin : ");
        int yukseklik = scanner.nextInt();

        int boslukSayisi = yukseklik - 1;// bir tane yıldıza yer bırakıyoruz
        int yildizSayisi = 1;
        //üç değişken ile ilerliyoruz
        // 1- döngü miktarı
        // 2 - boşluk sayısı ( boşluk sayısını her döngüde azaltıyoruz)
        // 3- yıldız sayısı ( yıldız sayısını her döngüde arttırıyoruz)
        // Elmasın üst kısmını çizdirme
        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }

            System.out.println();
            boslukSayisi--;
            yildizSayisi += 2;
        }
        // burada yeni bir denklem kuruyoruz
        // 
        boslukSayisi = 1;
        yildizSayisi = yukseklik * 2 - 3;

        // Elmasın alt kısmını çizdirme

        for (int i = 0; i < yukseklik - 1; i++) {
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }

            System.out.println();
            boslukSayisi++;
            yildizSayisi -= 2;
        }
    }
}
