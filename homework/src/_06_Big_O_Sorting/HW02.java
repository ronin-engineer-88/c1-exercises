package _06_Big_O_Sorting;

public class HW02 {
    public static void main(String[] args) {
        int[] arr = {9, 7, 12, 8, 6, 5};
        bubbleSort(arr); // Sắp xếp mảng tăng dần
        rearrange(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi nếu A[j] > A[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void rearrange(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            if (left != right) System.out.print(arr[right--] + " ");
            System.out.print(arr[left++] + " ");
        }
    }
}

/*
    Cho mảng A[] gồm n số nguyên khác nhau. Hãy đưa ra các phần tử của mảng theo khuôn dạng lớn nhất, nhỏ nhất, lớn thứ hai, nhỏ thứ 2,…
    Ví dụ với A[] = {9, 7, 12, 8, 6, 5} ta đưa ra: 12, 5, 9, 6, 8, 7
*/

/*
Cách làm:
1. Sắp xếp mảng theo thứ tự tăng dần.
2. Sử dụng hai con trỏ:
    - Một con trỏ trỏ vào phần tử lớn nhất (cuối mảng).
    - Một con trỏ trỏ vào phần tử nhỏ nhất (đầu mảng).
3. Chọn lần lượt: Lớn nhất, nhỏ nhất, lớn thứ hai, nhỏ thứ hai,...
4. Lặp lại cho đến khi hết mảng.
*/
