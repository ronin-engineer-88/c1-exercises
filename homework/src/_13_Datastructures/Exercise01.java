package _13_Datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise01 {
    private ArrayList<Integer> numbers = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Thêm số mới
    public void addNumber() {
        System.out.print("Nhập số cần thêm: ");
        int number = scanner.nextInt();
        numbers.add(number);
        System.out.println("Đã thêm số " + number + " thành công!");
    }

    // Sửa số tại vị trí
    public void editNumber() {
        if (numbers.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        viewNumbers();
        System.out.print("Nhập vị trí cần sửa (0 đến " + (numbers.size() - 1) + "): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < numbers.size()) {
            System.out.print("Nhập giá trị mới: ");
            int newValue = scanner.nextInt();
            numbers.set(index, newValue);
            System.out.println("Đã sửa thành công!");
        } else {
            System.out.println("Vị trí không hợp lệ!");
        }
    }

    // Xóa số tại vị trí
    public void deleteNumber() {
        if (numbers.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        viewNumbers();
        System.out.print("Nhập vị trí cần xóa (0 đến " + (numbers.size() - 1) + "): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < numbers.size()) {
            int removedNumber = numbers.remove(index);
            System.out.println("Đã xóa số " + removedNumber + " thành công!");
        } else {
            System.out.println("Vị trí không hợp lệ!");
        }
    }

    // Xem danh sách số
    public void viewNumbers() {
        if (numbers.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        System.out.println("Danh sách các số:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Vị trí " + i + ": " + numbers.get(i));
        }
    }

    // Menu
    public void run() {
        while (true) {
            System.out.println("\n=== QUẢN LÝ DANH SÁCH SỐ ===");
            System.out.println("1. Thêm số");
            System.out.println("2. Sửa số");
            System.out.println("3. Xóa số");
            System.out.println("4. Xem danh sách");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNumber();
                    break;
                case 2:
                    editNumber();
                    break;
                case 3:
                    deleteNumber();
                    break;
                case 4:
                    viewNumbers();
                    break;
                case 5:
                    System.out.println("Tạm biệt!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    public static void main(String[] args) {
        Exercise01 manager = new Exercise01();
        manager.run();
    }
}

