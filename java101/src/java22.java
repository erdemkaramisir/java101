import java.util.Scanner;

public class java22 {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5;
        double armutk, elmak, domatesk, muzk, patlıcank, hesap;
        Scanner scan = new Scanner(System.in);

        System.out.print(" Armut kaç kilo ? :");
        armutk = scan.nextDouble();
        System.out.print(" Elma kaç kilo ? :");
        elmak = scan.nextDouble();
        System.out.print(" Domates kaç kilo ? :");
        domatesk = scan.nextDouble();
        System.out.print(" Muz kaç kilo ? :");
        muzk = scan.nextDouble();
        System.out.print(" Patıcan kaç kilo ? :");
        patlıcank = scan.nextDouble();

        hesap = ((armut * armutk) + (elma * elmak) + (domates * domatesk) + (muz * muzk) + (patlıcan * patlıcank));
        System.out.println(" Toplam Tutar :" + hesap + "TL");
    }
}
