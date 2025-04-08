package _14_Generics;

import java.util.Arrays;
import java.util.List;

public class Exercise03 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        int count = countOccurrences(words, "apple");
        System.out.println("Số lần 'apple' xuất hiện: " + count);
    }

    public static <T> int countOccurrences(List<T> list, T element) {
        int count = 0;

        for (T item : list) {
            if (item == null && element == null) {
                count++;
            } else if (item != null && item.equals(element)) {
                count++;
            }
        }

        return count;
    }
}
