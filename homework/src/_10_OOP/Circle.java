package _10_OOP;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Phương thức tính chu vi
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức in kết quả
    public void printInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + getCircumference());
        System.out.println("Area: " + getArea());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.printInfo();
    }
}

// Đề bài: Khai báo một lớp Circle, có thuộc tính là radius, viết hàm tính chu vi, diện tích của hình tròn đó và in kết quả ra màn hình.