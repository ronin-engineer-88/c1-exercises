package _01_Java_Introduce;

public class Exercise07 {
    public static void main(String[] args) {
        System.out.println("Toc do trung binh = " + ((14 / 1.6) / ((45.0 * 60 + 30) / 3600)));
    }
}

/*
Công thức tính toán:
    1 dặm = 1.6 km
    Thời gian chạy tính theo giờ: T = (45 phút 30 giây) / 60
    Quãng đường chạy theo dặm: D = 14 km / 1.6
    Tốc độ trung bình (dặm/giờ): V = D / T
*/
