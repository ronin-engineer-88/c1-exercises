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

    /* Cách làm:
        - Chương trình kiểm tra xem tất cả đũa phép có thể bỏ vào hộp tương ứng hay không.
        - Bước 1: Nhập số lượng đũa phép từ người dùng (`n`).
        - Bước 2: Nhập danh sách độ dài của `n` đũa phép vào mảng `wands`.
        - Bước 3: Sắp xếp mảng `wands` theo thứ tự tăng dần bằng thuật toán `insertionSort`.
        - Bước 4: Nhập danh sách độ dài của `n` hộp vào mảng `boxes`.
        - Bước 5: Sắp xếp mảng `boxes` theo thứ tự tăng dần bằng thuật toán `insertionSort`.
        - Bước 6: Kiểm tra từng cặp phần tử trong `wands` và `boxes`:
        - Nếu một cây đũa nào đó dài hơn hộp tương ứng, việc xếp đũa vào hộp thất bại.
        - Nếu tất cả các cây đũa đều nhỏ hơn hoặc bằng hộp tương ứng, việc xếp thành công.
        - Bước 7: Hàm `isPortable(int[] arr1, int[] arr2)` kiểm tra điều kiện trên:
            + Nếu có phần tử `arr1[i] > arr2[i]`, trả về `false`.
            + Nếu tất cả phần tử thỏa mãn điều kiện, trả về `true`.
        - Bước 8: Dựa vào kết quả của `isPortable`, in ra "YES" (nếu có thể xếp tất cả đũa vào hộp) hoặc "NO" (nếu không thể).
    */


}
