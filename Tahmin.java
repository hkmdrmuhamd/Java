package random;

import java.util.Scanner;

public class Tahmin {

    public void tahmin_yapma(String sehir) {
        Adam_olusturma adam = new Adam_olusturma();//Konu icerisindeki projelerde gerekli class bulunmaktadir
        int temp2 = 0;
        String arr[] = new String[sehir.length()];

        for (int i = 0; i < sehir.length(); i++) {
            arr[i] = sehir.substring(i, (i + 1));
        }
        
        for (int k = 0; true; k++) {
            int temp = 0;
            Scanner scan = new Scanner(System.in);
            System.out.print("Bir harf giriniz:");
            String tahmin = scan.nextLine();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(tahmin)) {
                    System.out.println("Girilen harf sehir isminde bulunmakta.");
                    break;
                }
                else{
                    temp += 1;
                }
            }
            if (temp == arr.length){
                temp2 += 1;
            }
            if(temp2 == 7){
                break;
            }
            adam.adam_asma(temp2);
        }
    }
}
