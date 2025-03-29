package _13_Datastructures;

import java.util.HashSet;
import java.util.Set;

public class Exercise03 {
    public static int countUniqueNumbers(int[] arr) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : arr) {
            numbers.add(num);
        }
        return numbers.size();
    }

    public static void main(String[] args) {
        // Ví dụ sử dụng
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Số lượng số khác nhau: " + countUniqueNumbers(numbers));

        int[] numbersWithDuplicates = {1, 2, 2, 3, 4};
        System.out.println("Số lượng số khác nhau: " + countUniqueNumbers(numbersWithDuplicates));
    }
}
