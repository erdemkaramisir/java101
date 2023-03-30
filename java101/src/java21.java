import java.util.Scanner;

public class java21 {
    public static void main(String[] args) {
    double boy, kilo ;
     
        Scanner scan = new Scanner(System.in);

     System.out.print( " Lütfen boyunuzu( metre cinsinden)  giriniz (metre ile cm' yi ayırmak için , kullanın)  :" );
     boy= scan.nextDouble();

     System.out.print(" Lütfen Kilonuzu giriniz  : ");
     kilo= scan.nextDouble();

     System.out.println(" Vücut kitle endeksiniz " + (kilo/(boy*boy)));



    }
}
