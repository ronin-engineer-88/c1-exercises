package _04_Loop_Function;

public class Ex12 {
    public static void main(String[] args) {
        System.out.println("Danh sách các số hoàn hảo nhỏ hơn 10000 là: ");
        for (int i = 0; i < 10_000; i++) {
            if (isPerfectNumber(i))
                System.out.println(i);
        }
    }

    public static boolean isPerfectNumber(int n) {
        int sumDivisor = 0;
        for (int i = 1 ; i < n; i++) {
            if(n % i == 0) {
                sumDivisor += i;
            }
        }

        return sumDivisor == n;
    }

    /*
        - Duyệt tất cả các số từ 1 đến 10000 để tìm số hoàn hảo.
        - Một số hoàn hảo là số có tổng tất cả các ước số của nó (trừ chính nó) bằng chính nó.
        - Hàm isPerfectNumber():
            + Khởi tạo biến sumDivisor để lưu tổng các ước số.
            + Duyệt tất cả các số từ 1 đến number - 1, nếu là ước số thì cộng vào sumDivisor.
            + Nếu sumDivisor bằng number, trả về true (số đó là số hoàn hảo).
        - Nếu isPerfectNumber() trả về true, in ra số đó.
    */
}
