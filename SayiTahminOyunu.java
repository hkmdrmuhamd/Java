
package sayitahminoyunu;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int number = rnd.nextInt(100);
        int counter = 0;
        
        while(true){
            while(counter != 1){
                System.out.print("Pls do enter ur forecast:");
                break;
            }
            int forecast = scan.nextInt();
            if (forecast < number){  
                System.out.print("Pls do enter higher number:");
                counter = 1;
        }
            else if(forecast > number){
                System.out.print("Pls do enter smaller number:");
                counter = 1;
            }
            else{
                System.out.println("Congratulations it's right forecast");
                break;
            }
        }
    }
    
}
