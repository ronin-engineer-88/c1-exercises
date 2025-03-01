package _06_Big_O_Sorting;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + " (1-100): ");
                int value = scanner.nextInt();
                if (value > 0 && value < 100) {
                    array[i] = value;
                    break;
                } else {
                    System.out.println("Giá trị không hợp lệ! Vui lòng nhập lại.");
                }
            }
        }

        System.out.println(findNumberElementMissing(array));
    }

    public static int findNumberElementMissing(int[] arr) {
        selectionSort(arr);

        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if(diff == 1 || diff == 0)
                continue;
            else
                count += diff - 1;
        }

        return count;
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

//    public static int findNumberElementMissing(int[] arr) {
//        int min = arr[0], max = arr[0];
//
//        // Tìm min và max trong mảng
//        for (int num : arr) {
//            if (num < min) min = num;
//            if (num > max) max = num;
//        }
//
//        // Công thức tính số phần tử còn thiếu
//        return (max - min + 1) - arr.length;
//    }

}
