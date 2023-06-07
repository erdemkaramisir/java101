package donguler;



public class Java51 {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            int sayac = 0; 

            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    sayac++;
                    break; 
                }
            }

            if (sayac == 0) {
                System.out.println(i + " bir asal sayıdır");
            }
        }
    }
}
