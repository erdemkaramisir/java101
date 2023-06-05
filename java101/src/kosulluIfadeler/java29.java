package kosulluIfadeler;
import java.util.Scanner;

public class java29 {
    public static void main(String[] args) {

        int heat;
        Scanner scan = new Scanner(System.in);

        System.out.print(" Sıcak değerini giriniz :");

        heat= scan.nextInt();

        if ( heat<5){
            System.out.println(" Kayak yapabilirsiniz ");
        }else if (  heat <=25){

            if ( heat<= 15){
                System.out.println(" Sinemaya gidebilirsiniz ");

            }if (heat>= 10 ){
                System.out.println(" Pikniğe gidebiliriniz ");
            }
        }else{
            System.out.println(" Yüzmeye gidebilirsiniz ");
        }
    }
}
