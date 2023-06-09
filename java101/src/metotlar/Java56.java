package metotlar;

import java.util.Scanner;

public class Java56 {

    public static int hesapla(int taban, int us ){
        if( us==0 ){
            return 1;
        }else{
            int sonuc=taban* hesapla(taban, (us-1));
            return sonuc;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);

        System.out.print(" Tabanı giriniz :" );
        int taban= scanner.nextInt();

        System.out.print(" Üssü giriniz :");
        int us= scanner.nextInt();

        System.out.println(" Sonuc :"+ hesapla(taban, us));




    }
}

