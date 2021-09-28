//Dinamik bir veri tipidir olusturduktan sonra arrayin boyutunu degismemize olanak saglar.
package arraylistler;
import java.util.ArrayList;

public class Arraylistler {

    public static void main(String[] args) {
        ArrayList<String> dizi = new ArrayList<>(); //Olusturma sekli
        
        dizi.add("Muhammed"); //add metodu ile diziye ekleme yapabiliriz
        dizi.add("Hukumdar");
        dizi.add("Java");
        System.out.println("Elemanlar: "+dizi.get(0)+" "+dizi.get(1));//get metodu ile dizinin indexlerine erisebiliriz
        
        int uzunluk = dizi.size();//size metodu dizinin uzunlugunu verir
        System.out.println("Dizinin uzunlugu: "+uzunluk);
        
        dizi.remove("Java");//remove metodu ile dizinin icinden bir degeri silebiliriz
        for(int i = 0; i < dizi.size(); i++){
            System.out.println("Elemanlar: "+dizi.get(i));
        }
        
        System.out.println("Index No :"+dizi.indexOf("Hukumdar"));//indexOf metodu ile gonderdigimiz degerin index numarasina erisebliriz
    }
    
}
