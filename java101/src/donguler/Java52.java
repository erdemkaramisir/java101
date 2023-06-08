package donguler;

public class Java52 {
    public static void main(String[] args) {

        // int max = Integer.MAX_VALUE;
        int max = 20;
        int sayi1 = 0;
        int sayi2 = 1;
        int sayi3;

        for (int i = 0; i < max; i++) {

            if (i <= 1)
                sayi3 = i;
            else {
                sayi3 = sayi1 + sayi2;
                sayi1 = sayi2;
                sayi2 = sayi3;
            }
            System.out.print(sayi3 + " ");

        }
    }
}
