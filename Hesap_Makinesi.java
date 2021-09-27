
package hesap_makinesi;

import java.util.Scanner;

public class Hesap_Makinesi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Islemler islem = new Islemler();
        int sayac = 0;

        while (sayac != 1){
            System.out.println("----------MENU----------");
            System.out.println("[1] - Toplama");
            System.out.println("[2] - Cikarma");
            System.out.println("[3] - Carpma");
            System.out.println("[4] - Bolme");
            System.out.println("[5] - Cikis");
            System.out.println("------------------------");
            System.out.print("Lutfen menuden yapmak istediginiz islemi seciniz:");
            int sayi = scan.nextInt();
            
            switch(sayi){
                case 1 -> {
                    int kontrol = 1;
                    System.out.print("Ilk sayi:");
                    int ilk_sayi = scan.nextInt();
                    System.out.print("Ikinci sayi:");
                    int ikinci_sayi = scan.nextInt();
                    islem.Islem(ilk_sayi,ikinci_sayi,kontrol);
                    islem.showIslem();
                    break;
                }
                case 2 -> {
                    int kontrol = 2;
                    System.out.print("Ilk sayi:");
                    int ilk_sayi = scan.nextInt();
                    System.out.print("Ikinci sayi:");
                    int ikinci_sayi = scan.nextInt();
                    islem.Islem(ilk_sayi,ikinci_sayi,kontrol);
                    islem.showIslem();
                    break;
                }
                case 3 -> {
                    int kontrol = 3;
                    System.out.print("Ilk sayi:");
                    int ilk_sayi = scan.nextInt();
                    System.out.print("Ikinci sayi:");
                    int ikinci_sayi = scan.nextInt();
                    islem.Islem(ilk_sayi,ikinci_sayi,kontrol);
                    islem.showIslem();
                    break;
                }
                case 4 -> {
                    int kontrol = 4;
                    System.out.print("Ilk sayi:");
                    double ilk_sayi = scan.nextDouble();
                    System.out.print("Ikinci sayi:");
                    double ikinci_sayi = scan.nextDouble();
                    islem.bolme(ilk_sayi,ikinci_sayi,kontrol);
                    islem.showIslem();
                    break;
                }
                case 5 -> {
                    sayac = 1;
                    break;
                }
                default -> {
                    System.out.println("Lutfen menudeki sayilardan birini giriniz!!");
                }
            }
        }
        
    }
    
}
