package _04_Loop_Function;

public class Ex05 {
    public static void main(String[] args) {
        int n = 0;
        while ((n + 1) * (n + 1) * (n + 1) < 12000) {
            n++;
        }
        System.out.println("Số nguyên n lớn nhất sao cho n^3 < 12000 là: " + n);
    }
}
/*
1. Sử dụng vòng lặp while để tăng dần n cho đến khi (n+1)³ không còn nhỏ hơn 12000.
2. In ra n khi vòng lặp dừng.
*/
