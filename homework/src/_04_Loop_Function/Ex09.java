package _04_Loop_Function;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dãy số nguyên không âm (nhập số âm để dừng):");

        int largest = -1;
        int secondLargest = -1;

        while (true) {
            int num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        scanner.close();

        if (secondLargest == -1) {
            System.out.println("Không có số lớn thứ hai trong dãy.");
        } else {
            System.out.println("Số lớn thứ hai là: " + secondLargest);
        }
    }
}
