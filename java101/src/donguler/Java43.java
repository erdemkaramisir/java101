package donguler;

import java.util.Scanner;

public class Java43 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Lütfen bir sayı giriniz  :");

        int sayi = scanner.nextInt();

        int kalan = 0;
        int toplam = 0;

        while (sayi != 0) {

            kalan = sayi % 10;
            System.out.print(kalan + ",");
            toplam += kalan;

            sayi /= 10;

        }

        System.out.println(" Girilen sayının rakamları toplamı :" + toplam);

    }
}
