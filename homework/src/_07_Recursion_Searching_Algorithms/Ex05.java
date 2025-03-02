package _07_Recursion_Searching_Algorithms;

public class Ex05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printTriangle(arr);
    }

    public static void printTriangle(int[] arr) {
        printArray(arr);

        if (arr.length == 1) return;

        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i] + arr[i + 1];
        }

        printTriangle(newArr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    /* Cách làm:
        - Xây dựng hàm đệ quy `printTriangle(int[] arr)` để tạo ra tam giác số từ dãy ban đầu.
        - Hàm `printTriangle(arr)` hoạt động như sau:
            1. Gọi `printArray(arr)` để in dãy hiện tại.
            2. Nếu mảng chỉ còn 1 phần tử, dừng đệ quy.
            3. Tạo mảng `newArr` có kích thước nhỏ hơn 1 đơn vị.
            4. Duyệt mảng `arr`, tính tổng hai phần tử liên tiếp để tạo `newArr`.
            5. Gọi đệ quy `printTriangle(newArr)` để tiếp tục quá trình.
        - Hàm `printArray(int[] arr)` để in mảng dưới dạng `[a, b, c, ...]`.
        - Trong `main()`, khởi tạo mảng `{1, 2, 3, 4, 5}` và gọi `printTriangle(arr)`.
    */

}
