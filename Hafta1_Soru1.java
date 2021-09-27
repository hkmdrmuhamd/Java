
package hafta1_soru1;

import java.util.Scanner;

public class Hafta1_Soru1 {

    public static void main(String[] args) {
        Dizi arr = new Dizi();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Sayi 1:");
        String sayi1 = scan.nextLine();
        System.out.print("Sayi 2:");
        String sayi2 = scan.nextLine();
        arr.yerlestirme(sayi1, sayi2);
        arr.toplama();
        arr.showInfos();
    }
    
}
