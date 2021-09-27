
package girilen_metnin_uzunlugu;


public class Uzunluk {
    private int uzunluk;

    public Uzunluk(String kelime) {
        int sayac = 0;
        String arr[] = new String[kelime.length()];
        for (int i = 0;i<kelime.length();i++){
            String harf = kelime.substring(i,(i+1));
            arr[i] = harf;
        }
        for (int i = 0;i<kelime.length();i++){
            if (arr[i].equals(" ")){
                sayac += 1;
            }
        }
        int kelime_uzunlugu = kelime.length() - sayac;
        this.uzunluk = kelime_uzunlugu;
    }
    public void show(){
        System.out.println("Girilen kelimenin uzunlugu:"+this.uzunluk);
    }

    
}
