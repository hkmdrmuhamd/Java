/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ic_ice_fonksiyonlar;

/**
 *
 * @author muhammed
 */
public class Ic_ice_fonksiyonlar {

    public static int ikiiletoplama(int a){
        return a + 2;
    }
    public static int ucilecarpma(int a){
        return a * 3;
    }
    public static int dortcikartma(int a){
        return a - 4;
    }
    public static void main(String[] args) {
        System.out.println("Sonuc = " + ikiiletoplama(ucilecarpma(dortcikartma(10))));
    }
    
}
