/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek2;

/**
 *
 * @author muhammed
 */
public class Ornek2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*for (int i = 0; i <= 100;i++){
            if ((i % 3) == 0 && (i % 7) == 0 && i != 0){
                System.out.println(i);
            }
        }*/
        for (int i = 2;i<=100;i*=2){
            System.out.println(i);
        }
    }
    
}
