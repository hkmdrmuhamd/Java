/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donguler;

/**
 *
 * @author muhammed
 */
public class Donguler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i<11;i++){   //Ekrana 10 kez mühendis muhammed yazısını basacak
            System.out.println(i + ":Muhendis Muhammed");
        }
        System.out.println("\n");
        
        int i = 1;
        while (i<11){
            System.out.println(i + ":Yazilim");
            i++;
        }
        
        i = 1;
        System.out.println("\n");
        do{   //Diğerlerinden farklı olaran ilk önce mesajı yazar daha sonra koşulu kontrol eder
            System.out.println(i + ":Java");
            i++;
        }while (i<11);
    }
    
}
