import java.util.Scanner;

public class java18 {
    public static void main(String[] args) {
        
      int a,b;
      double c;
      
      Scanner scan= new Scanner(System.in);

      System.out.println(" Birinci Keanrı Giriniz :");
      a= scan.nextInt();

      System.out.println(" İkinci Kenarı Giriniz ");
      b= scan.nextInt();

        c= Math.sqrt((a*a)+ ( b*b));
        

        System.out.println(" Uzun kenar : " + c);


        
    }
}
