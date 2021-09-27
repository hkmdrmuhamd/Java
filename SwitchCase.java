/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch.pkgcase;

import java.util.Scanner;

/**
 *
 * @author muhammed
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 3'e kadar bir rakam giriniz:");
        int sayi = scan.nextInt();
        switch(sayi){
            case 0 ->{
                System.out.println("Sifir");
                break;
            }
            case 1 ->{
                System.out.println("Bir");
                break;
            }
            case 2 ->{
                System.out.println("Iki");
                break;
            }
                
            default ->{
                System.out.println("Lutfen 3'e kadar bir rakam giriniz!!");
            }
                
                
        }
        
    }
    
}
