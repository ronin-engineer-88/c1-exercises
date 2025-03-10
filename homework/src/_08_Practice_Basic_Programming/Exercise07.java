package _08_Practice_Basic_Programming;

public class Exercise07 {
    public static void main(String[] args) {

        String a = "3c6b9a0e8d3a9c8o0e9b83d60eab9bcd6o8a0e6c3b9a98c3dbe0o803e6cba98d60o39a0e6cb98a3dbe0o3c8d960eb9a6";

        int[] countElement = countNumChars(a);
        int x = countElement[1];
        int y = countElement[0];

        System.out.printf("Số lương ký tự chữ (a-z) của chuỗi a là: x = %d\n", x);
        System.out.printf("Số lương ký tự số (0-9) của chuỗi a là: y = %d\n", y);
        System.out.printf("Kết quả (y+x)%%7 là: %d\n", (y+x)%7);
    }

    public static int[] countNumChars(String str) {
        int[] countChar = new int[2];

        for (int i = 0; i < str.length(); i++) {
            if (
                    str.charAt(i) == '0' ||
                    str.charAt(i) == '1' ||
                    str.charAt(i) == '2' ||
                    str.charAt(i) == '3' ||
                    str.charAt(i) == '4' ||
                    str.charAt(i) == '5' ||
                    str.charAt(i) == '6' ||
                    str.charAt(i) == '7' ||
                    str.charAt(i) == '8' ||
                    str.charAt(i) == '9'
            ) {
                countChar[0]++;
            } else if (
                    str.charAt(i) == 'a' ||
                    str.charAt(i) == 'b' ||
                    str.charAt(i) == 'c' ||
                    str.charAt(i) == 'd' ||
                    str.charAt(i) == 'e' ||
                    str.charAt(i) == 'f' ||
                    str.charAt(i) == 'g' ||
                    str.charAt(i) == 'h' ||
                    str.charAt(i) == 'i' ||
                    str.charAt(i) == 'j' ||
                    str.charAt(i) == 'k' ||
                    str.charAt(i) == 'l' ||
                    str.charAt(i) == 'm' ||
                    str.charAt(i) == 'n' ||
                    str.charAt(i) == 'o' ||
                    str.charAt(i) == 'p' ||
                    str.charAt(i) == 'q' ||
                    str.charAt(i) == 'r' ||
                    str.charAt(i) == 's' ||
                    str.charAt(i) == 't' ||
                    str.charAt(i) == 'u' ||
                    str.charAt(i) == 'v' ||
                    str.charAt(i) == 'w' ||
                    str.charAt(i) == 'x' ||
                    str.charAt(i) == 'y' ||
                    str.charAt(i) == 'z'
            ) {
                countChar[1]++;
            }
        }

        return countChar;
    }

    /*
        - Cho một chuỗi
           String a = "3c6b9a0e8d3a9c8o0e9b83d60eab9bcd6o8a0e6c3b9a98c3dbe0o803e6cba98d60o39a0e6cb98a3dbe0o3c8d960eb9a6"
        - Gọi x là số lượng ký tự chữ (a-z) có trong chuỗi
        - Gọi y là số lượng ký tự số (0-9) có trong chuỗi.
        - Nhiệm vụ của bạn là tính (y+x)%7.
        - Input: Chuỗi ký tự a như trên
        - Output: In ra kết quả (y+x)%7
    */
}
