package random;

public class Sehir_secme {

    public void Random_Sehir(int deger) {
        String sehir = "";
        Tahmin girdi = new Tahmin();
        switch (deger) {
            case 0 -> {
                sehir = "malatya";
                break;
            }
            case 1 -> {
                sehir = "izmir";
                break;
            }
            case 2 -> {
                sehir = "ankara";
                break;
            }
            case 3 -> {
                sehir = "mardin";
                break;
            }
            case 4 -> {
                sehir = "konya";
                break;
            }
        }
        System.out.println(sehir);
        girdi.tahmin_yapma(sehir);//Konu icerisindeki projelerde gerekli class bulunmaktadir
    }
}
