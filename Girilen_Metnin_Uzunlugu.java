
package girilen_metnin_uzunlugu;

import java.util.Scanner;

public class Girilen_Metnin_Uzunlugu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bir kelime giriniz:");
        
        String kelime = scan.nextLine();
        Uzunluk boyut = new Uzunluk(kelime);
        
        boyut.show();
    }
    
}
