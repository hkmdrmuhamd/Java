package stringde_harfler_disindaki_rakamlari_bulma;

import java.util.Arrays;
import java.util.Scanner;

public class Stringde_Harfler_Disindaki_Rakamlari_Bulma {

    public static void main(String[] args) {
        String arrRakam[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String temp = "";
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Bir veri giriniz:");
        String veri = scan.nextLine();
        
        String arr[] = new String[veri.length()];
        
        for (int i = 0; i < veri.length(); i++) {
            arr[i] = veri.substring(i, (i + 1));
        }
        System.out.println("Girilen tüm veri: " + Arrays.toString(arr));
        for (int j = 0; j < veri.length(); j++) {
            for (int k = 0; k < arrRakam.length; k++) {
                if ((arr[j].equals(arrRakam[k]))) {
                    temp += arr[j];
                }
            }
        }
        System.out.println("Haciri veriler: " + temp);
    }

}
