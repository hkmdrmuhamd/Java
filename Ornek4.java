/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek4;

import java.util.Scanner;

/**
 *
 * @author muhammed
 */
public class Ornek4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kontrol = 1;
        int kalan,sayi1,basamak1,kalan1,sayi2,basamak2;
        while(kontrol != 0){
        Scanner deger = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = deger.nextInt();
        if(sayi < 100){
            System.out.print("Lutfen 3 basamakli bir sayi giriniz!\n");
        }
        else if(sayi > 999){
            System.out.print("Lutfen 3 basamakli bir sayi giriniz!\n");
        }
        else if(sayi>=100 && sayi<=999){
            kalan = sayi % 100;
            sayi1 = sayi - kalan;
            basamak1 = sayi1/100;
            kalan1 = kalan % 10;
            sayi2 = kalan - kalan1;
            basamak2 = sayi2 / 10;
            System.out.print("Sayinin ters cevrilmis hali: "+kalan1+basamak2+basamak1+"\n");
            System.out.print("Sayinin basamaklari toplami: "+(kalan1+basamak2+basamak1)+"\n");
            break;
        }
    }
    }
    
}
