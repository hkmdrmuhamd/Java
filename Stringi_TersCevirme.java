package stringi_terscevirme;

import java.util.Scanner;

public class Stringi_TersCevirme {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Adiniz Soyadiniz:");
        String ad = scan.nextLine();
        String arr[] = new String[ad.length()];
        String ters = "";

        for (int i = 0; i < ad.length(); i++) {
            arr[i] = ad.substring(i, i + 1);
        }

        for (int i = (arr.length - 1); i >= 0; i--) {
            ters += arr[i];
        }

        System.out.println("Ters hali: " + ters);
    }
}
