
package hesap_makinesi;

public class Islemler {
    
    private int toplama;
    private int cikarma;
    private int carpma;
    private double bolme;
    private int kontrol;
    
    public void Islem(int ilk_sayi, int ikinci_sayi, int kontrol){
        this.kontrol = kontrol;
        this.toplama = ilk_sayi + ikinci_sayi;
        this.cikarma = ilk_sayi - ikinci_sayi;
        this.carpma = ilk_sayi * ikinci_sayi;
    }

    public void bolme(double ilk_sayi,double ikinci_sayi,int kontrol){
        this.kontrol = kontrol;
        this.bolme = (double)ilk_sayi / (double)ikinci_sayi;
    }
    
    public void showIslem(){
        switch (this.kontrol) {
            case 1:
                System.out.println("Sonuc:" + this.toplama);
                break;
            case 2:
                System.out.println("Sonuc:" + this.cikarma);
                break;
            case 3:
                System.out.println("Sonuc:" + this.carpma);
                break;
            case 4:
                System.out.println("Sonuc:" + this.bolme);
                break;
        }

    }
}
