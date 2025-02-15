package _02_Variable_Data_Type;

import java.util.Scanner;

public class Console01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị inch muốn chuyển đổi sang cm: ");
        double inches = scanner.nextDouble();

        double centimeters = inches * 2.54; // convert inch -> cm (1 inch = 2.54cm)
        System.out.println(inches + " inch = " + centimeters + " cm");
        scanner.close();
    }
}
