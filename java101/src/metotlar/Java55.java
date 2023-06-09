package metotlar;

import java.util.Scanner;

public class Java55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("1- Toplama İşlemi");
            System.out.println("2- Çıkarma İşlemi");
            System.out.println("3- Çarpma İşlemi");
            System.out.println("4- Bölme İşlemi");
            System.out.println("5- Üslü Sayı Hesaplama");
            System.out.println("6- Faktoriyel Hesaplama");
            System.out.println("7- Mod Alma");
            System.out.println("8- Dikdörtgen Alan ve Çevre Hesabı");
            System.out.println("0- Çıkış");
            System.out.print("Seçiminizi yapın: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usHesapla();
                    break;
                case 6:
                    faktoriyelHesapla();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    dikdortgenHesapla();
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
                    break;
            }
        } while (secim != 0);
    }

    public static void toplama() {
        Scanner scanner = new Scanner(System.in);
        int sayi, toplam = 0, i = 1;

        do {
            System.out.print(i + ". sayıyı girin (0 girerek işlemi sonlandırın): ");
            sayi = scanner.nextInt();
            toplam += sayi;
            i++;
        } while (sayi != 0);

        System.out.println("Sonuç: " + toplam);
    }

    public static void cikarma() {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2;

        System.out.print("Birinci sayıyı girin: ");
        sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        sayi2 = scanner.nextInt();

        int fark = sayi1 - sayi2;
        System.out.println("Sonuç: " + fark);
    }

    public static void carpma() {
        Scanner scanner = new Scanner(System.in);
        int sayi, carpim = 1, i = 1;

        do {
            System.out.print(i + ". sayıyı girin (1 girerek çarpma işlemini sonlandırın): ");
            sayi = scanner.nextInt();
            if (sayi == 1) {
                break;
            }
            carpim *= sayi;
            i++;
        } while (true);

        System.out.println("Sonuç: " + carpim);
    }

    public static void bolme() {
        Scanner scanner = new Scanner(System.in);
        double sayi1, sayi2;

        System.out.print("Bölünen sayıyı girin: ");
        sayi1 = scanner.nextDouble();
        System.out.print("Bölen sayıyı girin: ");
        sayi2 = scanner.nextDouble();

        if (sayi2 != 0) {
            double bolum = sayi1 / sayi2;
            System.out.println("Sonuç: " + bolum);
        } else {
            System.out.println("Bir sayıyı sıfıra bölemezsiniz!");
        }
    }

    public static void usHesapla() {
        Scanner scanner = new Scanner(System.in);
        int taban, us;

        System.out.print("Taban değerini girin: ");
        taban = scanner.nextInt();
        System.out.print("Üs değerini girin: ");
        us = scanner.nextInt();

        int sonuc = 1;
        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }

        System.out.println("Sonuç: " + sonuc);
    }

    public static void faktoriyelHesapla() {
        Scanner scanner = new Scanner(System.in);
        int sayi;

        System.out.print("Faktöriyelini hesaplamak istediğiniz sayıyı girin: ");
        sayi = scanner.nextInt();

        int faktoriyel = 1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        System.out.println("Sonuç: " + faktoriyel);
    }

    public static void modAlma() {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2;

        System.out.print("Birinci sayıyı girin: ");
        sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        sayi2 = scanner.nextInt();

        int mod = sayi1 % sayi2;
        System.out.println("Sonuç: " + mod);
    }

    public static void dikdortgenHesapla() {
        Scanner scanner = new Scanner(System.in);
        double uzunKenar, kisaKenar;

        System.out.print("Uzun kenar uzunluğunu girin: ");
        uzunKenar = scanner.nextDouble();
        System.out.print("Kısa kenar uzunluğunu girin: ");
        kisaKenar = scanner.nextDouble();

        double alan = uzunKenar * kisaKenar;
        double cevre = 2 * (uzunKenar + kisaKenar);

        System.out.println("Dikdörtgen Alanı: " + alan);
        System.out.println("Dikdörtgen Çevresi: " + cevre);
    }
}
