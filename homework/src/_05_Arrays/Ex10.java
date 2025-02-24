package _05_Arrays;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng từ bàn phím
        System.out.print("Nhập số hàng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        inputArrayFromConsole(array, scanner);

        // Ghi mảng vào file
        writeArrayToFile(array, "src/_05_Arrays/data/outputB10.txt");

        // Đọc mảng từ file
        int[][] fileArray = readArrayFromFile("src/_05_Arrays/data/outputB10.txt");

        // Hiển thị mảng đã nhập từ bàn phím
        System.out.println("Mảng vừa nhập từ bàn phím:");
        displayArray(array);

        // Hiển thị mảng đã đọc từ file
        System.out.println("Mảng đọc từ file:");
        displayArray(fileArray);

        // Tính tổng
        System.out.println("Tổng các phần tử: " + sumArray(array));

        // Giá trị lớn nhất & nhỏ nhất
        System.out.println("Giá trị lớn nhất: " + findMax(array));
        System.out.println("Giá trị nhỏ nhất: " + findMin(array));

        // Vị trí phần tử lớn nhất & nhỏ nhất
        int[] maxPos = findMaxPosition(array);
        int[] minPos = findMinPosition(array);
        System.out.printf("Vị trí phần tử lớn nhất: [%d, %d]\n", maxPos[0], maxPos[1]);
        System.out.printf("Vị trí phần tử nhỏ nhất: [%d, %d]\n", minPos[0], minPos[1]);

        // Tìm vị trí phần tử đầu tiên & cuối cùng có giá trị bằng n
        System.out.println("Nhập số n cần tìm: ");
        int n = scanner.nextInt();
        int[] firstPos = findFirstOccurrence(array, n);
        int[] lastPos = findLastOccurrence(array, n);
        System.out.printf("Vị trí đầu tiên của %d: [%d, %d]\n", n, firstPos[0], firstPos[1]);
        System.out.printf("Vị trí cuối cùng của %d: [%d, %d]\n", n, lastPos[0], lastPos[1]);

        // Hoán đổi hai phần tử
        System.out.println("Nhập hai vị trí cần hoán đổi (row1 col1 row2 col2): ");
        int r1 = scanner.nextInt(), c1 = scanner.nextInt();
        int r2 = scanner.nextInt(), c2 = scanner.nextInt();
        swapElements(array, r1, c1, r2, c2);

        // Hiển thị mảng sau khi hoán đổi
        System.out.println("Mảng sau khi hoán đổi:");
        displayArray(array);
    }

    // 1.Nhập mảng từ bàn phím
    public static void inputArrayFromConsole(int[][] array, Scanner scanner) {
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    // 2.Ghi mảng vào file
    public static void writeArrayToFile(int[][] array, String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (int[] row : array) {
                for (int value : row) {
                    writer.print(value + " ");
                }
                writer.println();
            }
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    // 3.Đọc mảng từ file
    public static int[][] readArrayFromFile(String filePath) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filePath));

            // Đếm số dòng và số cột của mảng
            int rows = 0, cols = 0;
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().trim().split("\\s+");
                cols = line.length;
                rows++;
            }

            // Khởi tạo mảng có kích thước đúng
            int[][] array = new int[rows][cols];

            // Đọc lại từ đầu
            scanner.close();
            scanner = new Scanner(new File(filePath));

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] = scanner.nextInt();
                }
            }

            return array;
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
            return new int[0][0];  // Trả về mảng rỗng nếu có lỗi
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    // 4.Hiển thị mảng
    public static void displayArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // 5.Tính tổng các phần tử
    public static int sumArray(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int value : row) {
                sum += value;
            }
        }
        return sum;
    }

    // 6.Tìm số lớn nhất
    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int[] row : array) {
            for (int value : row) {
                max = Math.max(max, value);
            }
        }
        return max;
    }

    // 7.Tìm số nhỏ nhất
    public static int findMin(int[][] array) {
        int min = array[0][0];
        for (int[] row : array) {
            for (int value : row) {
                min = Math.min(min, value);
            }
        }
        return min;
    }

    // 8.Tìm vị trí phần tử lớn nhất
    public static int[] findMaxPosition(int[][] array) {
        int max = findMax(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == max) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    // 9.Tìm vị trí phần tử nhỏ nhất
    public static int[] findMinPosition(int[][] array) {
        int min = findMin(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == min) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    // 10.Tìm vị trí đầu tiên của n
    public static int[] findFirstOccurrence(int[][] array, int n) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == n) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    // 11.Tìm vị trí cuối cùng của n
    public static int[] findLastOccurrence(int[][] array, int n) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                if (array[i][j] == n) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    // 12.Hoán đổi hai phần tử
    public static void swapElements(int[][] array, int r1, int c1, int r2, int c2) {
        int temp = array[r1][c1];
        array[r1][c1] = array[r2][c2];
        array[r2][c2] = temp;
    }

    /*
        Cách giải bài tập
        1. Xây dựng các hàm xử lý mảng hai chiều như yêu cầu đề bài.
        2. Dùng `Scanner` để nhập dữ liệu từ bàn phím hoặc file.
        3. Thực hiện các phép toán tìm kiếm, tính tổng, hoán đổi trên mảng.
        4. Hiển thị kết quả ra màn hình.
    */

}
