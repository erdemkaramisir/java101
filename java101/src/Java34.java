import java.util.Scanner;

public class Java34 {
    public static void main(String[] args) {

        System.out.println(" Artık yılı bulan program ");

        Scanner scan = new Scanner(System.in);

        System.out.println(" Bir Yıl Giriniz ");

        int yil = scan.nextInt();

        boolean artikYil = false;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artikYil = true;

                }
            }
        }

        if (artikYil) {
            System.out.println(yil + " yılı bir artık yıldır");
        } else {
            System.out.println(yil + " yılı bir artık yıl değildir ");
        }

    }
}
