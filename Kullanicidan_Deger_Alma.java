/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanicidan_deger_alma;

import java.util.Scanner; //Kullanicidan deger almak için scanner metodunu import ettik

/**
 *
 * @author muhammed
 */
public class Kullanicidan_Deger_Alma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz notu giriniz: ");
        int not = deger.nextInt();
        if (not >90){
            System.out.println("Harf notunuz AA");
        }
        else if (not < 90 && not > 80){
            System.out.println("Harf notunuz BB");
        }
        else if (not <80 && not >70){
            System.out.println("Harf notunuz CC");
        }
        else if (not <70){
            System.out.println("Harf notunuz FF");
        }
    }
    
}
