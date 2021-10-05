package random;

import java.util.Random;

public class AdamAsmaca {

    public static void main(String[] args) {
        Random r = new Random();
        int random = r.nextInt(5);
        Sehir_secme sehir = new Sehir_secme();
        Adam_olusturma adam = new Adam_olusturma();
        sehir.Random_Sehir(random);
    }
}
