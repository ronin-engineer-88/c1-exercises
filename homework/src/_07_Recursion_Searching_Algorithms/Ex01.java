package _07_Recursion_Searching_Algorithms;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng: ");
        int n = scanner.nextInt();

        while (n < 2) {
            System.out.println("Mảng phải có ít nhất hai phần tử, vui lòng nhập lại!");
            System.out.print("Nhập vào độ dài mảng: ");
            n = scanner.nextInt();
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int[] result = findMin(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + result[0]);
        System.out.println("Phần tử nhỏ thứ hai trong mảng là: " + result[1]);
    }

    public static int[] findMin(int[] arr) {
        int min = arr[0];
        int min2 = arr[1];

        if(min > min2) {
            min = arr[1];
            min2 = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                min2 = min;
                min = arr[i];
            } else if (arr[i] > min && arr[i] < min2)
                min2 = arr[i];
        }

        return new int[]{min, min2};
    }

     /* Cách làm:
        - Nhập vào số lượng phần tử của mảng, đảm bảo mảng có ít nhất 2 phần tử.
        - Nhập giá trị cho từng phần tử trong mảng.
        - Khởi tạo hai biến min và min2 để lưu giá trị nhỏ nhất và nhỏ thứ hai.
        - Đảm bảo rằng min luôn nhỏ hơn min2 sau khi khởi tạo.
        - Duyệt qua mảng từ phần tử thứ 3 trở đi:
            + Nếu phần tử hiện tại nhỏ hơn min, cập nhật min2 = min rồi gán min = phần tử đó.
            + Nếu phần tử hiện tại lớn hơn min nhưng nhỏ hơn min2, cập nhật min2.
        - Trả về mảng chứa hai số min và min2.
        - In kết quả ra màn hình.
      */


}
