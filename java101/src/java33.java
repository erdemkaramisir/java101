

import java.util.Scanner;

public class java33 {
    public static void main(String[] args) {
        
        System.out.println( "Çin Zodyağı  ");
        System.out.println(" Lütfen  sadece doğum yılınızı giriniz");

        Scanner scan = new Scanner( System.in);

        int dogumYili= scan.nextInt();


        String cinZodyagi=" bilemedim ben onu";

        switch( dogumYili % 12){
            case 0:
            cinZodyagi=" Maymun";
            break;

            case 1:
            cinZodyagi=" Horoz ";
            break;

            case 2:
            cinZodyagi=" Köpek ";
            break;

            case 3:
            cinZodyagi=" Domuz ";
            break;

            case 4:
            cinZodyagi=" Fare ";
            break;

            case 5:
            cinZodyagi=" Öküz ";
            break;

            case 6:
            cinZodyagi=" Kaplan";
            break;

            case 7:
            cinZodyagi=" Tavşan ";
            break;
            
            case 8:
            cinZodyagi=" Ejderya ";
            break;

            case 9:
            cinZodyagi=" Yılan ";
            break;

            case 10:
            cinZodyagi=" At";
            break;

            case 11:
            cinZodyagi=" Koyun ";
            break;

            default:
                break;

        }

        System.out.println(" Çin Zodyağı Burcunuz" + cinZodyagi);




        
    }
}
