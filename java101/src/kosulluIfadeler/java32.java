package kosulluIfadeler;
import java.util.Scanner;

public class java32 {
    public static void main(String[] args)  {

        System.out.println(" Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan program.");

        

        Scanner scan = new Scanner(System.in);

        System.out.print(" Mesafeyi giriniz ( km ) ");

        int mesafe= scan.nextInt();

        System.out.print(" Yaşınızı Giriniz:");

        int yas= scan.nextInt();

        System.out.print(" Yolculuk tipi ( 1: TekYön, 2: Gidiş- Dönüş)");

        int yolculukTipi=scan.nextInt();

        scan.close();

if( mesafe<0 || yas <0 || ( yolculukTipi !=1 && yolculukTipi != 2)){

    
    System.out.println(" Hatalı Giriş Yaptınız  ");
    return;
}


        double birimFiyat=0.10;
        double toplamFiyat= mesafe*birimFiyat;
   
        
        if (yas < 12) {
            toplamFiyat = toplamFiyat* 0.5;
        } else if (yas >= 12 && yas <= 24) {
            toplamFiyat = toplamFiyat* 0.9; 
        } else if (yas >= 65) {
            toplamFiyat =toplamFiyat* 0.7; 
        }

        if (yolculukTipi == 2) {
            toplamFiyat = toplamFiyat* 0.8; 
        }

        System.out.println("Toplam Bilet Fiyatı: " + toplamFiyat + " TL");
    }


    }
