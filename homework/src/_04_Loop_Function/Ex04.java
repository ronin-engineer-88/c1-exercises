package _04_Loop_Function;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println("Danh sách các số chia hết cho 5 hoặc cho 6 " +
                "(không phải chia hết cả hai) trong khoảng [100, 200] là: ");
        for (int i = 100; i <= 200; i++) {
            if((i % 5 == 0 || i % 6 == 0)
                    && !(i % 5 == 0 && i % 6 == 0))
                System.out.println(i);

        }
    }
}

/*
    Duyệt các số trong khoảng từ 100 đến 200.
    Kiểm tra số đó có chia hết cho 5 hoặc chia hết cho 6.
    Loại bỏ các số chia hết cho cả 5 và 6 cùng lúc.
    In ra các số thỏa mãn điều kiện.
*/