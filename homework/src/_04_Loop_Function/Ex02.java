package _04_Loop_Function;

public class Ex02 {
    public static void main(String[] args) {

        double tuition = 10_000.0;
        double interest = 0.05;
        double sumTuition = 0.0;

        for (byte i = 0; i < 14; i++) {
            tuition += tuition*interest;
            if(i < 10)
                System.out.printf(
                        "Học phí sau %d năm là: %.2f\n",
                        i+1,
                        tuition
                );
            if(i >= 10)
                sumTuition += tuition;
        }

        System.out.printf(
                "Tổng học phí sau bốn năm bắt đầu từ năm thứ 11 là: %.2f\n",
                sumTuition
        );
    }

    /*
        Khởi tạo học phí ban đầu là 10.000$, tăng 5% mỗi năm.
        Dùng vòng lặp for chạy 14 năm để cập nhật học phí từng năm.
        In ra học phí của 10 năm đầu tiên.
        Cộng dồn học phí từ năm thứ 11 đến 14.
        In tổng học phí 4 năm cuối ra màn hình.
    */
}
