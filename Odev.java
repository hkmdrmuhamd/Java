package odev2;

import java.util.Arrays;

public class Odev {

    public void Bubble_sort(int arr[]) {
        int tutucu = 0;
        Odev odev = new Odev();
        System.out.println("Dizi:" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[4];
            for (int j = 4; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    tutucu = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tutucu;
                }
            }
        }
        System.out.println("Dizinin sag kisminin siralamasi:" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[4];
            for (int j = 4; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tutucu = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tutucu;
                }
            }
        }
        System.out.println("Dizinin sol kisminin siralamasi: "+Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j] > arr[j + 1]) {
                    tutucu = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tutucu;
                }
            }
        }
        System.out.println("Dizinin siralanmis hali:" + Arrays.toString(arr));
    }
}
