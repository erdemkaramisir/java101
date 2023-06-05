package temel;
import java.util.Scanner;

public class java19 {
    public static void main(String[] args) {

        int km;
        double perKm = 2.20, total=0, startPrice = 10;

        Scanner scan = new Scanner(System.in);

        System.out.print(" Mesafeyi KM cinsinden giriniz ");
        km = scan.nextInt();


        total += (km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;

        System.out.println("Toplam tutar :" + total);

    }
}
