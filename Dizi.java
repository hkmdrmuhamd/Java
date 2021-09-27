
package hafta1_soru1;

import java.util.Arrays;

public class Dizi {
    int arr1[] = new int[100];
    int arr2[] = new int[100];
    int arr3[] = new int[100];
    String temp = "";
    int tempSayi = 0;
    int toplam = 0;
    int kalan = 0;
    int elde = 0;
    
    public void yerlestirme(String sayi1,String sayi2){
        
        for(int i = 0; i<sayi1.length();i++){
            temp = sayi1.substring(i,i+1);
            tempSayi = Integer.valueOf(temp);
            arr1[i] += tempSayi;
        }

        for(int i = 0; i<sayi2.length();i++){
            temp = sayi2.substring(i,i+1);
            tempSayi = Integer.valueOf(temp);
            arr2[i] += tempSayi;
        }
    }

    public void toplama(){
        for (int i = 99;i >= 0;i--){
            toplam = arr1[i] + arr2[i] + elde;
            elde = 0;
            if (toplam >= 10){
                kalan = toplam - 10;
                if (i == 0){
                    arr3[i] = toplam;
                }
                else{
                    arr3[i] = kalan;
                    elde += 1;
                }
            }
            else{
                arr3[i] = toplam;
            }
        }
    }
    public void showInfos(){
        System.out.println("Dizi 1:         "+Arrays.toString(arr1));
        System.out.println("Dizi 2:         "+Arrays.toString(arr2));
        System.out.println("Dizi 1 + Dizi 2:"+Arrays.toString(arr3));
    }
}
