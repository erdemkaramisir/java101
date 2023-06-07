package donguler;

import java.util.Scanner;

public class Java47 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");
        int sayi1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        int sayi2 = scanner.nextInt();

        int ebob = 0;
        int ekok = 0;
        int n = 1;
        int k = 1;

        while (sayi1 >= n) {
            if (sayi1 % n == 0 && sayi2 % n == 0) {
                ebob = n;
            }

            n++;
        }

        System.out.println("İki sayının ebobu: " + ebob);

        while ((sayi1 * sayi2) >= k) {
            if (sayi1 % k == 0 && sayi2 % k == 0) {
                ekok = k;
                break;
            }
            k++;
        }

        System.out.println("İki sayının ekoku: " + ekok);
    }
}