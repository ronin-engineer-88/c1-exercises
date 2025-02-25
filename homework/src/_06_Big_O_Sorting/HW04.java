package _06_Big_O_Sorting;

public class HW04 {
    public static void main(String[] args) {
        int[] arr = {8, 4, 5, 2, 10};
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
        int sumSmall = 0, sumLarge = 0;
        for (int i = 0; i < k; i++) sumSmall += arr[i];
        for (int i = k; i < arr.length; i++) sumLarge += arr[i];

        return sumLarge - sumSmall;
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
2. Tách mảng con nhỏ nhất (K phần tử đầu tiên) và mảng con lớn nhất (N-K phần tử cuối cùng).
3. Tính hiệu giữa tổng hai mảng con.
*/
