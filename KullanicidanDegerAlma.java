/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanicidandegeralma;

import java.util.Scanner;

/**
 *
 * @author muhammed
 */
public class KullanicidanDegerAlma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);
        System.out.println("Bir tam sayi degeri giriniz:");
        
        double aktarma = deger.nextDouble(); //nextDouble = nextInt gibi deger aktarmada kullanilir. Double degerleri aktarir.
        System.out.println("aktarilan deger= "+aktarma);
    }
    
}
