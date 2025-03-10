package _08_Practice_Basic_Programming;

import java.util.Arrays;

public class Exercise11 {
    public static void main(String[] args) {
        int[] arr = {-1336439950, -1336439950, -1627142690, -1627142690, -1627142690, -580008775, 1590173078, -540904643, 259998404, 259998404, 1590173078, -1336439950, 1782288190, -580008775, -580008775, -580008775, 1782288190, -1080819275, -1627142690, -580008775, -944880215, 259998404, -1627142690, -580008775, -580008775, -580008775, 259998404, 1782288190, -580008775, -1336439950};
        System.out.println("Loại bỏ các phần tử lặp của mảng: ");
        int[] result = removeDuplicates(arr);
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
        if (result.length < 8)
            System.out.println("Mảng sau khi loại bỏ các phần tử lặp không có phần tử thứ 7");
        else
            System.out.printf("Phần tử thứ 7 của mảng sau khi loại bỏ các phần tử lặp là: %d", result[7]);
    }

    public static int[] removeDuplicates(int[] arr) {
        int index = 1;
        int[] nonDuplicateArr = new int[arr.length];
        nonDuplicateArr[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == nonDuplicateArr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                nonDuplicateArr[index] = arr[i];
                index++;
            }
        }


        return Arrays.copyOf(nonDuplicateArr, index);
    }

    /*
        - Viết chương trình loại bỏ các các số bị lặp lại trong mảng arr.
          Ví dụ {1, 2, 2, 3, 4, 3, 1} -> {1, 2, 3, 4}. Lưu ý thứ tự các số vẫn phải được đảm bảo.
        - Input: int[] arr = {-1336439950, -1336439950, -1627142690, -1627142690, -1627142690, -580008775, 1590173078, -540904643, 259998404, 259998404, 1590173078, -1336439950, 1782288190, -580008775, -580008775, -580008775, 1782288190, -1080819275, -1627142690, -580008775, -944880215, 259998404, -1627142690, -580008775, -580008775, -580008775, 259998404, 1782288190, -580008775, -1336439950};
        - Output: In ra giá trị arr[7] sau khi arr đã loại bỏ hết các phần tử trùng nhau.
    */

}
