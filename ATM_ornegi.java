/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm_ornegi;

import java.util.Scanner;

/**
 *
 * @author muhammed
 */
public class ATM_ornegi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kullaniciAdi = "Muhammed";
        int sifre = 1234;
        int sayac = 0;
        int sayac1 = 0;
        int sayac2 = 0;
        
        while (sayac != 1){
            System.out.print("Lutfen kullanici adinizi giriniz:");
            String kAd = scan.nextLine();
            if (!(kullaniciAdi.equals(kAd))){
                System.out.println("Hatali kullanici adi tekrar deneyiniz.");
        }
            
            else{
                sayac = 1;
                while (sayac1 != 1){
            System.out.print("Lutfen sifrenizi giriniz:");
            int Sifre = scan.nextInt();
            if (sifre != Sifre){
                System.out.println("Hatali sifre tekrar deneyiniz.");
        }
            else{
                sayac1 = 1;
                System.out.println("\n----------SISTEME GİRİS BASARILI----------\n");
                System.out.print("Lutfen para miktarinizi giriniz:");
                int para = scan.nextInt();

                int bakiye = 0;
                System.out.println("\n----------MENU----------");
                System.out.println("[1] - Para Yatirma");
                System.out.println("[2] - Para Cekme");
                System.out.println("[3] - Bakiye Sorgulama");
                System.out.println("[4] - Cikis");
                System.out.println("------------------------\n");
                while (sayac2 != 1){
                    System.out.print("Yapmak istediginiz islemi seciniz:");
                    int islem = scan.nextInt();
            
                    switch(islem){
                        case 1 -> {
                            System.out.print("Ekleyeceginiz Para Miktari:");
                            int eklenen = scan.nextInt();
                            bakiye = para + eklenen;
                }
                
                        case 2 -> {
                            System.out.print("Cekeceginiz Para Miktari:");
                            int cekilen = scan.nextInt();
                            if (bakiye < cekilen){
                                System.out.println("Bakiye yetersiz!!");
                    }
                            else{
                                bakiye -= cekilen;
                            }
                }
                
                        case 3 -> System.out.println("Kullanilabilir bakiyeniz:" + bakiye);
                
                        case 4 -> sayac2 = 1;
                    
                        default -> System.out.println("Lutfen menude belirtilen sayilardan birini giriniz!!");
            }
        }
            }
        }
            }
        }
    }
    


}
