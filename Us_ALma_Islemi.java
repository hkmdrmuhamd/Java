/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us_alma_ıslemi;

import java.util.Scanner;

/**
 *
 * @author muhammed
 */
public class Us_Alma_Islemi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sayac = 1;
        int temp = 0;
        Scanner taban = new Scanner(System.in);
        System.out.print("Bir taban degeri giriniz:");
        int taban_deger = taban.nextInt();
        Scanner us = new Scanner(System.in);
        System.out.print("Bir us degeri giriniz:");
        int us_deger = us.nextInt();
        for(int i = taban_deger;sayac <= us_deger; i*=taban_deger){
            sayac += 1;
            temp = i;
        }
        System.out.print("Girdiginiz degerlerin us alinmis hali: " + temp +"\n");
    }
    
}
