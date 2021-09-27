/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation_onemi.kapsulleme_onemi;




public class Encapsulation_OnemiKapsulleme_Onemi {

   
    public static void main(String[] args) {
        Car car1 = new Car();
        
        
        car1.setColor("Beyaz");
        car1.setModel("Fiat Fiorino");
        car1.setDoor(3);
        car1.setMotor(1.3);
        
        System.out.println("Arabanin rengi: "+car1.getColor());
        System.out.println("Arabanin modeli: "+car1.getModel());
        System.out.println("Arabanin kapi sayisi: "+car1.getDoor());
        System.out.println("Arabanin motor hacmi: "+car1.getMotor());
        
    }
    
}
