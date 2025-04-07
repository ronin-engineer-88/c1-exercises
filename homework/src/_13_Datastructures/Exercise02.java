package _13_Datastructures;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> wordCount = new HashMap<>();

        System.out.print("Nhập vào một đoạn văn: ");
        String text = scanner.nextLine();

        // Tách từ bằng dấu cách
        String[] words = text.split(" ");

        for (String word : words) {
            if (word.isEmpty()) continue;

            // Nếu từ đã có, tăng số đếm lên 1. Nếu chưa có, thêm vào map với giá trị 1
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("\nSố lần xuất hiện của các từ:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }

        scanner.close();
    }
}
