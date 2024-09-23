package assignment6;

import java.util.Arrays;

public class ArrayQuestion4 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 5, 4, 7};
        Arrays.sort(arr);
        
        int[] uniqueArr = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueArr[index++] = arr[i];
            }
        }
        uniqueArr[index++] = arr[arr.length - 1];

        System.out.println("Array without duplicates:");
        for (int i = 0; i < index; i++) {
            System.out.println(uniqueArr[i]);
        }
    }
}
