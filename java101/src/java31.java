import java.util.Scanner;

public class java31 {
    public static void main(String[] args) {
        int ay, gun;
        String burc = "";
        boolean isError = false;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Doğum ayınızı girin : ");
        ay = scan.nextInt();

        System.out.print("Doğum gününüzü girin : ");
        gun = scan.nextInt();


        switch (ay) {
            case 1:
                if (gun < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
                break;
            case 2:
                if (gun < 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
                break;
            case 3:
                if (gun < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
                break;
            case 4:
                if (gun < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
                break;
            case 5:
                if (gun < 22) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
                break;
            case 6:
                if (gun < 23) {
                    burc = "İkizler";
                } else {
                    burc = "Yengeç";
                }
                break;
            case 7:
                if (gun < 23) {
                    burc = "Yengeç";
                } else {
                    burc = "Aslan";
                }
                break;
            case 8:
                if (gun < 23) {
                    burc = "Aslan";
                } else {
                    burc = "Başak";
                }
                break;
            case 9:
                if (gun < 23) {
                    burc = "Başak";
                } else {
                    burc = "Terazi";
                }
                break;
            case 10:
                if (gun < 23) {
                    burc = "Terazi";
                } else {
                    burc = "Akrep";
                }
                break;
            case 11:
                if (gun < 22) {
                    burc = "Akrep";
                } else {
                    burc = "Yay";
                }
                break;
            case 12:
                if (gun < 22) {
                    burc = "Yay";
                } else {
                    burc = "Oğlak";
                }
                break;
            default:
                System.out.println("Hatalı ay veya gün girdiniz!");
                isError = true;
                break;
        }

        if (!isError) {
            System.out.println("Burcunuz: " + burc);
        } else {
            System.out.println("Hatalı giriş yaptınız!");
        }
    }
}
