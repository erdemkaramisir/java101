package donguler;

import java.util.Scanner;

public class Java37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Bir sayı Giriniz ");
        int sayi= scan.nextInt();

        System.out.println(" Girilen sayının 4' ün kuvvetleri :");
        for(int i=1; i<=sayi; i=i*4){
            System.out.println(i);
        }

        System.out.println(" Girilen sayının 5' in kuvvatleri : ");
        for( int j=1; j<=sayi; j=j*5){
            System.out.println(j);
        }


    }
}
