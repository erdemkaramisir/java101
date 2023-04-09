import java.util.Scanner;

public class java28 {
    public static void main(String[] args) {
      
        int mat, fizik, turkce,  kimya, muzik;
        

        Scanner scan = new Scanner( System.in);

        System.out.print(" Matematik notunuz : ");
        mat= scan.nextInt();

        System.out.print(" Fizik notunuz : ");
        fizik= scan.nextInt();

        System.out.print(" Türkçe notunuz : ");
        turkce= scan.nextInt();



        System.out.print(" Kimya notunuz : ");
        kimya= scan.nextInt();

        System.out.print(" Müzik notunuz : ");
        muzik= scan.nextInt();

        double avarage= (( mat+ fizik+ kimya + muzik)/ 5);

        if ( avarage<55){

            System.out.println(" Not ortalamanız " + avarage + " Sınıfta kaldınız seneye görüşmek üzere hoşçakalın ");
        }else {
            System.out.println(" Not ortalamanız :"+ avarage+ " Sınıfı geçtiniz :) yolunuz bahtınız açık olsun ");
        }

    }
}
