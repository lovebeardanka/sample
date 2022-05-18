import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{99, 0, 1, 5, 7, 6, 3, 8, 9, 4, 12, 57, 34, 4, 56};

        for (int i : arr) {
            System.out.println(i);
        }

        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }


        System.out.println("~gg");
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
