package _01_Java_Introduce;

public class Exercise12 {
    public static void main(String[] args) {

        /*
            * Phân tích số 538 thành các chữ số:
            * Chữ số hàng trăm: 538/100
            * Chữ số hàng chục: (538%100)/10
            * Chữ số hàng đơn vị: 538%10
         */

        System.out.printf(
                "Tổng các chữ số của số 538 là: %d",
                538/100 + (538%100)/10 + 538%10);
    }
}
