import java.util.Scanner;

public class java27 {
    public static void main(String[] args) {

        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print(" Kullanıcı Adınız :");
        userName= inp.nextLine();

        System.out.print(" Şifreniz :");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println(" Giriş yaptınız ");
        }else{
            System.out.println(" Bilgileriniz yanlış ");
        }

    }
}
