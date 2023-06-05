import java.util.Scanner;

public class Java36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        do {
            System.out.println(" Lütfen bir sayı giriniz : ");
            sayi = scanner.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;

            }

        } while (sayi % 2 == 0);

        System.out.println(" Tek sayı girilene kadar girilen sayıların 2 ve 4 ' bölünebilenlerin toplamı " + toplam);
    }
}
