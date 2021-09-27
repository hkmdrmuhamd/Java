/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopgiris_ve_classlar;

/**
 *
 * @author muhammed
 */
public class OOPgiris_ve_Classlar {

    
    public static void main(String[] args) {
        Araba araba1 = new Araba(); // obje olusturma yontemi
        
        // Olusturduğumuz objenin özelliklerini belirliyoruz.
        araba1.renk = "Beyaz";   
        araba1.model = "Fiat Fiorino";
        araba1.motor_hacmi = 1.3;
        araba1.kapilar = 4;
        
        System.out.println("Arabanin rengi: " + araba1.renk);
        System.out.println("Arabanin modeli: " + araba1.model);
        System.out.println("Arabanin motor hacmi: " + araba1.motor_hacmi);
        System.out.println("Arabanin kapi sayisi: " + araba1.kapilar);
        
    }
    
}
