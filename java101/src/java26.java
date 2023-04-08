import java.util.Scanner;

public class java26 {
    public static void main(String[] args) {

        int n1, n2;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Lütfen bir sayı giriniz ");

        n1 = scanner.nextInt();

        System.out.println((" İkinci sayıyı giriniz "));

        n2 = scanner.nextInt();

        System.out.println(n1 + n2);

        System.out.println(" 1- Toplama \n 2- Çıkarma \n 3- Çarpma \n 4- Bölme");
        System.out.println(" Seçiminiz :");
        int select = scanner.nextInt();
        System.out.println(select);

        if (select == 1) {
            System.out.println(" Toplama :" + (n1 + n2));
        } else if (select == 2) {
            System.out.println(" Çıkarma :" + (n1 - n2));

        } else if (select == 3) {
            System.out.println(" Çarpma :" + (n1 * n2));

        } else if (select == 4) {
            if (n2 != 0) {
                System.out.println(" Bölme " + (n1 / n2));
            } else {
                System.out.println(" Sıfırdan farklı bir sayı giriniz!");
            }

        } else {
            System.out.println(" Geçersiz bir işlem yaptınız ");
        }

    }
}
