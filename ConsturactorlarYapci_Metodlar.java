
package consturactorlar.yapci_metodlar;

public class ConsturactorlarYapci_Metodlar {

    public static void main(String[] args) {
        Car car1 = new Car("Beyaz","Fiat Fiorino",1.3,4);  
        Car car2 = new Car();                   //overloading ile bir consturactor'ı birden fazla kez kullanabiliriz
        Car car3 = new Car("Siyah","Audi A5"); //overloading ile bir consturactor'ı birden fazla kez kullanabiliriz
        
        car1.showInfos();
        car2.showInfos();
        car3.showInfos();
    }
}
