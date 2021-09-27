         //               Bilgilendirme!!
        //Tas icin sistem tarafindan belirlenen rakam = 0
       //Kagit icin sistem tarafindan belirlenen rakam = 1
      //Makas icin sistem tarafindan belirlenen rakam = 2

package taskagitmakasoyunu;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakasOyunu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("-----Lutfen seciminizi yapiniz-----");
        while(true){
            System.out.print("Gamer1 icin 1\nGamer2 icin 2 rakamlarindan birini giriniz:");
            int oyuncu = scan.nextInt();
            if (oyuncu == 1 || oyuncu == 2){
                break;
            }
            else{
                System.out.println("Lutfen sistemde belirtilen rakamlardan birini giriniz!!");
            }
            }
        while(true){
            int gamer1 = rnd.nextInt(3);
            int gamer2 = rnd.nextInt(3);
            if (gamer1 == 0 && gamer2 == 0){
                System.out.println("Berabere -> gamer1:Tas gamer2:Tas");
            }
            else if (gamer1 == 0 && gamer2 == 1){
                System.out.println("Gamer 2 kazandi -> gamer1:Tas gamer2:Kagit");
                break;
            }
            else if (gamer1 == 0 && gamer2 == 2){
                System.out.println("Gamer 1 kazandi -> gamer1:Tas gamer2:Makas");
                break;
            }
            else if (gamer1 == 1 && gamer2 == 0){
                System.out.println("Gamer 1 kazandi -> gamer1:Kagit gamer2:Tas");
                break;
            }
            else if (gamer1 == 1 && gamer2 == 1){
                System.out.println("Berabere -> gamer1:Kagit gamer2:Kagit");
            }
            else if (gamer1 == 1 && gamer2 == 2){
                System.out.println("Gamer 2 kazandi -> gamer1:Kagit gamer2:Makas");
                break;
            }
            else if (gamer1 == 2 && gamer2 == 0){
                System.out.println("Gamer 2 kazandi -> gamer1:Makas gamer2:Tas");
                break;
            }
            else if (gamer1 == 2 && gamer2 == 1){
                System.out.println("Gamer 1 kazandi -> gamer1:Makas gamer2:Kagit");
                break;
            }
            else if (gamer1 == 2 && gamer2 == 2){
                System.out.println("Berabere -> gamer1:Makas gamer2:Makas");
            }
        }
      
    }
    
}
