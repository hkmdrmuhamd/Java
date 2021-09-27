package diziden_eleman_silme;

import java.util.Scanner;

public class Diziden_Eleman_Silme {

    public static void main(String[] args) {
        Dizi diz = new Dizi();
        Scanner scan = new Scanner(System.in);
        diz.Ekleme();
        diz.showInfos();
        System.out.print("Diziden silmek istediginiz elemani giriniz(0-10 arasi):");
        int silme = scan.nextInt();
        diz.Silme(silme);
        diz.showInfos();
        diz.guncelleme();
        diz.showInfos();
    }

}
