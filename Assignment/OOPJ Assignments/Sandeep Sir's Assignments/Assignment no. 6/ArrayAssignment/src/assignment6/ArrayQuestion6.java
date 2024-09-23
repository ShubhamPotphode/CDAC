package assignment6;

public class ArrayQuestion6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int N = 5; 

        int sumOfN = N * (N + 1) / 2;
        int sumOfArray = 0;

        for (int num : arr) {
            sumOfArray += num;
        }

        int missingNumber = sumOfN - sumOfArray;
        System.out.println("Missing number: " + missingNumber);
    }
}
