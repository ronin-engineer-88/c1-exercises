package _14_Generics;

import java.util.Arrays;

public class Exercise02 {
    public static <T> void swap(T[] array, int i, int j) {
        if (i >= 0 && i < array.length && j >= 0 && j < array.length) {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        } else {
            throw new IndexOutOfBoundsException("Chỉ số hoán đổi không hợp lệ");
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Trước khi chuyển đổi: " + Arrays.toString(numbers));
        swap(numbers, 2, 4);
        System.out.println("Sau khi chuyển đổi: " + Arrays.toString(numbers));
    }
}
