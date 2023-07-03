package metotlar;

import java.util.Scanner;

public class Java58 {
    public static void main(String[] args) {
       System.out.println(" Herhangi bir sayı giriniz :");

       Scanner scanner = new Scanner(System.in);
       int n= scanner.nextInt();
        System.out.println("Girdiğiniz sayı : " + n);
        hesapla(n);
    }

    public static void hesapla(int value) {
        System.out.print(value + " ");

        if (value <= 0) {
            return;
        }

        hesapla(value - 5);
        System.out.print(value + " ");
        // burada değeri arttıran biz değiliz recursive metodların bir hilesi var. kendi içerisinde sayaç tutuyor ve değeri kendiğinden arttırıyor. 
    }
}
