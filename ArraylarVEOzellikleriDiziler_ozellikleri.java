
package arraylarveozellikleri.diziler_ozellikleri;

import java.util.Scanner;

public class ArraylarVEOzellikleriDiziler_ozellikleri {

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] arr2 = new int[5];
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0;i<arr.length;i++){
            System.out.println("arr'nin "+i+". indisi: "+arr[i]);
        }
        System.out.print("\n");
        
        for(int i = 0;i<arr2.length;i++){
            System.out.print("arr2'nin "+i+". indisini giriniz:");
            arr2[i] = scan.nextInt();
        }
        System.out.println("\n");
        
        for(int i = 0;i<arr2.length;i++){
            System.out.println("arr2'nin "+i+". indisi: "+arr2[i]);
        }
    }
}
