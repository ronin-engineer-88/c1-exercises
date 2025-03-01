package _06_Big_O_Sorting;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Nhập phần tử thứ " + (i + 1) + " (0-20): ");
                int value = scanner.nextInt();
                if (value >= 0 && value <= 20) {
                    array[i] = value;
                    break;
                } else {
                    System.out.println("Giá trị không hợp lệ! Vui lòng nhập lại.");
                }
            }
        }

        sortByMostFrequency(array);
        System.out.print("Mảng sắp xếp theo tần suất xuất hiện: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sortByMostFrequency(int[] arr) {
        int[] freq = new int[21];
        int[] firstIndex = new int[21];
        for (int i = 0; i < 21; i++) {
            firstIndex[i] = -1;
        }

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
            if (firstIndex[arr[i]] == -1) {
                firstIndex[arr[i]] = i;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && (freq[arr[j]] < freq[key] ||
                    (freq[arr[j]] == freq[key] && firstIndex[arr[j]] > firstIndex[key]))) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    /*
        Cách giải bài toán:
        - Nhập vào số lượng phần tử và các giá trị trong mảng, kiểm tra hợp lệ (0-20).
        - Tạo mảng tần suất `freq` để đếm số lần xuất hiện của từng phần tử.
        - Tạo mảng `firstIndex` để lưu vị trí xuất hiện đầu tiên của mỗi số.
        - Duyệt mảng ban đầu, cập nhật `freq` và `firstIndex`.
        - Sử dụng thuật toán sắp xếp chèn (Insertion Sort) để sắp xếp mảng:
            + Ưu tiên số có tần suất cao hơn.
            + Nếu tần suất bằng nhau, số nào xuất hiện trước sẽ được ưu tiên.
        - In ra mảng đã sắp xếp theo yêu cầu.
    */
}
