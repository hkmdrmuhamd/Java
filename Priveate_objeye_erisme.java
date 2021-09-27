/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priveate_objeye_erisme;


public class Priveate_objeye_erisme {
    
    public static void main(String[] args) {
        
        Car car1 = new Car(); //renk belirlemek icin obje olusturduk
        
        car1.setColor("Beyaz"); 
        System.out.println("Arabanin rengi= "+car1.getColor());
    }
    
}
