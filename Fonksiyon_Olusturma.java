/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonksiyon_olusturma;

import java.util.Scanner;

/**
 *
 * @author muhammed
 */
public class Fonksiyon_Olusturma {

    public static void alan_hesaplama(int kenar){
        int alan;
        alan = kenar * 2;
        System.out.println("Karenin alani:" + alan);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Karenin bir kenari kaç cm:");
        int kenar = scan.nextInt();
        
        alan_hesaplama(kenar);
    }
    }
    

