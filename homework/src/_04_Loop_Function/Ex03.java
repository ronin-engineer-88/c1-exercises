package _04_Loop_Function;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh (>=2): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n < 2) {
            System.out.println("Số lượng học sinh phải >= 2.");
            scanner.close();
            return;
        }

        String topStudent = "";
        double topScore = Double.NEGATIVE_INFINITY; // value nhỏ nhất kiểu double
        String secondStudent = "";
        double secondScore = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập họ tên học sinh " + i + ": ");
            String name = scanner.nextLine();
            System.out.print("Nhập điểm của " + name + ": ");
            double score = scanner.nextDouble();
            scanner.nextLine();

            if (score > topScore) {
                secondScore = topScore;
                secondStudent = topStudent;
                topScore = score;
                topStudent = name;
            } else if (score > secondScore) {
                secondScore = score;
                secondStudent = name;
            }
        }
        scanner.close();

        System.out.println("Học sinh có điểm cao nhất: " + topStudent + " (Điểm: " + topScore + ")");
        System.out.println("Học sinh có điểm cao thứ hai: " + secondStudent + " (Điểm: " + secondScore + ")");
    }
}

/*
    1. Đọc số lượng học sinh, sau đó dùng vòng lặp để nhập tên và điểm từng học sinh.
    2. Cập nhật biến topStudent và secondStudent dựa vào điểm số.
    3. In ra kết quả sau khi nhập xong.
*/