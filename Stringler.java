/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringler;

/**
 *
 * @author muhammed
 */
public class Stringler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "benim adim muhammed";
        s = s.toUpperCase();
        System.out.println("buyuk harfe cevirme: "+ s);
        
//Şimdiki kısımda stirng içindeki ilk boşluk karakterini arayacağız
        int ilkBosluk = s.indexOf(" ");
        System.out.println("ılk Bosluk: " + ilkBosluk);

//Bu kısımda da stringin başından ilk boşluğa kadar olan kısımı ekrana bastıracağız
        System.out.println("Ilk kelime: " + s.substring(0, ilkBosluk));
        
    }
    
}
