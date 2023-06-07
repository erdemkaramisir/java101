package donguler;

import java.util.Scanner;

public class Java48 {
    public static void main(String[] args) {

        int n;
        int sayi;
        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" en büyük ve en küçük sayıyı bulacağız. Kaç tane sayı girmek istersiniz :");

        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz :");
            sayi = scanner.nextInt();

            if (sayi > enBuyuk)
                enBuyuk = sayi;

            if (sayi < enKucuk)
                enKucuk = sayi;

        }
        System.out.println(" en büyük sayı :" + enBuyuk);
        System.out.println(" en küçük sayı :" + enKucuk);

    }
}
