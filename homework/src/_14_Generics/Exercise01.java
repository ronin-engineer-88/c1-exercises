package _14_Generics;

import java.util.ArrayList;

public class Exercise01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);

        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println(uniqueNumbers); // Kết quả: [1, 2, 3]
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();

        for (E element : list) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }
}
