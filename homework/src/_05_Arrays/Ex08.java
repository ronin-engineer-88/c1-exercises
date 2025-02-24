package _05_Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        File inputFile = new File("src/_05_Arrays/data/inputB8.txt");

        int[] numbers = new int[1000]; // Khởi tạo mảng để lưu các số từ file, giả định kích thước ban đầu là 1000
        int[] count = {0}; // Dùng mảng để truyền tham chiếu

        // Đọc số từ file và lưu vào mảng numbers
        numbers = readNumbersFromFile(inputFile, numbers, count);

        // Mảng lưu các số duy nhất có chữ số nguyên tố
        int[] uniqueNumbers = new int[count[0]];
        int[] occurrences = new int[count[0]];
        int uniqueCount = 0; // Biến đếm số lượng phần tử duy nhất

        // Duyệt qua từng số đã đọc từ file
        for (int i = 0; i < count[0]; i++) {
            if (containsOnlyPrimeDigits(numbers[i])) {
                int index = findIndex(uniqueNumbers, uniqueCount, numbers[i]);
                if (index == -1) {
                    uniqueNumbers[uniqueCount] = numbers[i];
                    occurrences[uniqueCount] = 1;
                    uniqueCount++;
                } else {
                    occurrences[index]++;
                }
            }
        }

        // In kết quả
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueNumbers[i] + " " + occurrences[i]);
        }

    }

    public static int[] readNumbersFromFile(File inputFile, int[] numbers, int[] count) {
        try (Scanner scanner = new Scanner(inputFile)) {
            while (scanner.hasNext()) {
                if (count[0] == numbers.length) {
                    numbers = Arrays.copyOf(numbers, numbers.length * 2);
                }
                if (scanner.hasNextInt()) {
                    numbers[count[0]] = scanner.nextInt();
                    count[0]++;
                } else {
                    scanner.next();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file: " + inputFile.getAbsolutePath());
        }
        return numbers;
    }

    public static boolean containsOnlyPrimeDigits(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 2 && digit != 3 && digit != 5 && digit != 7) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static int findIndex(int[] arr, int length, int value) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /*
        Cách giải bải tập:

        1. Đọc tất cả các số nguyên từ file vào mảng `numbers`.
        - Dùng `Scanner` để đọc file.
        - Chỉ lưu các số nguyên vào mảng.
        - Nếu mảng đầy, mở rộng kích thước để tránh lỗi tràn mảng.
        - Đếm số phần tử đã đọc và lưu vào biến `count[0]`.

        2. Duyệt qua danh sách các số đã đọc để tìm những số chỉ chứa các chữ số nguyên tố (2, 3, 5, 7).
        - Dùng hàm `containsOnlyPrimeDigits(int num)` để kiểm tra từng số.

        3. Nếu một số thỏa mãn điều kiện trên, kiểm tra xem nó đã xuất hiện trong danh sách các số duy nhất hay chưa.
        - Dùng hàm `findIndex(int[] arr, int length, int value)` để tìm vị trí của số trong danh sách.
        - Nếu số đó chưa có trong danh sách, thêm vào `uniqueNumbers[]` và đặt số lần xuất hiện `occurrences[] = 1`.
        - Nếu số đó đã có trong danh sách, tăng số lần xuất hiện lên.

        4. In kết quả ra màn hình: danh sách các số chỉ có chữ số nguyên tố cùng số lần xuất hiện của chúng.

    */



}
