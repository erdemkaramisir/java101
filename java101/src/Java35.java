import java.util.Scanner;

public class Java35 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Lütfen bir sayı giriniz ");
        int sayi = scanner.nextInt();

        int i = 1;
        while (i < sayi) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
