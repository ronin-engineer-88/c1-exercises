package _06_Big_O_Sorting;

import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Số lượng đũa phép Tí tìm được: ");
        int n = scanner.nextInt();
        int[] wands = new int[n];
        int[] boxes = new int[n];

        System.out.println("Nhập độ dài đũa phép: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Đũa phép " + (i + 1) + ": ");
            wands[i] = scanner.nextInt();
        }
        insertionSort(wands);

        System.out.println("Nhập độ dài các hộp: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Hộp " + (i + 1) + ": ");
            boxes[i] = scanner.nextInt();
        }
        insertionSort(boxes);

        for (int i = 0; i < n; i++) {
            if (wands[i] > boxes[i]) {}
        }

        if(isPortable(wands, boxes))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static boolean isPortable(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) return false;
        }
        return true;
    }

}
