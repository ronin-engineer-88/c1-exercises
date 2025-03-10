package _08_Practice_Basic_Programming;

public class Exercise13 {
    public static void main(String[] args) {
        String a = "o1YL9F6TIEHt2kqnIB6ZD8mcx6Qk6cCs31miF1kbCsiiP71kfmbbkThJXFYDElVZfESZWqgyCxk3GozgdtxOglgoEfmt60xGAHbt";
        System.out.println("Ký tự xuất hiện nhiều nhất đầu tiên: " + findMostAppearingChar(a));
    }

    public static char findMostAppearingChar(String a) {
        int[] freq = new int[256];
        char mostFrequentChar = a.charAt(0);
        int maxFreq = 0;

        for (char c : a.toCharArray()) {
            freq[c]++;
            if (freq[c] > maxFreq) {
                maxFreq = freq[c];
                mostFrequentChar = c;
            }
        }
        return mostFrequentChar;
    }

    /*
        - Viết chương trình tìm ký tự đầu tiên xuất hiện nhiều nhất trong chuỗi String a.
        - Input: a = "o1YL9F6TIEHt2kqnIB6ZD8mcx6Qk6cCs31miF1kbCsiiP71kfmbbkThJXFYDElVZfESZWqgyCxk3GozgdtxOglgoEfmt60xGAHbt"
        - Output: In ra ký tự đầu tiên xuất hiện nhiều nhất
    */
}
