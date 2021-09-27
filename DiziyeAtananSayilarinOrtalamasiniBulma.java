
package diziyeatanansayilarinortalamasinibulma;

import java.util.Scanner;

public class DiziyeAtananSayilarinOrtalamasiniBulma {
    
    public static double ortalama(int[] arr){
        double toplama = 0.0;
        double ortalama = 0.0;
        
        for(int i = 0; i< arr.length;i++){
            toplama += arr[i];
        }
        ortalama = toplama / arr.length;
        return ortalama;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        System.out.print("Kac boyutlu bir dizi olusturmak istiyorsunuz:");
        int boyut = scan.nextInt();
        int arr[] = new int[boyut];
        
        for (int i = 0;i < arr.length;i++){
            System.out.print("Dizinin "+(i+1)+". elemanini giriniz:");
            arr[i] = scan.nextInt();
        }
        
        System.out.println("Girdiginiz sayilarin ortalamasi: " + ortalama(arr));
    }
    
}
