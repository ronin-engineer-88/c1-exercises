package _04_Loop_Function;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số tiền bạn muốn rút: ");
        int T = scanner.nextInt();

        withDrawMoney(T);

    }

    public static void withDrawMoney(int money) {
        int num500 = 0;
        int num200 = 0;
        int num100 = 0;
        int num20 = 0;
        int num10 = 0;
        int num5 = 0;
        int num2 = 0;
        int num1 = 0;

        if(money >= 500) {
            num500 += money / 500;
            money = money % 500;
        }
        if(money >= 200) {
            num200 += money / 200;
            money = money % 200;
        }
        if(money >= 100) {
            num100 += money / 100;
            money = money % 100;
        }
        if(money >= 20) {
            num20 += money / 20;
            money = money % 20;
        }
        if(money >= 10) {
            num10 += money / 10;
            money = money % 10;
        }
        if(money >= 5) {
            num5 += money / 5;
            money = money % 5;
        }
        if(money >= 2) {
            num2 += money / 2;
            money = money % 2;
        }
        num1 = money;

        System.out.printf("Tổng số tờ 500: %d\n", num500);
        System.out.printf("Tổng số tờ 200: %d\n", num200);
        System.out.printf("Tổng số tờ 100: %d\n", num100);
        System.out.printf("Tổng số tờ 20: %d\n", num20);
        System.out.printf("Tổng số tờ 10: %d\n", num10);
        System.out.printf("Tổng số tờ 5: %d\n", num5);
        System.out.printf("Tổng số tờ 2: %d\n", num2);
        System.out.printf("Tổng số tờ 1: %d\n", num1);
    }

    /*
        Nhập vào số tiền cần rút.
        Xử lý từng mệnh giá theo thứ tự từ lớn đến nhỏ để tối ưu số tờ tiền.
        - Chia số tiền cho mệnh giá lớn nhất để lấy số tờ cần.
        - Cập nhật số tiền còn lại sau khi đã trừ đi số tiền đã lấy.
        - Tiếp tục với các mệnh giá nhỏ hơn.
        In ra số tờ tiền của từng mệnh giá.
    */
}


