package _06_Big_O_Sorting;

public class HW04 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 2, 10};
        //int[] arr = {10, 20, 30, 40, 50};
        int k = 2;
        bubbleSort(arr);
        System.out.println(maxDifference(arr, k));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int maxDifference(int[] arr, int k) {
        int sumTotal = 0;
        for (int num : arr) {
            sumTotal += num; // 1: Tính tổng toàn bộ mảng
        }

        // Bước 2: Tính tổng nhóm nhỏ theo 2 cách
        int sumSmall1 = 0; // Lấy K phần tử đầu làm nhóm nhỏ
        for (int i = 0; i < k; i++) {
            sumSmall1 += arr[i];
        }
        int diff1 = (sumTotal - sumSmall1) - sumSmall1;

        int sumSmall2 = 0; // Lấy K phần tử cuối làm nhóm nhỏ
        for (int i = arr.length - k; i < arr.length; i++) {
            sumSmall2 += arr[i];
        }
        int diff2 = sumSmall2 - (sumTotal - sumSmall2);

        return Math.max(diff1, diff2); // return hiệu lớn nhất
    }
}

/*
    Cho mảng A[] gồm N số nguyên không âm và số K. Nhiệm vụ của bạn là hãy chia mảng A[]
        thành hai mảng con có kích cỡ K và N-K sao cho hiệu giữa tổng hai mảng con là lớn nhất.
        Ví dụ với mảng A[] = {8, 4, 5, 2, 10}, K=2 ta có kết quả là 17 vì mảng A[] được chia thành
        hai mảng {4, 2} và { 8, 5,10} có hiệu của hai mảng con là 23 - 6 = 17 là lớn nhất.
 */

/*
1. Sắp xếp mảng tăng dần.
2. Tính tổng toàn bộ mảng để dễ tính toán nhóm còn lại.
3. Tính tổng của 2 cách chia nhóm nhỏ:
      - sumSmall1: Lấy K phần tử đầu tiên làm nhóm nhỏ.
      - sumSmall2: Lấy K phần tử cuối cùng làm nhóm nhỏ.
4. So sánh 2 kết quả và chọn giá trị lớn nhất.
*/
