package assignment6;

import java.util.Scanner;

class ArrayClassWithGetterSetter {
    private int[] arr;

    public ArrayClassWithGetterSetter() {
        arr = new int[5];
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
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

public class ArrayQuestion8 {
    public static void main(String[] args) {
        ArrayClassWithGetterSetter arrayClass = new ArrayClassWithGetterSetter();
        arrayClass.acceptRecord();
        arrayClass.printRecord();
    }
}
