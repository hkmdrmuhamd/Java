/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faktoriyel;

import java.util.Scanner;

/**
 *
 * @author muhammed
 */
public class Faktoriyel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner deger = new Scanner(System.in);
        System.out.print("Faktoriyelini hesaplamak istediginiz sayiyi giriniz:");
        int sayi = deger.nextInt();  //next.Int = kullanicidan alinan degeri sayiya aktarir.
        int temp = sayi;
        for(int i = 1; i < sayi; i++){
            temp*=i;
        }
        System.out.println("Faktoriyel:"+temp);
    }
    
}
