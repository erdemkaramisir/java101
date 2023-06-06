package donguler;

import java.util.Scanner;

public class Java44 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print(" Lütfen bir sayı giriniz ");
        double sayi= scanner.nextInt();
        double toplam=0;
            for(double i=1; i<=sayi;i++){
                toplam+=(1/i);
            }

            System.out.println(" 1' den "+ sayi+" ' e kadar olan sayıların toplamı ="+ toplam);
    }
}
