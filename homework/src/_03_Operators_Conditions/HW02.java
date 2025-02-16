package _03_Operators_Conditions;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int num = scanner.nextInt();
        scanner.close();

        // Kiểm tra chẵn/lẻ
        if (num % 2 == 0) {
            System.out.println("Số " + num + " là số chẵn.");
        } else {
            System.out.println("Số " + num + " là số lẻ.");
        }

        // Kiểm tra âm/dương
        if (num > 0) {
            System.out.println("Số " + num + " là số dương.");
        } else if (num < 0) {
            System.out.println("Số " + num + " là số âm.");
        } else {
            System.out.println("Số " + num + " là số 0.");
        }
    }
}
/*
    Nếu số đó chia hết cho 2, thì là chẵn, ngược lại là lẻ.
    Nếu số đó lớn hơn 0, thì là số dương, nhỏ hơn 0 là số âm, còn lại là số 0.
*/
