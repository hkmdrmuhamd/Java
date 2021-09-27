/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanicidan_alinan_sayinin_rakamlari_toplami;

import java.util.Scanner;

/**
 *
 * @author muhammed
 */
public class Kullanicidan_Alinan_Sayinin_Rakamlari_Toplami {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz:");
        int sayi = scan.nextInt();
        int toplam = 0;
        while (sayi >= 1){
            toplam += sayi % 10;
            sayi = sayi /10;
        }
        System.out.println("Girdiginiz sayilarin toplami:" + toplam);
        
        
    }
    
}
