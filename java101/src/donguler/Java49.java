package donguler;


import java.util.Scanner;

public class Java49 {
    public static void main(String[] args) {
        int sayi;
        int toplam = 0;
        Scanner scan = new Scanner( System.in);

        System.out.print(" Bir sayı Giriniz :");
        sayi = scan.nextInt();
        
        for(int i=1; i < sayi; i++){
            if ( sayi%i == 0)
                toplam +=i;
        }

        if (sayi == toplam){
            System.out.println(" Girdiğiniz sayı mükemmel sayıdır "+ sayi);
        }else{
            System.out.println(" Girdiğiniz sayı mükemmel sayı  değildir "+ sayi);
        }
    }
}
