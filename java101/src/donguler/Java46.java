package donguler;

import java.util.Scanner;

public class Java46 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean loggedIn = false;
        String kullaniciAdi;
        String parola;
        int sayac = 3;
        int secim;
        int miktar = 0;
        int bakiye = 0;

        while (sayac > 0 && !loggedIn) {
            sayac--;

            System.out.print("Kullanıcı adınızı giriniz: ");
            kullaniciAdi = scanner.nextLine();

            System.out.print("Parolanızı giriniz: ");
            parola = scanner.nextLine();

            if (kullaniciAdi.equals("erdem") && parola.equals("1234")) {
                loggedIn = true;
                System.out.println("Başarılı bir giriş yaptınız.");
                System.out.println("Bankamıza hoş geldiniz.");

                while (true) {
                    System.out.println("\n1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgulama\n" +
                            "4- Çıkış");

                    System.out.print("Lütfen yapacağınız işlemi seçiniz: ");
                    secim = scanner.nextInt();
                    scanner.nextLine(); // Enter karakterini tüket

                    switch (secim) {
                        case 1: {
                            System.out.print("Para miktarı: ");
                            miktar = scanner.nextInt();
                            bakiye += miktar;
                            System.out.println("Para yatırma işlemi tamamlandı.");
                        }
                        break;
                        case 2: {
                            System.out.print("Para miktarı: ");
                            miktar = scanner.nextInt();
                            if (miktar > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiye -= miktar;
                                System.out.println("Para çekme işlemi tamamlandı.");
                            }
                        }
                        break;

                        case 3: {
                            System.out.println("Bakiyeniz: " + bakiye);
                        }
                        break;
                        case 4: {
                            System.out.println("Güle güle.");
                            System.exit(0);
                        }
                        break;
                        default: {
                            System.out.println("Geçersiz bir seçenek girdiniz.");
                        }
                    }
                }
            }
        }

        if (sayac == 0) {
            System.out.println("Üç deneme hakkınızı doldurdunuz. Lütfen bankayla iletişime geçiniz!");
        } else {
            System.out.println("Tekrar görüşmek üzere.");
        }

        scanner.close();
    }
}
