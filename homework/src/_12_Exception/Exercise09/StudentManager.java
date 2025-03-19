package _12_Exception.Exercise09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> studentList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.menu();
    }

    // add student
    public void addStudent() {
        try {
            System.out.print("Nhập tên sinh viên: ");
            String name = scanner.nextLine();
            if (name == null || name.trim().isEmpty()) {
                throw new NullPointerException("Tên sinh viên không được để trống!");
            }

            System.out.print("Nhập ID sinh viên: ");
            int id = Integer.parseInt(scanner.nextLine());

            studentList.add(new Student(name, id));
            System.out.println("Đã thêm sinh viên thành công!");
        } catch (NullPointerException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: ID phải là số nguyên!");
        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        }
    }

    // remove sinh viên theo chỉ số
    public void removeStudent() {
        try {
            if (studentList.isEmpty()) {
                throw new EmptyListStudentException("Danh sách sinh viên rỗng, không thể xóa!");
            }

            System.out.print("Nhập chỉ số sinh viên cần xóa (0 - " + (studentList.size() - 1) + "): ");
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0 || index >= studentList.size()) {
                throw new IndexOutOfBoundsException("Chỉ số không hợp lệ!");
            }

            Student removedStudent = studentList.remove(index);
            System.out.println("Đã xóa sinh viên: " + removedStudent);
        } catch (EmptyListStudentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Chỉ số phải là số nguyên!");
        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        }
    }

    // Show list student
    public void displayStudents() {
        try {
            if (studentList.isEmpty()) {
                throw new EmptyListStudentException("Danh sách sinh viên rỗng!");
            }

            System.out.println("Danh sách sinh viên:");
            for (int i = 0; i < studentList.size(); i++) {
                System.out.println(i + ". " + studentList.get(i));
            }
        } catch (EmptyListStudentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        }
    }

    // Menu chính
    public void menu() {
        while (true) {
            System.out.println("\n=== Quản lý danh sách sinh viên ===");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng (1-4): ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        removeStudent();
                        break;
                    case 3:
                        displayStudents();
                        break;
                    case 4:
                        System.out.println("Thoát chương trình!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, chọn lại (1-4)!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên!");
            }
        }
    }
}
