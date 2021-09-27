
package consturactorlar.yapci_metodlar;


public class Car {
    private String color;
    private String model;
    private double engine;
    private int doors;
    
    public Car(String color,String model,double engine,int doors){
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.doors = doors;
    }
    public Car(){
        /*this.color = "Bilgi Yok";
        this.model = "Bilgi yok";
        this.engine = 0;
        this.doors = 0;*/
        this("Bilgi Yok","Bilgi Yok",0,0);
    }
    public Car(String color,String model){
        this.color = color;
        this.model = model;
        
    }
    public void showInfos(){
        System.out.println("Arabanin rengi: "+ this.color);
        System.out.println("Arabanin modeli: "+ this.model);
        System.out.println("Arabanin motor hacmi: "+ this.engine);
        System.out.println("Arabanin kapi sayisi: "+ this.doors);
        System.out.print("\n");
    }
}
