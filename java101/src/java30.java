import java.util.Scanner;

public class java30 {
    public static void main(String[] args) {

        int a, b, c;

        System.out.println(" Merhaba gireceğiniz 3 sayıyının büyüklük küçüklük sıralamasını yapacağız. \n  Lütfen birbirine eşit olmayan sayılar giriniz.  ");
        Scanner scan = new Scanner(System.in);

        System.out.println(" A sayısını giriniz");
        a = scan.nextInt();

        System.out.println(" B sayısını giriniz :");
        b = scan.nextInt();

        System.out.println(" C sayısını giriniz :");
        c = scan.nextInt();

        if (a > b && a > c) {
            if (b > c) {
                System.out.println(" a>b>c");
            } else {
                System.out.println(" a>c>b");
            }
        }

        if (b > a && b > c) {
            if (a > c) {

                System.out.println(" b>a>c ");
            } else {
                System.out.println("b>c>a ");
            }
        }
        if (c > a && c > b) {
            if (a > b) {
                System.out.println(" c>a>b");
            } else {
                System.out.println(" c>b>a");
            }
        }
    }
}

