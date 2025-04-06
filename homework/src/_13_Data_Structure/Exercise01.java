package _13_Data_Structure;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Thêm số");
            System.out.println("2. Sửa số");
            System.out.println("3. Xóa số");
            System.out.println("4. Xem danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số cần thêm: ");
                    int newNumber = scanner.nextInt();
                    numbers.add(newNumber);
                    System.out.println("Đã thêm số " + newNumber);
                    break;
                case 2:
                    System.out.print("Nhập vị trí muốn sửa (bắt đầu từ 0): ");
                    int indexToEdit = scanner.nextInt();
                    if (indexToEdit >= 0 && indexToEdit < numbers.size()) {
                        System.out.print("Nhập số mới: ");
                        int updatedNumber = scanner.nextInt();
                        numbers.set(indexToEdit, updatedNumber);
                        System.out.println("Đã cập nhật số tại vị trí " + indexToEdit);
                    } else {
                        System.out.println("Vị trí không hợp lệ.");
                    }
                    break;
                case 3:
                    System.out.print("Nhập vị trí muốn xóa (bắt đầu từ 0): ");
                    int indexToRemove = scanner.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < numbers.size()) {
                        int removedNumber = numbers.remove(indexToRemove);
                        System.out.println("Đã xóa số " + removedNumber + " khỏi danh sách.");
                    } else {
                        System.out.println("Vị trí không hợp lệ.");
                    }
                    break;
                case 4:
                    System.out.println("Danh sách các số:");
                    if (numbers.isEmpty()) {
                        System.out.println("(Danh sách trống)");
                    } else {
                        for (int i = 0; i < numbers.size(); i++) {
                            System.out.println(i + ": " + numbers.get(i));
                        }
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
