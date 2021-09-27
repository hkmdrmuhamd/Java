/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metod.overloading;

/**
 *
 * @author muhammed
 */
public class MetodOverloading {

    public static void skorHesapla(String isim,int skor) {
        System.out.println(isim + " isimli oyuncunun puani: " + skor);
    }
    public static void skorHesapla(int skor) { //overloading olmamasi icin tek parametreli skor hesaplama fonksiyonu
        System.out.println("Isimsiz oyuncunun puani: " + skor);
    }
    public static void main(String[] args) {
        skorHesapla("Muhammed",2000);
        skorHesapla(5000); //tek parametre gönderdim
    }
    
}
