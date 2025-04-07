package _13_Datastructures.Exercise06;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static final String FILE_NAME = "src/_13_Datastructures/Exercise06/students.txt";


    public static void main(String[] args) {
        loadFromFile();

        while (true) {
            System.out.println("\n======= MENU =======");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Hiển thị danh sách sinh viên");
            System.out.println("5. Sắp xếp danh sách");
            System.out.println("6. Tìm sinh viên theo mã");
            System.out.println("7. Thoát");
            System.out.print("Nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> editStudent();
                case 3 -> removeStudent();
                case 4 -> showStudents();
                case 5 -> sortMenu();
                case 6 -> findStudent();
                case 7 -> {
                    saveToFile();
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }

    private static void addStudent() {
        System.out.print("Nhập mã SV: ");
        String id = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập điểm TB: ");
        double gpa = Double.parseDouble(sc.nextLine());
        students.add(new Student(id, name, age, gpa));
        System.out.println("Đã thêm.");
    }

    private static void editStudent() {
        System.out.print("Nhập mã SV cần sửa: ");
        String id = sc.nextLine();
        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.print("Tên mới: ");
                s.setName(sc.nextLine());
                System.out.print("Tuổi mới: ");
                s.setAge(Integer.parseInt(sc.nextLine()));
                System.out.print("Điểm TB mới: ");
                s.setGpa(Double.parseDouble(sc.nextLine()));
                System.out.println("Đã sửa.");
                return;
            }
        }
        System.out.println("Không tìm thấy SV.");
    }

    private static void removeStudent() {
        System.out.print("Nhập mã SV cần xóa: ");
        String id = sc.nextLine();
        students.removeIf(s -> s.getId().equals(id));
        System.out.println("Đã xóa nếu tìm thấy.");
    }

    private static void showStudents() {
        System.out.println("\n== Danh sách sinh viên ==");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private static void sortMenu() {
        System.out.println("1. Theo tên (A-Z)");
        System.out.println("2. Theo điểm TB tăng dần");
        System.out.println("3. Theo điểm TB giảm dần");
        int opt = Integer.parseInt(sc.nextLine());

        switch (opt) {
            case 1 -> sortByName();
            case 2 -> sortByGpaAscending();
            case 3 -> sortByGpaDescending();
            default -> System.out.println("Lựa chọn không hợp lệ.");
        }
        System.out.println("Đã sắp xếp.");
    }

    private static void findStudent() {
        System.out.print("Nhập mã SV cần tìm: ");
        String id = sc.nextLine();
        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Không tìm thấy.");
    }

    private static void saveToFile() {
        try (PrintWriter writer = new PrintWriter(FILE_NAME)) {
            for (Student s : students) {
                writer.println(s.getId() + "|" + s.getName() + "|" + s.getAge() + "|" + s.getGpa());
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    private static void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\|");
                if (parts.length == 4) {
                    String id = parts[0];
                    String name = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    double gpa = Double.parseDouble(parts[3]);
                    students.add(new Student(id, name, age, gpa));
                }
            }
        } catch (Exception e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }

    private static void sortByName() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getName().compareTo(students.get(j).getName()) > 0) {
                    // Đổi chỗ
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }

    private static void sortByGpaAscending() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getGpa() > students.get(j).getGpa()) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }

    private static void sortByGpaDescending() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getGpa() < students.get(j).getGpa()) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }

}
