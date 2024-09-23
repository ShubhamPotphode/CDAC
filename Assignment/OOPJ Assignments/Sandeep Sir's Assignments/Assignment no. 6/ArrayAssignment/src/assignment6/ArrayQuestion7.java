package assignment6;

import java.util.Scanner;

class ArrayClass {
    private int[] arr;

    public ArrayClass() {
        arr = new int[5];
    }

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public void printRecord() {
        System.out.println("Array values:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
}

public class ArrayQuestion7 {
    public static void main(String[] args) {
        ArrayClass arrayClass = new ArrayClass();
        arrayClass.acceptRecord();
        arrayClass.printRecord();
    }
}

