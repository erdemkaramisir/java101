package metotlar;

import java.util.Scanner;

public class Java57 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (hesapla(sayi, 2)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }

    public static boolean hesapla(int sayi, int i) {
        if (sayi <= 2) {
            return (sayi == 2);
        }
        if (sayi % i == 0) {
            return false;
        }
        if (i * i > sayi) {
            return true;
        }
        return hesapla(sayi, i + 1);
    }
}
