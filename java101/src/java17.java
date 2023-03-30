import java.util.Scanner;

public class java17 {
    public static void main(String[] args) {

        double tutar, kdvOran = 0.18;

        Scanner scan = new Scanner(System.in);

        System.out.print(" Ücret tutarını Giriniz  :");
        tutar = scan.nextDouble();

        double kdvTutar = tutar * kdvOran;

        double kdvliTutar = tutar + kdvTutar;

        System.out.println(" Hesapladığımız kdv tutarı :" + kdvTutar);
        System.out.println(" Kdv siz Tutar :" + tutar);
        System.out.println(" Kdv li tutar :" + kdvliTutar);

    }
}
