package Star;

import java.util.Scanner;

public class Hesaplama {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int star;
        System.out.print("Yildiz sayisini giriniz: ");
        star = input.nextInt();

        for (int i = 0; i <= star ; i++) {
            for (int j = 0; j < (star - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
