package _04_Loop_Function;


public class Ex06 {
    public static void main(String[] args) {
        System.out.println("Tất cả các số nguyên tố trong khoảng từ [2, 1000] là: ");
        System.out.println(2);
        for (int i = 3; i < 1000; i+=2) {
            boolean flag = true;
            for (int j = 3; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(i);
        }
    }

}

