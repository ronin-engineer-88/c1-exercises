package _13_Data_Structure;

import java.util.HashSet;
import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> uniqueNumbers = new HashSet<>();

        System.out.print("Nhập số lượng phần tử: ");
        int n = scanner.nextInt();

        System.out.println("Nhập các số (cách nhau bằng Enter):");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            uniqueNumbers.add(num); // HashSet tự loại bỏ các phần tử trùng
        }

        System.out.println("Số lượng các số khác nhau là: " + uniqueNumbers.size());
        System.out.println("Các số khác nhau là: " + uniqueNumbers);

        scanner.close();
    }
}
