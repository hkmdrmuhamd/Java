/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanicidan_string_deger_alma;

import java.util.Scanner;

/**
 *
 * @author muhammed
 */
public class Kullanicidan_String_Deger_Alma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.print("Lutfen adinizi giriniz:");
        
        String ad = string.nextLine(); //nextLine = string degerlerin aktarilmasini saglar.
        
        System.out.println(ad);
    }
    
}
